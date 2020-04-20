
public class randomdice {
    public static void main(String args[])
    {
        int roll1 = randomDice();
        int roll2 = randomDice();
        System.out.println(roll1);
        System.out.println(roll2);
    }
    public static int randomDice()
    {
        double randomNumber = Math.random() * 6;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
}