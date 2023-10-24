public class Example11 {
    public static void main(String[] args) {
        double a;
        double b;

        double perimeter;
        double area;

        a = 5;
        b = 6;

        perimeter = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
        area = (a * b) / 2;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
