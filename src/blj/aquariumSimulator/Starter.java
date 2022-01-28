package blj.aquariumSimulator;

import java.util.ArrayList;
import java.util.Scanner;

import static blj.aquariumSimulator.Fish.createFish;

public class Starter {
    public static void main(String[] args) {


        Aquarium myAquarium = new Aquarium(false, 4, 7);

        Fish.askForFisch();

        printAquarium(myAquarium);




    }

    public static void printAquarium(Aquarium myAquarium){
        for (int row = 0; row < Aquarium.getSizeOfAq().length; row++) {
            for (int col = 0; col < Aquarium.getSizeOfAq()[row].length; col++) {
                System.out.printf("%4s", Aquarium.getSizeOfAq()[row][col]);
            }
            System.out.println();
        }
    }


    public void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Was möchtest du machen?");
        System.out.println("---------------------------------------");
        System.out.println("Fische hinzufügen: [1]");
        System.out.println("Fische entfernen: [2]");
        System.out.println("Fische bewegen: [3]");
        System.out.println("Aquarium ausgeben: [4]");

        if (scanner.hasNext("1")){
            createFish();
        } else if (scanner.hasNext("2")){
            Fish.removeFish();
        } else if (scanner.hasNext("1")){

        }
    }



}
