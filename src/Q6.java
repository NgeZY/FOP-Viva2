/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.util.Scanner;
import java.util.Arrays;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read input
        // "Read two lines of comma-separated integers"
        System.out.println("Enter first array (comma-separated):");
        String lineA = scanner.nextLine();
        
        System.out.println("Enter second array (comma-separated):");
        String lineB = scanner.nextLine();

        // 2. Parse input strings into integer arrays
        int[] arrayA = parseArray(lineA);
        int[] arrayB = parseArray(lineB);

        // 3. Display inputs (matching sample output style)
        System.out.println("Array A: " + Arrays.toString(arrayA).replace("[", "").replace("]", ""));
        System.out.println("Array B: " + Arrays.toString(arrayB).replace("[", "").replace("]", ""));

        // 4. Check logic and print result
        boolean result = isMirror(arrayA, arrayB);
        System.out.println("Mirror pattern: " + result);
        
        scanner.close();
    }

    /**
     * Checks if array B is a mirror pattern of array A.
     * Logic: A[i] must equal B[last - i]
     */
    public static boolean isMirror(int[] a, int[] b) {
        // Requirement: Both arrays must have the same length
        if (a.length != b.length) {
            return false;
        }

        int len = a.length;
        
        // Iterate through the array
        for (int i = 0; i < len; i++) {
            // Compare element at index 'i' in A
            // with element at index 'length - 1 - i' in B
            if (a[i] != b[len - 1 - i]) {
                return false; // Mismatch found
            }
        }

        return true; // Loop finished with no mismatches
    }

    /**
     * Helper method to convert a comma-separated string (e.g., "1, 2, 3") 
     * into an int array.
     */
    public static int[] parseArray(String line) {
        if (line == null || line.trim().isEmpty()) {
            return new int[0];
        }
        
        String[] tokens = line.split(",");
        int[] arr = new int[tokens.length];
        
        for (int i = 0; i < tokens.length; i++) {
            // trim() removes extra spaces before parsing
            arr[i] = Integer.parseInt(tokens[i].trim());
        }
        return arr;
    }
}