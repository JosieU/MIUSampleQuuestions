public class NPrimeable {
    static int isprimeable(int []a, int n){// 5, 15,27
        int checkPrime;
        int result = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++){
            checkPrime = a[i] + n;
            for(int j = 1; j <= checkPrime; j++){
                if(checkPrime % j == 0){
                    count++;

                }
            }
            if(count != 2){
                return 0;
            }
            
            else{
                result = 1;
                count = 0;
                
            }

            
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println(isprimeable(new int[]{5,15,27}, 2));
        System.out.println(isprimeable(new int[]{5,15,27}, 3));
        System.out.println(isprimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isprimeable(new int[]{1, 1, 1, 1, 1, 1, 1} , 4));
        System.out.println(isprimeable(new int[]{0} , 2));
    }
    
}
