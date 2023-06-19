public class SumPower {
    static int sumOfPower(int []a){
        int result = 0;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum =sum + a[i];
        }
        if( sum % 1 == 0){
            for(int i = 0; i <= 10; i++){
                if(sum == Math.pow(2, i)){
                    result =1;
                    return result;
                }
            }
            result = 0;
            return result;
        }
        return result;

    }
    public static void main(String [] args){
        System.out.println(sumOfPower(new int []{8,8,8,8}));
        System.out.println(sumOfPower(new int []{8,8,8}));
        System.out.println(sumOfPower(new int []{4}));
    }
    
}
