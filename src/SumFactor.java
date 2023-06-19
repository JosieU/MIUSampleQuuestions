public class SumFactor {
    public static int isSumFactor(int []a){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < a.length;i++){
            sum = sum + a[i];
        }
        for(int i = 0; i < a.length; i++){
            if (a[i] == sum){
                count ++;
            }

        }
        return count;

    }
    public static void main(String [] args){
        System.out.println(isSumFactor( new int []{3, 0, 2, -5, 0}));
        System.out.println(isSumFactor(new int []{9, -3, -3, -1, -1}));
        System.out.println(isSumFactor(new int []{1}));
        System.out.println(isSumFactor(new int []{0, 0, 0}));
    }


    
}
