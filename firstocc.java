
public class firstocc {
    public static void main(String[] args){
        String[] sentence = {"Learning", "Java", "is", "fun."};
        System.out.println(sentence);
        int output = indexofFirstOccurrence(sentence, "Java");
        System.out.println(output);
    }
    public static int indexofFirstOccurrence(String[] stringArray, String target){
        for(int i=0; i<stringArray.length; i++){
            if(stringArray[i] == target)
            {
                return i;
            }
        }

        return -1;
    }

}