import java.util.Scanner;
import java.util.Scanner.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        int m,flag=0;
        Scanner src = new Scanner(System.in);
        System.out.println("enter the number");
        int input = src.nextInt();

        m=input/2;
        if(input==0||input==1){
            System.out.println(input+ " is not a prime number ");
        }
        else{
            for (int i = 2; i <= m; i++) {
                if (input%i==0){
                    System.out.println(input + " is not prime number");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(input+ " is the primee number");
            }
        }


    }

}
