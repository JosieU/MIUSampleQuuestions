public class BeanArray {

    public static int isBean(int []a){
        // int startIndex = 1;
        int result = 1;
        for(int i = 0; i <= a.length; i++){
            for (int j = 0; j < a.length; j++){
            if(a[i] != a[j] -1 || a[i] != a[j] + 1){
                result = 0;

                
            }
            }
             result = 1;

        }
        return result;

        
    }

public static void main(String [] args){
   System.out.println(isBean(new int[] {3, 4, 7, 9} ));
    System.out.println(isBean(new int[] {2, 2, 3, 3, 3} ));
    System.out.println(isBean(new int[] {1, 1, 1, 2, 1, 1} ));
    System.out.println(isBean(new int[] {0,1, -1} ));
    
    
}

    }
