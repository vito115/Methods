import java.time.LocalDate;

public class Main {

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installCorrectOS(int clientOS, int clientDeviseYear) {
        if (clientDeviseYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviseYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviseYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviseYear >= 2015 && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int smartDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах 20 км занимает сутки");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км занимает 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Доставка в пределах от 60 км до 100 км занимает 3 дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");

        leapYear(2021);

        System.out.println("Задача 2");

        installCorrectOS(0, 2015);

        System.out.println("Задача 3");

        smartDelivery(95);
    }
}