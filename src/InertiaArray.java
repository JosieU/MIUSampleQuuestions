import java.util.Arrays;

public class InertiaArray {
    static int isInertial(int [] a){
        int result = 0;
        int maxNumber = 0;
    
        int count1 = 0;
        int count2 = 0;
        int []oddNumber =new int[a.length];
        int []evenNumber = new int[a.length];
        Arrays.sort(a);
        //int lastIndex = a[a.length-1];
        if(a[a.length -1] % 2 != 0){
            return 0;
        }
        else{
            
            maxNumber = a[a.length-1];
            for(int i = 0; i < a.length;i++){
                if(a[i] % 2 != 0){
                oddNumber[count1] = a[i];
                count1 += 1;
                }
                if(a[i] % 2 == 0){
                    evenNumber[count2] = a[i];
                    count2 += 1;
                }
                
                    
                    

        }
        for(int i = 0; i < oddNumber.length; i++){
            for(int j = 0; j <evenNumber.length;j++){
                if(oddNumber[i]!= 0 && evenNumber[j] != maxNumber){
                if(oddNumber[i] >= evenNumber[j]){
                    result = 1;
                }

                
                else{
                    result = 0;
                    return result;
                }
            }

            }
            
        }
        
        
        
    }
    return result;
}

    
    public static void main(String [] args){
        int result = isInertial(new int[]{1});
		System.out.println(result);
		result = isInertial(new int[]{2});
		System.out.println(result);
		result = isInertial(new int[]{1, 2, 3, 4});
		System.out.println(result);
		result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{-2, -4, -6, -8, -11});
		System.out.println(result);
		result = isInertial(new int[]{2, 3, 5, 7});
		System.out.println(result);
		result = isInertial(new int[]{2, 4, 6, 8, 10});
		System.out.println(result);
    }
    
}
