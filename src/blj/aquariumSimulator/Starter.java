package blj.aquariumSimulator;

public class Starter {
    public static void main(String[] args) {


        Fish Nemo = new Fish("Nemo", 3, 5, true);

        Fish Sali = new Fish("Sali", 1, 3, true);

        Aquarium myAquarium = new Aquarium(false, 4, 7);



        printAquarium(myAquarium);


    }

    public static void printAquarium(Aquarium myAquarium){
        for (int row = 0; row < myAquarium.getSizeOfAq().length; row++) {
            for (int col = 0; col < myAquarium.getSizeOfAq()[row].length; col++) {
                System.out.printf("%3d", myAquarium.getSizeOfAq()[row][col]);
            }
            System.out.println();
        }
    }


}
