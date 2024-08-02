public class Main {
    public static void main(String[] args) {
        int a = 6, b;
        b = a++;
        System.out.println("a++");
        System.out.println(a);
        System.out.println(b);
        int c = 6, d;
        d = ++c;
        System.out.println("++a");
        System.out.println(c);
        System.out.println(d);
    }
}