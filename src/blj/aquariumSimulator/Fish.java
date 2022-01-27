package blj.aquariumSimulator;

import javax.swing.text.Position;

public class Fish {
    private String name;
    private static int x_Position;
    private static int y_Position;
    private boolean isSaltWater;


    public Fish(){

    }

    public Fish(String name, int x_Position, int y_Position, boolean isSaltWaterwater){
        this.name = name;
        this.x_Position = x_Position;
        this.y_Position = y_Position;
        this.isSaltWater = isSaltWaterwater;


    }

    public void moveTo(int x, int y){
        x_Position = x;
        y_Position = y;
    }

    public static int getXPosition(){
        return x_Position;
    }

    public static int getYPosition(){
        return y_Position;
    }


}
