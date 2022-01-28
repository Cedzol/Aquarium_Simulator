package blj.aquariumSimulator;

public class Aquarium {


    private boolean isSweetWater;
    private static String[][] sizeOfTank;



    public Aquarium(boolean isSweetWater, int sizeX, int sizeY){
        this.isSweetWater = isSweetWater;
        this.sizeOfTank = new String[sizeY][sizeX];
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                Aquarium.sizeOfTank[i][j] ="~";
            }
        }
    }

    public static String[][] getSizeOfAq(){
        return sizeOfTank;
    }

    public static void setFishPosition(int x_Position, int y_Position){
         sizeOfTank[y_Position][x_Position] = Fish.getFishSymbol();
    }




}
