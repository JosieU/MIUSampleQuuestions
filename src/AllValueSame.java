public class AllValueSame {
    static int isAllValueTheSame(int []a){
        int result = 1;
        if(a.length == 0)return 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] != a[i+1]){
                result = 0;
                return result;
            }
        }
        return result;
    }
    public static void  main(String[] args){
        System.out.println(isAllValueTheSame( new int []{1, 1, 1, 1}));
        System.out.println(isAllValueTheSame( new int []{83, 83, 83}));
        System.out.println(isAllValueTheSame( new int []{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(isAllValueTheSame( new int []{1, -2343456, 1, -2343456} ));
        System.out.println(isAllValueTheSame( new int []{432123456}));
        System.out.println(isAllValueTheSame( new int []{}));
    
}
}