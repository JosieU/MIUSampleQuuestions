public class TwinPrime {
    static int isTwinePrime(int n){
        int result = 0;
        int count = 0;
        for(int i = 1; i <= n; i++ ){
            if(n % i == 0){
                count++;
            }           
        }
        if(count == 2){
            count =0;
            for(int i = 1 ; i <= n+2; i++){
                if((n+2) % i == 0){
                    count++;
                }
            }
            if(count!= 2){
                count = 0;
                for(int i = 1 ; i <= n - 2; i++){
                    if((n-2) % i == 0){
                        count++;
                    }
                }
                if(count == 2){
                    result =1 ;
                }
                else{
                    result = 0;
                }

            }
            else{
                result = 1;
                return result;
            }
        }
       
        
        return result;
    }
    public static void main(String [] args){
        System.out.println(isTwinePrime(5));
        System.out.println(isTwinePrime(7));
        System.out.println(isTwinePrime(53));
        System.out.println(isTwinePrime(9));

    }
}
