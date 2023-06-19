public class Square {
    static int isSquare(int n){
        int result = 0;
       for (int i = 1; i <= n/2; i++){
        if (i * i == n ){
            result = 1;
            break;
        }
        else if( i * i > n){
            return 0;
        }
        
       }
       return result;
       
    }
    public static void main(String []args){
        //System.out.println(isSquare(9));
        //System.out.println(isSquare(16));
        //System.out.println(isSquare(5));
        System.out.println(isSquare(24));

    } 
    
    
}
