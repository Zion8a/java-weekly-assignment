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

        System.out.println("=== Java Övningar ===");

        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    // Övning 1: Läs in ett val och använd switch
    public static void exercise1() {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n=== Övning 1: Switch ===");
        System.out.println("Välj ett alternativ:");
        System.out.println("1. Hej");
        System.out.println("2. God morgon");
        System.out.println("3. God kväll");
        System.out.print("Ditt val: ");


        int choice = sc.nextInt();


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

        //Uppgift4
        //1. Slumpmässigt tal - Math.random()
        //2. Kvadrat - Math.pow()
        //3. Kvadratrot - Math.sqrt()
        //4. Avrunda - Math.round()
        //5. Avsluta

        System.out.println("Välj ett alternativ:");
        System.out.println("1: Slumpmässigt tal");
        System.out.println("2: Kvadrat");
        System.out.println("3: Kvadratrot");
        System.out.println("4: Avrunda");
        System.out.println("5: Avsluta");

        int menuChoice = scan.nextInt();
        switch (menuChoice) {

            case 1:
                int randomMenuNumber = (int) (Math.random() * range) + min;
                System.out.println("Slumpmässigt tal: " + randomMenuNumber);
                break;

            case 2:
                System.out.println("Skriv in ett tal:");
                double numberForSquare = scan.nextDouble();

                double squareResult = Math.pow(numberForSquare, 2);
                //Nya variabelnamn för att jag hade liknande i uppgift 3.

                System.out.println("Kvadraten är: " + squareResult);
                break;

            case 3:
                System.out.println("Skriv in ett tal:");
                double numberForSquareRoot = scan.nextDouble();

                double squareRootResult = Math.sqrt(numberForSquareRoot);

                System.out.println("Kvadratroten är: " + squareRootResult);
                break;

            case 4:
                System.out.println("Skriv in ett tal:");
                double numberForRound = scan.nextDouble();

                int roundedResult = (int) Math.round(numberForRound);

                System.out.println("Avrundat: " + roundedResult);
                break;

            case 5:
                System.out.println("Programmet avslutas.");
                break;

            default:
                System.out.println("Ogiltigt val.");
        }

    }

}


            default:
                System.out.println("Ogiltigt val!");
        }
    }

    // Övning 2: Slumpa ett heltal mellan 1 och 100
    public static void exercise2() {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("\n=== Övning 2: Slumpmässigt tal ===");
        System.out.println("Ditt slumpmässiga tal är: " + randomNumber);
    }

    // Övning 3: Beräkna kvadrat, kvadratrot och avrundning
    public static void exercise3() {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n=== Övning 3: Math ===");
        System.out.print("Skriv in ett tal: ");
        double number = sc.nextDouble();


        System.out.println("Kvadrat: " + Math.pow(number, 2));
        System.out.println("Kvadratrot: " + Math.sqrt(number));
        System.out.println("Avrundat: " + Math.round(number));
    }

    // Övning 4: Visa en meny tills användaren väljer att avsluta
    public static void exercise4() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n=== Övning 4: Meny ===");
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Slumpmässigt tal");
            System.out.println("2. Kvadrat");
            System.out.println("3. Kvadratrot");
            System.out.println("4. Avrunda");
            System.out.println("5. Avsluta");
            System.out.print("Ditt val: ");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    exercise2();
                    break;
                case 2:
                    System.out.print("Skriv in ett tal: ");
                    double squareNumber = sc.nextDouble();
                    System.out.println("Kvadrat: " + Math.pow(squareNumber, 2));
                    break;
                case 3:
                    System.out.print("Skriv in ett tal: ");
                    double rootNumber = sc.nextDouble();
                    System.out.println("Kvadratrot: " + Math.sqrt(rootNumber));
                    break;
                case 4:
                    System.out.print("Skriv in ett tal: ");
                    double roundNumber = sc.nextDouble();
                    System.out.println("Avrundat: " + Math.round(roundNumber));
                    break;
                case 5:
                    running = false;
                    System.out.println("Programmet avslutat!");
                    break;
                default:
                    System.out.println("Ogiltigt val!");
            }
        }
    }
}
