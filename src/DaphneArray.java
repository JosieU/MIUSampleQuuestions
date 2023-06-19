public class DaphneArray {
    static int isDaphneArray(int []a){
        int result = 0;
            if(a[0] % 2 == 0){
                for(int i = 1; i < a.length;i++){
                    result = 1;
                    if(a[i] % 2 == 0){
                        result = 1;
                    }
                    else{
                        result = 0;
                        return result;
                    }
                }
        }
        else{
            for(int i = 1; i < a.length;i++){
                result = 1;
                if(a[i] % 2 != 0){
                    result = 1;
                }
                else{
                    result = 0;
                    return result;
                }
            }
        }
        return result;

    }
    public static void main(String []args){
        System.out.println(isDaphneArray( new int []{2, 4, 2}));
        System.out.println(isDaphneArray(new int []{1, 3, 17,5}));
        System.out.println(isDaphneArray(new int []{3, 2, 5}));
    }
    
}
