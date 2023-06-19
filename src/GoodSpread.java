public class GoodSpread {
    static int isGoodSpread(int []a){
        int count = 0;
        int result = 1;
        for(int i = 0; i < a.length; i++){
            count = 0;
            for(int j = 0; j < a.length;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > 3){
                result = 0;
                return result;
            }
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(isGoodSpread(new int []{2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(isGoodSpread(new int []{3, 1, 3 ,1, 3, 5, 5, 3} ));
        System.out.println(isGoodSpread(new int []{2, 1, 2, 5, 2, 1, 1, 9}));
    }
}
