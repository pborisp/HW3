public class Main {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задача 1:");
        int age = 10;
        if (age >= 18) {
            System.out.println("Человеку "+age+" лет. Он совершеннолетний.");
        } else {
            System.out.println("Человеку "+age+" лет. Он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();

        // Задача №2
        System.out.println("Задача 2:");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов. Нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов. Можно идти без шапки.");
        }
        System.out.println();

        // Задача №3
        System.out.println("Задача 3:");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч. Придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч. Можно ездить спокойно.");
        }
        System.out.println();
    }
}