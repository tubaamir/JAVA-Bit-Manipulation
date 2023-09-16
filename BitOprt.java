public class BitOprt {
    public static void main(String[] args) {
        int a = 1100;
        int b = 0101;
        
        int c = a & b;
        System.out.println(c);

        int d = a | b;
        System.out.println(d);

        int e = ~a;
        System.out.println(e);
        
        int f = a << 1;
        System.out.println(f);

        int g = a >> 1;
        System.out.println(g);
    }
}
