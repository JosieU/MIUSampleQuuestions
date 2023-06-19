public class MagicArray {
    static int isMagic(int []a){
        int sum = 0;
        int result = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 1; j <= a[i]; j++){
                if(a[i] % j == 0){
                    count++;
                }
            }
            if(count == 2){
                sum = sum + a[i];
            }
            count = 0;
        }
        if(sum == a[0]){
            result = 1;  
        }
        if(sum != a[0] && a[0] == 0){
            result = 1;
        }
        
        return result;
    }
    public static void main(String[]args){
        System.out.println(isMagic(new int[]{21, 3, 7, 9, 11 ,4, 6}));
        System.out.println(isMagic(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isMagic(new int[]{10, 5, 5}));
        System.out.println(isMagic(new int[]{0, 6, 8, 20} ));
        System.out.println(isMagic(new int[]{8, 5, 5, 5, 3} ));
    }
    
}
