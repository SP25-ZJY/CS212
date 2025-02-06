package lecture_note_4_5.dice;

import java.util.Objects;

/**
 * Dice class
 * CS 212
 * @author Zee
 */

public class Dice {
    private String name;
    private String color;
    /**
     * number of sides of the dice <br />
     * might be 2,3,4…
     */
    private int side;
    private int faceValue; /// Stores the value after a roll
    public static int totalDice = 0;
    public enum Color  { green, blue, black};

    public Dice(){
        name = "dice";
        color = "red";
        side = 6;
        faceValue = 0;
        totalDice++;
    }
    /**
     * Constructor with name, color and sides of the dice
     * @param name The name of the dice
     * @param color The initial color of the dice
     * @param side The number of sides of the dice
     */

    public Dice(String name, String color, int side ){
        this.name = name;
        this.color = color;
        this.side = side;
        faceValue = 0;
        totalDice++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String getName() {
        return name;
    }

    public int getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    /**
     * roll the dice <br />
     * i.e., roll the dice and get a random result
     * @return a randome number between 1 and sides (inclusive)
     */
    public int roll(){
        faceValue = (int) Math.round((Math.random()*100) % side + 1);
        return faceValue;
    }

    public boolean isEven(){
        return faceValue % 2 == 0;
    }

    public boolean isOdd(){
        return !isEven();
    }

    @Override
    public String toString() {
        return "Dice{ " +
                "name: " + name +
                " color: " + color +
                " side: " + side + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dice dice)) return false;
        return side == dice.side && Objects.equals(name, dice.name) && Objects.equals(color, dice.color);
    }

    public static int getTotalDice() {
        return totalDice;
    }
}
