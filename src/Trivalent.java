public class Trivalent {
    static int isTrivalent(int []a){
        int count = 0;
        int result = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j< a.length; j++){
            if(a[i] < 0 ){
                a[i] = a[i] * (-1);
            }
            if(a[j] < 0){   
                a[j] = a[j] * (-1);

                } 
            
            if(a[i]  == a[j]){
            count++;
            }
            
            
            
            if(count != 0 ){
                result =1;
                }    

            }
            if(count == 0){
                return result;
            }
        }
             
            return result;
           
        } 
    public static void main(String [] args){
        System.out.println(isTrivalent(new int []{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int []{}));
        System.out.println(isTrivalent(new int []{ 214748364, -1, -1, -214748364}));
        System.out.println(isTrivalent(new int []{5,6,8,9}));
    }
    }    
    

