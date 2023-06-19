import javax.naming.spi.DirStateFactory.Result;

public class WaveArray {
    static int isWaveArray(int []a){
        int result = 1;
        for(int i = 0; i < a.length; i++){
            if(i == a.length -1){
                break;
            }
            if(a[i] % 2 == 0 && a[i+1] % 2 == 0){
                result = 0;
                return result;
            }
            if(a[i] % 2 != 0 && a[i+1] % 2 != 0){
                result = 0;
                return result;

            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isWaveArray(new int []{7, 2, 9, 10, 5}));
        System.out.println(isWaveArray(new int []{4, 11, 12, 1, 6}));
        System.out.println(isWaveArray(new int []{2}));
        System.out.println(isWaveArray(new int []{2, 6, 3, 4} ));
        System.out.println(isWaveArray(new int []{3,5,4} ));
    }
    
}
