//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Здадча 1
        System.out.println("Здадча 1");

        byte clientOS=0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вааша операционна система не поддерживается приложением!");
        }

        //Здадча 2
        System.out.println("Здадча 2");
        int clientDeviceYear = 2015;

            if (clientDeviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else if (clientDeviceYear >= 2015 && clientOS == 0)   {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else if (clientDeviceYear >= 2015 && clientOS == 1)   {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        //Здадча 3
        System.out.println("Здадча 3");

         int year = 2021;
         if (year > 1584){
             System.out.println(year + " год не является високосным");
         } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
             System.out.println(year + " год является високосным");
         } else {
             System.out.println(year + " год не является високосным");
        }

        //Здадча 4
        System.out.println("Здадча 4");

         int deliveryDistance = 100;
         int deliveryDays = 1;
          if (deliveryDistance <= 20) {
              System.out.println("Дистанция в пределах " + deliveryDistance + " км занимает " + deliveryDays + " сутки");
          } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
              System.out.println("Дистанция в пределах " + deliveryDistance + " км занимает " + deliveryDays + " суток");
          } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
              deliveryDays += 2;
              System.out.println("Дистанция в пределах " + deliveryDistance + " км занимает " + deliveryDays + " суток");
          } else if (deliveryDistance > 100) {
              deliveryDays++;
              System.out.println("Дистанция свыше 100 км - доставка не производится, вам необходимо ее организовать самому!");
          }

        //Здадча 5
        System.out.println("Здадча 5");

          byte monthNumber = 13;

        switch (monthNumber){
            case 1,2,3:
              System.out.println("Зима");
              break;
            case 4,5,6:
                System.out.println("Весна");
                break;
            case 7,8,9:
                System.out.println("Лето");
                break;
            case 10,11,12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц указан не корректно! Нужно указать число от 1 до 12!");
        }

    }
}