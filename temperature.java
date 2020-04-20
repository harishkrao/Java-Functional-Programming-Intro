
public class temperature {
    public static void main(String args[])
    {
        double fahrenheit = 93;
        printTemperature(fahrenheit);
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        /** 
        * Converts temperature value from fahrenheit units to celsius units
        * @param Temperature in Fahrenheit units
        * @return Equivalent temperature in Celsius units
         */
        double c = ((fahrenheit - 32) * 5)/9;
        return c;
    }
    public static void printTemperature(double fahrenheit)
    {
        /**
         * Prints temperature in Fahrenheit and Celsius units
         * @param Temperature in Fahrenheit units
         * @return void
         */
        // String str_fahrenheit = Double.toString(fahrenheit);
        // String str_celsius = Double.toString(fahrenheitToCelsius(fahrenheit));
        System.out.println("F: "+fahrenheit);
        System.out.println("C: "+fahrenheitToCelsius(fahrenheit));
    }
}