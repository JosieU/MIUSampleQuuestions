import java.util.Arrays;


public class AdjacentSum {
    static int isAdjcentSum(int [] a){
        int currentSum = 0;
        int adjacentSum = 0;
        for(int i = 0; i < a.length-1;i++){
            currentSum = a[i] + a[i+1];
            if(currentSum > adjacentSum){
                adjacentSum = currentSum;

            }
        }
        return adjacentSum;     
    }
    public static void main(String [] args){
        System.out.println(isAdjcentSum(new int[]{1, 2, 3, 4} ));
        System.out.println(isAdjcentSum(new int[]{18, -12, 9, -10}  ));
        System.out.println(isAdjcentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(isAdjcentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1}));
    }
            

    
}
