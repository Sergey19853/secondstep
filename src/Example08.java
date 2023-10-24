public class Example08 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        a = 1;
        b = 2;
        c = 3;

        double z;

        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("z = " + z);
    }
}
