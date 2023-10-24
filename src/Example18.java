public class Example18 {
    public static void main(String[] args) {
        double a;
        double faceArea;
        double totalSurfaceArea;
        double volume;

        a = 5;

        faceArea = Math.pow(a, 2);
        totalSurfaceArea = 4 * Math.pow(a, 2);
        volume = Math.pow(a, 3);
        System.out.println("faceArea = " + faceArea);
        System.out.println("totalSurfaceArea = " + totalSurfaceArea);
        System.out.println("volume = " + volume);
    }
}
