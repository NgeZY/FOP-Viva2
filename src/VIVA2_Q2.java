import java.util.Scanner;

public class VIVA2_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter expression: ");
        String expression=sc.nextLine();

        if(isBalanced(expression)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }

    }

    public static boolean isBalanced(String s) {

        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count1++;
            }
            if (ch == ')') {
                count1--;
            }
            if (count1 < 0)
                return false;
        }
        return (count1 == 0);
    }
}


