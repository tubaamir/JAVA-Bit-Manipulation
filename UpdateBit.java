import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number =  ");
        int n = sc.nextInt();
        System.out.println("enter the position =  ");
        int pos = sc.nextInt();
        System.out.println("Enter the bit you want to update");
        int bit = sc.nextInt();
        int BitMask = 1 << pos;

        if (bit == 1) {
            int newn = BitMask | n;
        System.out.println("new number is = "+newn);
        } else if ( bit == 0) {
            int newn = (~BitMask) & n;
            System.out.println("new number is = "+newn);
        } else {
            System.out.println("wrong inpput");
        }

        sc.close();
    }
}
