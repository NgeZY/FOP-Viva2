import java.util.Scanner;

    public class Question5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Mode (C/D): ");
            char mode = scanner.nextLine().toUpperCase().charAt(0);


            System.out.print("Text: ");
            String text = scanner.nextLine();


            if (mode == 'C') {
                String result = compress(text);
                System.out.println("Result: " + result);
            } else if (mode == 'D') {
                String result = decompress(text);

                if (result == null) {
                    System.out.println("Invalid encoding.");
                } else {
                    System.out.println("Result: " + result);
                }
            } else {
                System.out.println("Invalid mode selected.");
            }
        }


        public static String compress(String s) {
            if (s == null || s.isEmpty()) return "";

            StringBuilder sb = new StringBuilder();
            int count = 0;


            for (int i = 0; i < s.length(); i++) {
                count++;


                if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                    sb.append(count);
                    sb.append(s.charAt(i));
                    count = 0;
                }
            }
            return sb.toString();
        }


        public static String decompress(String s) {
            if (s == null || s.isEmpty()) return "";

            StringBuilder sb = new StringBuilder();
            int length = s.length();
            int i = 0;

            while (i < length) {

                if (!Character.isDigit(s.charAt(i))) {
                    return null;
                }


                StringBuilder numStr = new StringBuilder();
                while (i < length && Character.isDigit(s.charAt(i))) {
                    numStr.append(s.charAt(i));
                    i++;
                }

                int count = Integer.parseInt(numStr.toString());


                if (i >= length) {
                    return null;
                }


                char targetChar = s.charAt(i);
                i++;


                for (int k = 0; k < count; k++) {
                    sb.append(targetChar);
                }
            }

            return sb.toString();
        }
    }

