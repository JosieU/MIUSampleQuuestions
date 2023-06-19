import javax.naming.spi.DirStateFactory.Result;

public class CountSquare {
    static int isCountSquare(int []a){
        int sum = 0;
        //int product =1;
        int result = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length;j++){
                sum = 0;
                if(a[i] > 0 && a[j] > 0){
                    sum = a[i] + a[j];
                    for(int k = 1; k < sum; k++){
                        if(k * k == sum){
                            result++;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isCountSquare(new int []{9, 0, 2, -5, 7}));
        System.out.println(isCountSquare(new int []{9}));
        System.out.println(isCountSquare(new int []{9,7}));

    }
    
}
