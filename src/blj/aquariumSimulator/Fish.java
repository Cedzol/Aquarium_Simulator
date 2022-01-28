package blj.aquariumSimulator;

import java.util.ArrayList;
import java.util.Scanner;

import static blj.aquariumSimulator.Aquarium.moveFishPosition;
import static blj.aquariumSimulator.Aquarium.setFishPosition;


public class Fish {

    static ArrayList<Fish> fishes = new ArrayList<>();

    private static String name;
    private static int x_Position;
    private static int y_Position;
    private static boolean isSaltWater;
    private static String symbol = "3";

    public Fish(String name, int x_Position, int y_Position, boolean isSaltWaterwater, String symbol) {
        this.name = name;
        this.x_Position = x_Position;
        this.y_Position = y_Position;
        this.isSaltWater = isSaltWaterwater;
        this.symbol = symbol;
    }

    public static void removeFish() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welchen Fisch möchtest du entfernen? Name: ");
        String fishNameToRemove = scanner.nextLine();

        fishes.removeIf(s -> s.equals(fishNameToRemove));

        Aquarium.getSizeOfAq()[y_Position][x_Position] = "~";

    }

    public static void moveTo() {

        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welchen Fisch möchtest du bewegen? Name: ");
        String fishNameToMove = scanner.nextLine();

        System.out.println("Zu welcher X Koordinate möchtest du den Fisch bewegen?");
        int x = scanner.nextInt();

        System.out.println("Zu welcher Y Koordinate möchtest du den Fisch bewegen?");
        int y = scanner.nextInt();
        Aquarium.getSizeOfAq()[y_Position][x_Position] = "~";

        moveFishPosition(x, y);
    }

    public static String getFishSymbol() {
        return symbol;
    }

    public static String getFishName() {
        return name;
    }


    public static int getXPosition() {
        return x_Position;
    }

    public static int getYPosition() {
        return y_Position;
    }

    public static boolean isIsSaltWater() {
        return isSaltWater;
    }

    public static Fish createFish() {


        Scanner sc = new Scanner(System.in);


        System.out.println("Geben sie den Namen des Fisches ein: ");
        String fishName = sc.next();

        System.out.println("Geben sie die X Position ein: ");
        int FishX_Position = sc.nextInt();

        System.out.println("Geben sie die Y Position ein: ");
        int FischY_Position = sc.nextInt();

        System.out.println("Salzwasser Fisch? (True/false)  ");
        boolean livesInSaltWater = sc.nextBoolean();


        System.out.println("Geben sie das Symbol des Fisches ein  ");
        String fishSymbol = sc.next();


        Fish newFish = new Fish(name = fishName, x_Position = FishX_Position, y_Position = FischY_Position, isSaltWater = livesInSaltWater, symbol = fishSymbol);


        return newFish;


    }

    public static void deadFish() {


        if (Aquarium.isSweetWater() && Fish.isSaltWater || !Aquarium.isSweetWater() && !Fish.isSaltWater) {
            System.out.println("Dein Fisch ist im falschen Wasser gestorben!");
            Aquarium.getSizeOfAq()[y_Position][x_Position] = "~";
            fishes.removeIf(s -> s.equals(Fish.createFish()));
        }




    }

    public static void askForFish() {
        while (1 == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Möchtets du einen weiteren Fisch hinzufügen?  Ja / Nein");
            if (!scanner.hasNext("Nein")) {
                createFish();
                setFishPosition(getXPosition(), getYPosition());
            }

            if (scanner.hasNext("Nein")) {
                break;
            }
        }
    }

    public static void menu() {


        int xcord = 0;
        int ycord = 0;

        while (1 == 1) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("---------------------------------------");
            System.out.println("Was möchtest du machen?");
            System.out.println("---------------------------------------");
            System.out.println("Fische hinzufügen: [1]");
            System.out.println("Fische entfernen: [2]");
            System.out.println("Fische bewegen: [3]");
            System.out.println("Aquarium ausgeben: [4]");
            System.out.println("---------------------------------------");

            if (scanner.hasNext("1")) {
                askForFish();
                deadFish();
            } else if (scanner.hasNext("2")) {
                Fish.removeFish();
            } else if (scanner.hasNext("3")) {
                moveTo();
            } else if (scanner.hasNext("4")) {
                Aquarium.printAquarium();
            }

            if (scanner.hasNext("quit")) {
                break;
            }
        }
    }


}
