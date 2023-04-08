import java.util.Scanner;
public class PalindromNumber {
    public static void main(String[] args) {
        int temp,n,r,sum=0;
        Scanner ref = new Scanner(System.in);
        System.out.println("enter the number");
        n=ref.nextInt();

        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("it is palindrom");
        }else {
            System.out.println("it is not palindrom");
        }
    }
}
