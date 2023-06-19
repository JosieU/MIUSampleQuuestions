import java.util.Arrays;


public class AdjacentSum {
    static int isAdjcentSum(int [] a){
        int sum; 
        int result = 0;
        int [] newArray = new int[a.length];
        int i = 0;
        while(i < a.length){
            if(i >= a.length -1){
                break;
            } 
            for(int j = i+1; j < a.length; j++){
                sum = a[i] + a[j];
                newArray[i] = sum;
               i++;
                

            }
        }
        Arrays.sort(newArray);
        result = newArray[newArray.length -1];
        return result;

        
            

    }
    public static void main(String [] args){
        System.out.println(isAdjcentSum(new int[]{1, 2, 3, 4} ));
        System.out.println(isAdjcentSum(new int[]{18, -12, 9, -10}  ));
        System.out.println(isAdjcentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(isAdjcentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }
            

    
}
