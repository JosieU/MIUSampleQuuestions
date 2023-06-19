public class Evens {
    static int isEvens(int n){
        int result = 1;
        int moduloNumber = 0;
        while(n > 0){
            moduloNumber = n % 10;
            n = n / 10;
            if(moduloNumber % 2 != 0){
                result = 0;
                return result;

            }

        }
        return 1;
    }
    public static void main(String [] args){
        System.out.println(isEvens(3224));
        System.out.println(isEvens(2426));
    }
    
}
