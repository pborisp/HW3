public class Main {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задача 1:");
        int age = 10;
        if (age >= 18) {
            System.out.println("Человеку " + age + " лет. Он совершеннолетний.");
        } else {
            System.out.println("Человеку " + age + " лет. Он не достиг совершеннолетия, нужно немного подождать.");
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

        // Задача №4
        System.out.println("Задача 4:");
        age = 16;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " - то ему нужно ходить в детский сад.");
        } else if (age > 6 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " - то человеку нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " - то человеку нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " - то человеку нужно ходить на работу.");
        }
        System.out.println();

        // Задача №3
        System.out.println("Задача 3:");
        int speedtest = 100;
        if (speedtest > 60) {
            System.out.println("Если скорость " + speedtest + " км/ч. Придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedtest + " км/ч. Можно ездить спокойно.");
        }
        System.out.println();

        // Задача №5
        System.out.println("Задача 5:");
        age = 14;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " - то ему нельзя кататься на аттракционе.");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " - то ему можно кататься только в сопровождении взрослого. Без взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " - то ему можно кататься без сопровождения взрослого.");
        }
        System.out.println();

        // Задача №6
        System.out.println("Задача 6:");
        int place = 102;
        int seatPlace = 60;
        int freePlace;
        int passengers = 57;
        if (passengers > 60 && passengers < 102) {
            freePlace = place - passengers;
            System.out.println("В вагоне остались только стоячие места: " + freePlace + " шт.");
        } else if (passengers <= 60) {
            freePlace = place - passengers;
            System.out.println("В вагоне осталось " + freePlace + " мест, из них " + (seatPlace - passengers) + " сидячие места.");
        } else {
            System.out.println("Вагон полный, мест нет.");
        }
        System.out.println();

        // Задача №7
        System.out.println("Задача 7:");
        int one = 423;
        int two = 3452;
        int three = 1039;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чисел " + two + " и " + three);
        } else if (two > three && two > one) {
            System.out.println("Число " + two + " больше чисел " + one + " и " + three);
        } else {
            System.out.println("Число " + three + " больше чисел " + two + " и " + one);
        }
    }
}