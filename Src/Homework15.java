import java.util.Scanner;

public class Homework15 {



    public static void main(String[] args) {

        Burger burgerA = new Burger("Додали","Додали","Додали","Додали", "Додали",false);
        Burger burgerB = new Burger("Додали","Додали","Додали","Недодали","Додали");
        Burger burgerC = new Burger("Додали","Додали","Додали","Додали","Подвійне",true);

        Scanner scanner = new Scanner(System.in);
        while (true){
            menuBurger();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(burgerA);
                    break;
                case 2:
                    System.out.println(burgerB);
                    break;
                case 3:
                    System.out.println(burgerC);
                    break;
                default:
                    System.out.println("Ничего не вибрали");


            }
        }




    }

    public static void menuBurger(){
        System.out.println("1 Бургер з усіма компонентами");
        System.out.println("2 Дієтичний бургер");
        System.out.println("3 Бургер з подвійним м'ясом ");
    }

}


