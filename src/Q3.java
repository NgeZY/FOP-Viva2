import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String ticket;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ticket number: ");
        ticket = sc.nextLine();

        if(isLuckyTicket(ticket)){
            int mid = ticket.length()/2;
            int first = 0;
            int last = 0;

            for(int i = 0; i < mid; i++)
                first += ticket.charAt(i)-'0';

            for(int i = ticket.length() - 1; i >= mid; i--)
                last += ticket.charAt(i)-'0';

            if(first == last)
                System.out.println("Lucky");
            else
                System.out.println("Unlucky");

        } else
            System.out.println("Invalid ticket number");
    }

    private static boolean isLuckyTicket(String ticket){
        if(ticket.length()%2 ==1)
            return false;
        for(int i = 0; i < ticket.length(); i++){
            if(!Character.isDigit(ticket.charAt(i)))
                return false;
        }

        return true;
    }
}
