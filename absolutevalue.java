
public class absolutevalue {
    public static void main(String args[])
    {
        double n = -5.5;
        double abs_n = absoluteValue(n);
        System.out.println(abs_n);

    }
    public static double absoluteValue(double input)
    {
        double abs_input; 
        if(input < 0)
        {
            abs_input = -input;
        }
        else
        {
            abs_input = input;
        }
        return abs_input;
            
    }
}