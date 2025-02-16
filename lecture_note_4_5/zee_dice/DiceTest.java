package lecture_note_4_5.zee_dice;

public class DiceTest {
    public static void main(String[] args) {

        Dice d6 = new Dice();
        Dice d12 = new Dice(
                "12 Side",
                "Green",
                12
        );

        d6.roll();
        d12.roll();
        System.out.println(d6.getFaceValue());
        System.out.println(d12.getFaceValue());
        d12.setColor("Blue");
        System.out.println(d12.getColor());

        System.out.println(d6.isEven());
        System.out.println(d12.isOdd());

        System.out.println(d6);

        System.out.println(d6.equals(d12));

        System.out.println(Dice.getTotalDice());
    }
}
