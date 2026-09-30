import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Välj ett alternativ: ");
        System.out.println("1. Hej");
        System.out.println("2. God morgon");
        System.out.println("3. God kväll");
        int message = scan.nextInt();

        switch (message) {
            case 1:
                System.out.println("Hej");
                break;
            case 2:
                System.out.println("God morgon");
                break;
            case 3:
                System.out.println("God kväll");
                break;

            default:
                System.out.println("Ogiltigt val! ");
        }

        int number = (int) (Math.random() * 100) + 1;
        System.out.println("Ditt slumpmässiga tal är: " + number);

    }

}