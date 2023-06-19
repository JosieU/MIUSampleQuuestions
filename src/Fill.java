import java.util.Arrays;

public class Fill {
    static int[] hasFilled(int []a, int k, int n){
        //int j = 0;
        int startIndex = 0;
        int [] newArray  = new int[n];
         for(int i = 0; i < newArray.length; i++){
            if(startIndex == a.length-1){
                break;
            }
            for(int j = 0; j < k; j++){
                if (startIndex < n){
                    newArray[startIndex] = a[j];
                    startIndex++;
                }
            }
         }
         return newArray;
    }
    public static void main (String []args){
        int []result = hasFilled(new int []{1,2,3,5, 9, 12,2,1}, 3, 10);
        System.out.println(Arrays.toString(result));       
    }
}
