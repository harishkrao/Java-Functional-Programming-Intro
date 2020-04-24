
public class longestString {
    public static void main(String[] args){
        String[] input = {"finding","the","longest","string","in","this","array"};
        System.out.println(input);
        String output = longestName(input);
        System.out.println(output);
    }
    public static String longestName(String[] names){
        int a = names.length;
        String longestName = names[0];
        for(int i=1; i<a; i++){
            if(names[0].length() < names[i].length()){
                longestName = names[i];
            }
        }

        return longestName;
    }

}