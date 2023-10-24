public class Example10 {
    public static void main(String[] args) {
        double x;
        double y;

        double z;

        x = 3;
        y = 4;

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("z = " + z);
    }
}
