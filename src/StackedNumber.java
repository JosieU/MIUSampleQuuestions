public class StackedNumber {
    static int isStackedNuber(int n){
        int result = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
            if(sum == n ){
                result = 1;
                
            }

        }
        return result;


    }
    public static void main(String [] args){
        System.out.println(isStackedNuber(7));
        System.out.println(isStackedNuber(10));
        System.out.println(isStackedNuber(5));
        System.out.println(isStackedNuber(6));
        System.out.println(isStackedNuber(1));
    }
    
}
