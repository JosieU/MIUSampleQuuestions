public class HodderNumber {
    static int isHodderNumber(int n){
        double doublePow;
        int result = 0;
        for(int i = 1; i < n; i++){
            doublePow = Math.pow(2, i);
            if(doublePow -1 == n){
                result = 1;
                return result;
            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isHodderNumber(31));
        System.out.println(isHodderNumber(7));
        System.out.println(isHodderNumber(33));
        System.out.println(isHodderNumber(127));
    }
    
}
