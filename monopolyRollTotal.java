
public class monopolyRollTotal {
    public static void main(String[] args){
        int b = rollDice();
        System.out.println(b);
    }
    public static int rollDice()
    {
        int total = 0;
        int[] rolledval = monopolyroll();
        
        if(rolledval[0] <= 6 && rolledval[1] == 6)
            while(rolledval[0] == rolledval[1]){
                total += (rolledval[0] * 2);
            
                rolledval = monopolyroll();  
            }
            total += rolledval[0] + rolledval[1];
        
            
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