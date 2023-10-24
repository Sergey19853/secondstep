public class Example19 {
    public static void main(String[] args) {
        //S = a²√3/4 - Площадь, r = a√3/6 - Радиус вписанной окружности, R = a√3/3 - Радиус описанной окружности.
        double side;
        double area;
        double inscribedRadius;
        double describedRadius;
        double height;

        side = 5;
        area = Math.pow(side, 2) * Math.sqrt(3) / 4;
        inscribedRadius = side * Math.sqrt(3) / 6;
        describedRadius = side * Math.sqrt(3) / 3;
        height = side * Math.sqrt(3) / 2;
        System.out.println("area = " + area);
        System.out.println("inscribedRadius = " + inscribedRadius);
        System.out.println("describedRadius = " + describedRadius);
        System.out.println("height = " + height);
    }
}
