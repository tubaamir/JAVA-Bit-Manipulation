import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number =  ");
        int n = sc.nextInt();
        System.out.println("enter the position =  ");
        int pos = sc.nextInt();
        int BitMask = 1 << pos;

        if ( (BitMask & n) == 0) {
            System.out.println(" number is zero");
        } else {
            System.out.println("number is 1 ");
        }
        sc.close();
    }
}
