public class ZeroLimited {
    static int iszeroLimited(int []a){
        int zeroLimits= 0;
        int previousZeroLimits = 1;
        int result = 0;
        for(int i = 0; i < a.length; i++){
            //previousZeroLimits = zeroLimits;
            zeroLimits = (3 * i) + 1;
            if( zeroLimits > a.length-1){
                break;
            }
            if(a[zeroLimits] == 0){
                for(int j = zeroLimits -1; j >= 0; j--){
                    if(j != zeroLimits && a[j] != 0){
                        result = 1;
                    }
                    else if( a[j] == 0 && j == 0){
                        break;
                    }
                    else{
                        return 0;
                    }
                
                }
            }
            
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(iszeroLimited(new int []{0, 0, 0, 0, 0} ));
        System.out.println(iszeroLimited(new int []{1, 0} ));
        System.out.println(iszeroLimited(new int []{0, 1} ));
        System.out.println(iszeroLimited(new int []{5} ));
        System.out.println(iszeroLimited(new int []{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0} ));
        System.out.println(iszeroLimited(new int []{} ));
    }
    
}
