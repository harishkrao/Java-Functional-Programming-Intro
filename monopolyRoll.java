
public class monopolyRoll {
    public static void main(String args[])
    {
        System.out.println(roll_dice());
    }
    public static int roll_dice()
    {
        int sides = 6;
        return random_doubles(sides);
    }
    public static int random_doubles(int s)
    {
        double one = Math.random() * s;
        double two = Math.random() * s;
        one = one + 1;
        two = two + 1;
        int one_int = (int) one;
        int two_int = (int) two;
        System.out.println(one_int);
        System.out.println(two_int);
        int result;
        if (one_int == two_int)
        {   
            result = random_doubles(s);
        }
        else
        {
            result = one_int + two_int;
        }
        return result;
    }

}