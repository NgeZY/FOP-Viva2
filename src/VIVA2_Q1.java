import java.util.Scanner;
public class VIVA2_Q1   {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int number=sc.nextInt();

        while (number>=10){
            int sum=0;

            int temp=number;
            while (temp>0){
                int lastdigit=temp%10;
                sum=sum+lastdigit;
                temp=temp/10;
            }
            number=sum;
        }
        System.out.println("Digital root: "+ number );
    }
}
