import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number =  ");
        int n = sc.nextInt();
        System.out.println("enter the position =  ");
        int pos = sc.nextInt();
        int BitMask = 1 << pos;

        int newn = BitMask | n;
        System.out.println("new number is = "+newn);
        sc.close();
    }
}