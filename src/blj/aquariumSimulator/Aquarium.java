package blj.aquariumSimulator;

public class Aquarium {


    private boolean isSweetWater;
    private int[][] sizeOfTank;



    public Aquarium(boolean isSweetWater, int sizeX, int sizeY){
        this.isSweetWater = isSweetWater;
        this.sizeOfTank = new int[sizeY][sizeX];
    }

    public int[][] getSizeOfAq(){
        return sizeOfTank;
    }

    public void setFishPosition(int x_Position, int y_Position){

         sizeOfTank[y_Position][x_Position] = 4 ;
    }



}
