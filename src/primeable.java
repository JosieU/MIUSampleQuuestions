public class primeable {
    static int isPrimeable(int []a, int n){
        int count = 0;
        int result = 1;
        int hold = 0;
        for(int i = 0; i < a.length; i++){
            count = 0;
            hold = a[i] + n;
            for(int j = 1; j <= hold; j++){
                if(hold % j == 0){
                    count++;

                }
            }
            if(count != 2){
                result = 0;
                return result;
            }
            
            
    }
    return result;

    
    }
    public static void main(String []args){
        System.out.println(isPrimeable(new int[]{5, 15, 27}, 2));
        System.out.println(isPrimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1} , 1));
        System.out.println(isPrimeable(new int[]{}, 2));
        
    }
}
