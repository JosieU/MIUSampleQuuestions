public class GuthrieIndex {
    public static int isGuthrieIndex(int n){
        int count = 0;
        int count1 = 0;
        int result = 0;
        while (n !=1 ){
            if(n % 2 == 0){
              result =  n/2;
              count++;
              n = result;

            }
            else {
                result = n * 3 + 1;
                count ++;
                n = result;
            }
        }
        return count + count1;
    }
    public static void main(String[] args){
        System.out.println(isGuthrieIndex(1));
        System.out.println(isGuthrieIndex(2));
        System.out.println(isGuthrieIndex(3));
        System.out.println(isGuthrieIndex(7));
        System.out.println(isGuthrieIndex(42));
    }
    
}
