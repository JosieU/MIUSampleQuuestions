import java.util.Arrays;

public class PairWiseSum {
    static int [] pairWise(int []a){ 
        int i = 0;
        int j =0;
        int sum = 0;
        int startInex = 0;
        int [] newArray = new int [a.length/2];
        if(a.length % 2 != 0 || a.length == 0){
            return null;
        }
        else{
           for(i = 0; i < a.length-1; i+=2){
                sum = a[i] + a[i+1];
                newArray[startInex] = sum;
                sum =0;
                startInex++;
                    
            }
        }
        return newArray;
    }
        
    
    public static void main(String [] args){
        int []result = pairWise(new int []{2, 1, 18, -5}  );
            System.out.println(Arrays.toString(result));
            
        
}
}
