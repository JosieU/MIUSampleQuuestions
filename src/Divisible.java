public class Divisible {
    static int isDivisible(int []a , int n){
        int result = 1;
        //if(a.length == 0) return 1;
        for(int i = 0; i < a.length; i++){
            if(a[i] % n != 0){
                result = 0;
                break;

            }
            
        }
        return result;
    }
    public static void main(String[] args){
        //System.out.println(isDivisible(new int[]{3, 3, 6, 36}, 3));
        //System.out.println(isDivisible(new int[]{4}, 2));
        //System.out.println(isDivisible(new int[]{3, 4, 3, 6, 36}, 3));
        //System.out.println(isDivisible(new int[]{6, 12, 24, 36}, 12));
        System.out.println(isDivisible(new int[]{}, 12));
    }
    
}
