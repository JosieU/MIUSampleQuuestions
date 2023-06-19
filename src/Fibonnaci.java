public class Fibonnaci {
    static int isFibonaci(int n){
        int startNumber = 0;
        int nextNumber = 1;
        int fibonacci = 0;
        int result = 0;
        
        for( int i = 1; i < n; i++){
            fibonacci= startNumber + nextNumber;//3//5..
            startNumber = nextNumber;//2
            nextNumber = fibonacci;//3
            if( fibonacci == n){
                //result = 1;            
                return 1;
            }
           
            
        }
        //result = 0;
        return 0;
        


    }
    public static void main(String[] args){
        System.out.println(isFibonaci(8));
        System.out.println(isFibonaci(9));
        System.out.println(isFibonaci(13));
        System.out.println(isFibonaci(7));
    }
    
}
//1 1 2 3 5 8 13 .......
