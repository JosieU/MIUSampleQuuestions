public class OddFactor {
    static int isNormalNUmber(int n){
        int count = 0;
        int result = 0;
        for(int i = 1; i <= n ; i++){
            if(n % i == 0){
                count++;
            }
        }if(count > 2){
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    if( i % 2 != 0){
                        result = 0;
                        return result;
                    }
                }
            }
        }
        else{
            result = 1;
            }
        return result;
    }
    public static void main(String []args){
        System.out.println(isNormalNUmber(3));
        System.out.println(isNormalNUmber(7));
        System.out.println(isNormalNUmber(1));
        System.out.println(isNormalNUmber(9));
        System.out.println(isNormalNUmber(10));
    }
    
}
