public class BUnkerArray {
    static int isBUnkerArray(int []a){
        int count = 0;
        for(int i = 0; i < a.length;i++){
            count = 0;
            if(i == a.length-1){
                break;
            }
                if(a[i] % 2 != 0){
                    int index = i+1;
                    for(int k = 1; k <= a[index];k++){
                        if(a[index] % k == 0){
                            count++;
                        }

                    }
                    
                }
                if(count == 2){
                    return 1;
                }
               
            }
        
        return 0;

    }
    public static void main(String []args){
        System.out.println(isBUnkerArray( new int[]{4, 9, 6, 7, 3} ));
        System.out.println(isBUnkerArray( new int[]{4, 9, 6, 15, 21} ));
    }
    
}
