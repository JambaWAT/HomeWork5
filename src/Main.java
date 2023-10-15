
public class Main {
    public static void main(String[] args) {
        {
            System.out.print("Задание1");
            int clientOS = 1;
            if (clientOS == 1)
                System.out.print("Установите версию приложения для Android по ссылке1");
            else if (clientOS == 0)
                System.out.print("Установите версию приложения для iOS по ссылке");
        }
        {
            System.out.print("Задание2");
            int clientDeviceYear = 2013;
            int clientOS2 = 0;
            if (clientOS2 == 1 && clientDeviceYear < 2015)
                System.out.print("Установите облегченную версию приложения для Android по ссылке");
            else if (clientOS2 == 1 && clientDeviceYear >= 2015)
                System.out.print("Установите версию приложения для Android по ссылке1");
            if (clientOS2 == 0 && clientDeviceYear < 2015)
                System.out.print("Установите облегченную версию приложения для ios по ссылке");
            else if (clientOS2 == 0 && clientDeviceYear >= 2015)
                System.out.print("Установите версию приложения для ios по ссылке1");
        }
        {
            System.out.print("Задание3");
            int year = 2020;
            if (year < 1583) System.out.println(year + " год не являеится високосным");
            else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.print(year + " год являеится високосным");
        }
        {
            System.out.print("Задание4");
            int deliveryDistance = 110;
            if (deliveryDistance <= 20) System.out.println("Доставка займет 1 день");
            else if (deliveryDistance > 20 && deliveryDistance <= 60) System.out.println("Доставка займет 2 дня");
            else if (deliveryDistance > 60 && deliveryDistance <= 100) System.out.println("Доставка займет 3 дня");
            else System.out.println("Доставка дальше 100 км не идет");

        }
        {
            System.out.print("Задание5 ");
            int monthNumber = 9;
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println(monthNumber + " принадлежит к сезону Зима");
                    break;
                case 3, 5, 4:
                    System.out.println(monthNumber + " принадлежит к сезону Весна");
                    break;
                case 6, 7, 8:
                    System.out.println(monthNumber + " принадлежит к сезону Лето");
                    break;
                case 9, 10, 11:
                    System.out.println(monthNumber + " принадлежит к сезону Осень");
                    break;


            }
        }
    }
}