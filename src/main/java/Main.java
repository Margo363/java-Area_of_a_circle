import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах:");
        int radius = scanner.nextInt();
        final double PI = 3.14;
        double area = calculateCircleArea(radius);
        double lenght = calculateCircleLenght(radius);
        System.out.println("Площадь круга: " + area + " см.кв.");
        System.out.println("Длина окружности: "  + lenght + " см.");
    }
    public static double calculateCircleArea(int radius) {
        final double PI = 3.14;
        return PI * radius * radius;
    }
    public static double calculateCircleLenght(int radius) {
        final double PI = 3.14;
        return 2 * PI * radius;
    }
}
