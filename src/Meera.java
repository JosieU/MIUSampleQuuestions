

public class Meera {
    public static int isMeera(int []a){
        int startIndex= 0;
        int number = 0;
        //int i = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 9 || a[i] ==1){
                if(a[i] == 1){
                    for(int j = 0 ; j < a.length;j++){
                        if(a[j] == 9){
                            number =1;
                            return number;
                        }
                    }
                       
                         number = 0;
                        return number;
                        

                    }
                if(a[i] == 9){
                    for(int j = 0 ; j < a.length;j++){
                        if(a[j] == 1){
                            number =1;
                            return 1;
                        }
                    }
                        
                    number = 0;
                    return 0;
                        

                }
            }
        
    }
    return number;
}       
        public static void main(String [] args){
        System.out.println(isMeera(new int[]{10, 9, 1}));
        System.out.println(isMeera(new int[]{6, 10, 4}));
        System.out.println(isMeera(new int[]{1, 6, 8}));
    }
    

}