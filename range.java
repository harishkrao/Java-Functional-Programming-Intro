
public class range {
    public static void main(String[] args){
        int[] input = {1, 0, 2, 3, -1, 2};
        System.out.println(input);
        int output = findRange(input);
        System.out.println(output);
    }
    public static int findRange(int[] intArray){
        int result = 0;
        int largest = -999999;
        int smallest = 999999;
        int arraylength = intArray.length;
        // System.out.println(arraylength);
        if(arraylength == 0)
            result = -1;
        for(int i=0; i<arraylength; i++){
            // System.out.println(intArray[i]);
            if(intArray[i] < smallest){
                smallest = intArray[i];
            }
            if(intArray[i] > largest){
                largest = intArray[i];
            }
        }
        // System.out.println(smallest);
        // System.out.println(largest);
        if(smallest != -999999 && largest != 999999)
            result = largest - smallest;
  
        return result;
    }
}