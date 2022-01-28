package blj.aquariumSimulator;

import java.util.ArrayList;
import java.util.Scanner;

import static blj.aquariumSimulator.Aquarium.setFishPosition;



public class Fish {

    static ArrayList<Fish> fishes = new ArrayList<>();

    private static String name;
    private static int x_Position;
    private static int y_Position;
    private static boolean isSaltWater;
    private static String symbol = "3";

    public Fish(String name, int x_Position, int y_Position, boolean isSaltWaterwater, String symbol){
        this.name = name;
        this.x_Position = x_Position;
        this.y_Position = y_Position;
        this.isSaltWater = isSaltWaterwater;
        this.symbol = symbol;
    }

    public static void removeFish(){
        Aquarium.getSizeOfAq()[y_Position][x_Position] = "~";
    }

    public static void moveTo(int x, int y){
        Aquarium.getSizeOfAq()[y_Position][x_Position] = "~";
        setFishPosition(x, y);
    }

    public static String getFishSymbol(){
        return symbol;
    }

    public static int getXPosition(){
        return x_Position;
    }

    public static int getYPosition(){
        return y_Position;
    }


    public static Fish createFish(){
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


        fishes.add(new Fish(name = fishName, x_Position = FishX_Position, y_Position = FischY_Position, isSaltWater = livesInSaltWater, symbol = fishSymbol));
        return new Fish(name = fishName, x_Position = FishX_Position, y_Position = FischY_Position, isSaltWater = livesInSaltWater, symbol = fishSymbol);



    }

    public static void printAquarium(Aquarium myAquarium){
        for (int row = 0; row < Aquarium.getSizeOfAq().length; row++) {
            for (int col = 0; col < Aquarium.getSizeOfAq()[row].length; col++) {
                System.out.printf("%4s", Aquarium.getSizeOfAq()[row][col]);
            }
            System.out.println();
        }
    }

    public static void askForFisch() {
        while(1 == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Möchtets du einen Fisch hinzufügen?  Ja / Nein");
            if (!scanner.hasNext("Nein")) {
                createFish();
                setFishPosition(getXPosition(), getYPosition());

            }

            if (scanner.hasNext("Nein")) {
                break;
            }
        }
    }

}
