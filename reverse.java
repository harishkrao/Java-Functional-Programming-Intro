
public class reverse {
    public static void main(String[] args){
        String[] input = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        // System.out.println(input);
        printInReverse(input);
        // System.out.println(output);
    }
    public static void printInReverse(String[] weekdays){
        int weekdays_length = weekdays.length;
        // System.out.println(weekdays_length);
        for(int i=weekdays_length-1; i>=0; i--){
            System.out.println(weekdays[i]);
        }
        // return weekdays;
    }
}