public class UnaryOptr {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("value of a before "+a);
        
        b = a++;
        System.out.println("value of a after post increment  "+a);
        System.out.println("value of b after post increment  "+b);

        b = ++a;
        System.out.println("value of a after pree increment  "+a);
        System.out.println("value of b after pree increment  "+b);

        b = a--;
        System.out.println("value of a after post decrement  "+a);
        System.out.println("value of b after post decrement  "+b);

        b = --a;
        System.out.println("value of a after pree decrement  "+a);
        System.out.println("value of b after pree decrement  "+b);
    }
}
