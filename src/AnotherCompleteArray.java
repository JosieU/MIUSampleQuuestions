import java.util.Arrays;

public class AnotherCompleteArray {
    static int isCompleteArray(int []a){
        int startIndex = 0;
        int count = 0;
        int result = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                count++;
            }
        }
        int [] evenNumbers = new int[count];
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                evenNumbers[startIndex] = a[i];
                startIndex++;
            }
        
    }
    if(evenNumbers.length == 0) return 0;
        Arrays.sort(evenNumbers);
        int min = evenNumbers[0];
        int max = evenNumbers[evenNumbers.length-1];
        if(min == max)return 0;
        for(int j = min; j < max; j++){
            for(int i = 0; i < a.length; i++ ){
                if(a[i] == j){
                    result = 1;
                    break;
                    }
                if(a[i]!= j && i== a.length-1){
                    result = 0;
                    return result;
                    }

        
            }
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println(isCompleteArray(new int[]{5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isCompleteArray(new int[]{5, 7, 9, 13} ));
        System.out.println(isCompleteArray(new int[]{2, 6, 3, 4} ));
    }
}