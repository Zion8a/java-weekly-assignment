import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//Uppgift1
        System.out.println("Välj ett alternativ:");
        System.out.println("1: Hej!");
        System.out.println("2: God morgon!");
        System.out.println("3: God kväll!");
        System.out.println("Ditt val: ");
        int choice = scan.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Hej!");
                break;
            case 2:
                System.out.println("God morgon!");
                break;
            case 3:
                System.out.println("God kväll!");
                break;

            default:
                System.out.println("Ogiltigt val!");

        }
//Uppgift2


        int min = 1;
        int max = 100;
        int range = max - min + 1;
        //Plus ett eftersom vi vill ha med det första och sista
        int rand = (int) (Math.random() * range) + min;


        System.out.println("Ditt slumpmässiga tal är: " + rand);


        //Uppgift3
        System.out.println("Skriv in ett tal:");
        int number = scan.nextInt();

        int square = (int) Math.pow(number, 2);
        int sqrt = (int) Math.sqrt(number);
        int rounded = Math.round(number);
        System.out.println("Kvadraten: " + square);
        System.out.println("Kvadratroten: " + sqrt);
        System.out.println("Avrundat " + rounded);


    }
}


