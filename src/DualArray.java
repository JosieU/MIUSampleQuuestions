public class DualArray {
    static int isDualArray(int []a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            count = 0;
            for(int j= 0; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count != 2){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String []args){
        System.out.println(isDualArray(new int []{2, 5, 2, 5, 5}));
        System.out.println(isDualArray(new int []{1, 1, 2, 2}));
        System.out.println(isDualArray(new int []{1, 2, 1, 3, 3, 2}));
    }
    
}
