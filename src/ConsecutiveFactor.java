public class ConsecutiveFactor {
    static int isConsecutiveFactor(int n){
        int consecutiveFactor = 1;
        int result = 0;
        for(int i = 2; i < n; i++){
            for(int j = i+1; j < n ; j++){
                if(n % i == 0 && n % j == 0){
                        result = 1;
                        return result;
                }
            }
            
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println(isConsecutiveFactor(24));
    }
    
}
