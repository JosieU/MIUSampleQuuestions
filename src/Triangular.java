public class Triangular {
    static int istriangular(int n){
    int triangular = 0;
    int result = 0;
    for(int i = 1; i < n ; i++){
        triangular = triangular + i;
        if(triangular == n){
            result = 1;
            break;

        }
        if( triangular > n){
            result = 0;
            return result;
        }
        

    } 
    return result;
    }
    public static void main (String [] args){
        System.err.println(istriangular(3));
        System.err.println(istriangular(5));
        System.err.println(istriangular(10));
    }
    
}
