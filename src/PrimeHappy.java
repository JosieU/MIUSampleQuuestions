public class PrimeHappy {
    static int isPrimeHappy(int n){
        int count = 0;
        int sum = 0;
        int i;
        for(i = 1; i < n; i++){
            count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }

            }
            if(count == 2 && i < n){
                sum = sum + i;             
                
            }
            
            
            
        }
        if(count > 1 &&  sum % n == 0){
            return 1;
        }
        
        
        return 0;
    }
    public static void main(String []args){
        //System.out.println(isPrimeHappy(5));
        //System.out.println(isPrimeHappy(25));
        //System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(2));
        System.out.println(isPrimeHappy(8));
    }
        
}
