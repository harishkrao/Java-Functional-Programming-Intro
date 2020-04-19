
public class temperature {
    public static void main(String args[])
    {
        double fahrenheit = 70;
        double celsius;
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("The temperature in celsius is "+Double.toString(celsius));
    }
}