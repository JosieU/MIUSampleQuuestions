public class BalncedOne {
    static int isBalancedOne(int []a){
        boolean checkBalancedNumber = false;
        for(int i = 0; i < a.length; i+=2){
            if(a[i] % 2 == 0){
                checkBalancedNumber = true;
            }
            else{
                return 0;
            }
        }
        return 1;

    }
    public static void main(String []args){
        System.err.println(isBalancedOne(new int []{2, 3, 6, 7}));
        System.err.println(isBalancedOne(new int []{6, 7, 2, 3, 12}));
        System.err.println(isBalancedOne(new int []{7, 15, 2, 3}));
       
    }
    
}
