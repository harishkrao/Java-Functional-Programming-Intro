
public class monopolyRollTotal {
    public static void main(String[] args){
        int b = rollDice();
        System.out.println(b);
    }
    public static int rollDice()
    {
        int total = 0;
        int max_dice_roll = 6;
        int[] rolledval = monopolyroll();
        int doubles_count = 0;
        int max_doubles = 3;
        boolean first_double = false;
        
        if(rolledval[0] <= max_dice_roll && rolledval[1] <= max_dice_roll)
            while(rolledval[0] == rolledval[1]){
                total += (rolledval[0] * 2);
                first_double = true;
                if(first_double == false)
                    first_double = true;
                else
                {
                    doubles_count += 1;
                }
                if(doubles_count >= max_doubles) {
                    return -1;
                }
            
                rolledval = monopolyroll();  
            }
            total += rolledval[0] + rolledval[1];
            first_double = false;
        
            
        return total;
    }
    public static int[] monopolyroll()
    {
        double dice1_raw = Math.random() * 10;
        double dice2_raw = Math.random() * 10;
        int dice1 = (int) dice1_raw + 1;
        int dice2 = (int) dice2_raw + 1;
        int[] rolled = {dice1, dice2};
        return rolled;
    }
}