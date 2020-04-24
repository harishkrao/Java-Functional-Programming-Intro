public class factorial {
    public static void main(String[] args){
        int input = 5;
        System.out.println(input);
        int output = factorial_num(input);
        System.out.println(output);
    }
    public static int factorial_num(int num){
        int a = num;
        int fact = 1;
        while(a>0)
        {
            fact *= a;
            a-=1;
        }

        return fact;
    }

}