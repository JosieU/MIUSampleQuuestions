public class CompleteArray {
    static int isComplete(int []a){
        boolean check = false; 
        boolean result = true;
        for(int i = 0; i < a.length; i++){ //36, 28
            for(int j = 1; j <= a[i]; j++){
                if( a[i]!= 1 && j * j == a[i]){
                    check = true;
                }
            }
            }
            if( check == false){
                return 0;

            } 
            else{
                for(int i = 0; i < a.length;i++){
                    if(a[i] % 2 != 0){
                        result = false;
                    }
                }
            if(check == true && result == true){
                for(int i = 0; i< a.length; i++){
                    if(i == a.length -1){
                        break;
                    }
                    if(a[i] + a[i+1] == 8){
                        return 1;

                    }
                }  
            }
            else{
                return 0;
            }
            }     

       
       return 0;
    }
    public static void main(String []args){
        System.out.println(isComplete(new int []{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int []{36, -28}));
        System.out.println(isComplete(new int []{3, 7, 23, 13, 107, -99, 97, 81} ));
    }
    
}

