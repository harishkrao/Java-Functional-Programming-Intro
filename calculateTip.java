
public class calculateTip {
    public static void main(String args[])
    {
        double bill_amount = 20.87;
        double total_bill = calculatetip(bill_amount) + bill_amount;
        System.out.println(total_bill);
    }
    public static double calculatetip(double meal_cost)
    {
        double tip;
        tip = meal_cost * 0.15;
        return tip;
    }
}