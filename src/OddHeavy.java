import java.util.Arrays;

public class OddHeavy {
    static int isOddHeavy(int []a){
        int startIndex1 = 0;
        int startIndex2 = 0;
        int result = 0;

        int []even = new int [a.length];
        int odd [] = new int [a.length];
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                even[startIndex1] = a[i];
                startIndex1++;
            }
            else{
                odd[startIndex2] = a[i];
                startIndex2++;
            }       
    }
     for(int i = 0; i < odd.length; i++){
        for(int j = 0; j < even.length; j++){
            if(odd[i] == 0){
                break;
            }
            if(even[j] < odd[i]){
                result = 1;
            }
            
            if(even[j] > odd[i]){
                return 0;
            }
        }

    }
    return result;
    
    
}
public static void main(String [] args){
    System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
    System.out.println(isOddHeavy(new int[]{1}));
    System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1} ));
    System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    System.out.println(isOddHeavy(new int[]{2}));
}
}
