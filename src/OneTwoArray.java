import java.util.Arrays;

public class OneTwoArray {
    static int isOneTwoArray(int []a){
        int result = 0;
        int count = 0;
        
        int count1 = 0;
        int count2 = 0;
        int hold = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1){
                count++;
            }
            if(a[i] > 2){
                result = 0;
                return result;

            }
        }
        if(a[0] ==1 && count % 2 == 0){
           for(int i = 0; i < a.length; i++){
                if(a[i] == 1){
                    count1++;
                }
                if(a[i] == 2) {
                    break;
                }

                }
            
            for(int i = a.length-1; i >= 0; i--){
                if(a[i] == 1){
                    count2++;
                }
                if(a[i] == 2){
                    hold = i;
                    break;
                }
            }
            if(count1 == count2 && a[hold] == 2){
                result = 1;
            }
            else{
                result = 0;
                
            }
        }
        else{
            return 0;
        }
        
        

        return result;

    }

    public static void main(String [] args){
       System.out.println(isOneTwoArray(new int[]{1, 2, 1}));

        System.out.println(isOneTwoArray(new int[]{1, 1, 2, 2, 2, 1, 1} ));

        System.out.println(isOneTwoArray(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));

        System.out.println(isOneTwoArray(new int[]{1, 1, 1, 1, 2, 1, 1}));

        System.out.println(isOneTwoArray(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1} ));

        System.out.println(isOneTwoArray(new int[]{1, 1, 1, 1, 1, 1}));

        System.out.println(isOneTwoArray(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));

        System.out.println(isOneTwoArray(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2} ));

        System.out.println(isOneTwoArray(new int[]{2, 2, 2} ));
    }
}
