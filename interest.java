
public class interest {
    public static void main(String[] args){
        double balance = 10000;
        System.out.println(balance);
        int output = yearsTilOneMillion(balance);
        System.out.println(output);
    }
    public static int yearsTilOneMillion(double initialBalance) {
        double deposit = initialBalance;
        int years = 0;
        while(deposit <= 1000000){
            deposit = (0.05*deposit) + deposit;
            years += 1;
        }
        return years; 
        }
}