
public class timeofday {
    public static void main(String args[])
    {
        int time = 18;
        String timeOfDay = "";

        if(time < 0 || time > 24)
        {
            timeOfDay = "Invalid time value.";
        }
        else
        {
            if(time >= 5 && time < 12)
            {
                timeOfDay = "morning";
            }
            else if(time >= 12 && time < 20)
            {
                timeOfDay = "daytime";
            }
            else if(time >= 20)
            {
                timeOfDay = "night";
            }
        }
        System.out.println(timeOfDay);
    }
}