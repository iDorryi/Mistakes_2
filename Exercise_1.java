import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        System.out.println(check());
    }

    public static float check() {
        float number = 0;
        boolean flag = true;
        System.out.println("Введите дробное число : ");
        try (Scanner scan = new Scanner(System.in)) {
            while (flag) {
                String text = scan.nextLine();
                String[] a = text.split("\\.");
                if (a.length > 2 || a.length == 1 ||
                        !a[0].matches("[0-9]+") || !a[1].matches("[0-9]+")) {
                    System.out.println("Введите корректное значение !");
                } else {
                    scan.close();
                    flag = false;
                    number = Float.parseFloat(text);
                }
            }
        }
        return number;
    }
}