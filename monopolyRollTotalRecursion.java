
public class monopolyRollTotalRecursion {
    public static void main(String[] args){
        int total = 0;
        int total_values = monopolyroll(total);
        System.out.println(total_values);
    }
    public static int monopolyroll(int running_total)
    {
        double dice1_raw = Math.random() * 10;
        double dice2_raw = Math.random() * 10;
        int doubles_count = 0;
        int max_doubles = 3;
        boolean first_double = false;
        int dice1 = (int) dice1_raw + 1;
        int dice2 = (int) dice2_raw + 1;
        running_total += dice1 + dice2;
        System.out.println(Integer.toString(dice1)+" "+Integer.toString(dice2));
        if(dice1 == dice2){
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
            else{
                return monopolyroll(running_total);
            }
        }
        return running_total;
    }
}