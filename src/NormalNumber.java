public class NormalNumber {
    static int isNoramalNumber(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(i != 1){
                if(n % i == 0 && i % 2 == 0){
                    result = 1;
                }
                else if(n % i == 0 && i % 2 != 0){
                    result = 0;
                    return result;
                }
            }
        }
        return 1;
    }
    public static void main(String []args){
        System.out.println(isNoramalNumber(8));
        System.out.println(isNoramalNumber(7));
        System.out.println(isNoramalNumber(6));
        System.out.println(isNoramalNumber(9));
    }
    
}
