public class Example13 {
    public static void main(String[] args) {
        double x1, x2, x3;
        double y1, y2, y3;

        double a;
        double b;
        double c;

        double p;
        double s;

        x1 = 1;
        x2 = 2;
        x3 = 3;
        y1 = 100;
        y2 = 110;
        y3 = 120;

        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y2 - y1, 2));
        c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("perimeter = " + p);
        System.out.println("area = " + s);
    }
}
