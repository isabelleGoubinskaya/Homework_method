import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        int year = 2023;
        int currentYear = LocalDate.now().getYear();
        String OSversion = "ios";
        int distance = 15;
        leapYear(year);
        OSType(currentYear, OSversion);
        findDistance(distance);


    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void OSType(int clientDeviceYear, String OSversion) {
        if (OSversion == "ios" && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (OSversion == "ios" && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");

        }

        if (OSversion == "android" && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (OSversion == "android" && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");

        }
    }

    public static void findDistance(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 3");
        }
    }
}
