public class Exponent {
    static int isExponential(int n, int p){
        double exponent = 0;
        int count = 0 ;
        if( p <= 1){
            return -1;
        }
        else{
            if(n < 0){
                n = n * -1;
            }
            while(n > 0){
                exponent = (double)n / p; // 280, 7
                if(exponent % 1 == 0){
                    n = (int)exponent;
                    count++;

                }
                else{
                    return count;
                }


            }
        }
        return count;
        
        

    }
    public static void main(String []args){
        System.out.println(isExponential(27, 3));
        System.out.println(isExponential(28, 3));
        System.out.println(isExponential(280, 7));
        System.out.println(isExponential(-250, 5));
        System.out.println(isExponential(18,1));
        System.out.println(isExponential(128, 4));
    }
    
}
