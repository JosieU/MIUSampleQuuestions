public class Madhav {
    static int isMadhav(int []a){
        int sum1 = 0;
        int mdhavLengthSignature = 0;
        int startMadhavLength = 2;
        int count = 1;
        int result = 0;
        for(int i = 1; i < a.length; i++){
            sum1 += a[i];
            count++;
            mdhavLengthSignature = startMadhavLength *(startMadhavLength + 1)/ 2;
            if(sum1 == a[0] && mdhavLengthSignature == count){
                    sum1 = 0;
                    startMadhavLength++;
                    result = 1;
                }
                else if(sum1 == a[0] && mdhavLengthSignature != count && i == a.length-1){
                    result = 0;
                    return result;
                }
                else if(sum1 != a[0] && mdhavLengthSignature == count){
                    result = 0;
                    return result;
                }
            }

            
            return result;
        }
    
        
    
    public static void main(String [] args){
        System.out.println(isMadhav(new int []{2, 1, 1}));
        System.out.println(isMadhav(new int []{2, 1, 1, 4, -1, -1} ));
        System.out.println(isMadhav(new int []{6, 2, 4, 2, 2, 2, 1, 5, 0, 0} ));
        System.out.println(isMadhav(new int []{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhav(new int []{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhav(new int []{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,  1, -2, -1}));
        System.out.println(isMadhav(new int []{3, 1, 2, 3, 0}));


    }
    
    
}
