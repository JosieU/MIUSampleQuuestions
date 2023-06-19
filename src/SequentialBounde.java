public class SequentialBounde {
    static int isSequentialBounded(int []a){
        int count = 0;
        int result = 1;
        boolean check = false;
        int result1 = 0;
        int startIndex = 0;
        int newArray [] = new int [a.length];
        for(int i = 0; i < a.length; i++){
            if(i == a.length-1){
                break;
            }
            if(a[i]<= a[i+1]){
                check = true;
            }
            if(a[i] > a[i+1]){
                return 0;
            }

        }
        if(check == true){
            int j = 0;
            for(int i = 1; i < newArray.length; i++){
                for(j = 0; j < a.length; j++){
                    if(j == a.length-1){
                        break;
                    }
                        if(a[j] == a[j+1]){
                            count++;
                            }
                    }            
                    
                    if(a[j] != newArray[i-1]){    
                    }
                    if(count < a[j]){
                        newArray[startIndex] = a[i];
                        startIndex++;
                        count = 0;
                    }
                    else{
                        return 0;
                    }
            }

            
        }
           
        return result;
        

    }
    public static void main(String [] args){
        System.out.println(isSequentialBounded(new int []{0, 1} ));
        System.out.println(isSequentialBounded(new int []{5, 5, 5, 5, 5} ));
        System.out.println(isSequentialBounded(new int []{5, 5, 5, 2, 5}));
        System.out.println(isSequentialBounded(new int []{2, 2, 3, 3, 99, 99}));
    }
    
}
