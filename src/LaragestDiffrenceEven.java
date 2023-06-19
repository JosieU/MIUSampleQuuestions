import java.util.Arrays;

public class LaragestDiffrenceEven {
    static int isLargestEvenNUmbers(int []a){
        int minEven = 0;
        int maxEven = 0;
        int count = 0;
        Arrays.sort(a);
        for(int i = 0; i < a.length;i++){
            if(a[i] % 2 == 0){
                count++;
            }
        }
        if(count < 1 ) return 0;
        for(int i = 0 ; i < a.length; i++){
            if(a[i] % 2 == 0){
                minEven = a[i];
                break;
            }
        }
        for(int i = a.length-1; i >= 0; i--){
            if(a[i] % 2 == 0){
                maxEven = a[i];
                break;
            }
        }
        return maxEven - minEven;
    }
    public static void main(String []args){
        System.out.println(isLargestEvenNUmbers(new int[]{1, 3, 5, 9}));
        System.out.println(isLargestEvenNUmbers(new int[]{2, 2, 2, 2}));
        System.out.println(isLargestEvenNUmbers(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }

    
}
