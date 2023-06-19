public class OddValent {
    static int isOddValent(int []a){
        int starIndex = 0;
        int result = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1 ; j < a.length; j++){
                if(a[j] == a[i]){
                    for(int k = 0; k < a.length; k++){
                        if(a[k] % 2 != 0){
                            result = 1;
                            return result;
                        }
                    }
                }
            }
            
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(isOddValent( new int []{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int []{3, 3, 3, 3}));
        System.out.println(isOddValent(new int []{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int []{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int []{2, 2, 2, 4, 4}));
    }
    
}
