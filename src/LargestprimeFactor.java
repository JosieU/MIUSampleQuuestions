public class LargestprimeFactor {
    static int isalargestaparimeFactor(int n){
        int result = 0;
        int count = 0;
        int hold = 0;
        if(n <= 1)return 0;
        for(int i = 1; i < n; i++){
            count = 0;
            if( n % i == 0){
                hold = i;
                for(int j = 1; j <= hold; j++){
                    if(hold % j == 0){
                        count++;

            }
            }
            }
            if(count == 2){
                result = hold;
                
            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isalargestaparimeFactor(10));
        System.out.println(isalargestaparimeFactor(6936));
        System.out.println(isalargestaparimeFactor(1));
    }
    
}
