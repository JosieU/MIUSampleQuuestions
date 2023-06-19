public class VanillaArray {
    static int isVanilla(int []a){
        int result = 0;
        int modNum = 0;
        int divNumber;
        int num;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder numberHolder = new StringBuilder();
        if(a.length == 0)return 1;    
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                modNum = a[i] % 10;
                numberHolder = stringBuilder.append(Integer.toString(modNum));
                num = Integer.parseInt(numberHolder.toString());
                divNumber = a[i] / 10;
                if(a[i] == num){
                    result = 1;
                }
            }
                else{
                modNum = (a[i] *(-1)) % 10;
                numberHolder = stringBuilder.append(Integer.toString(modNum));
                num = Integer.parseInt(numberHolder.toString());
                divNumber = a[i] / 10;
                if(a[i] == num){
                    result = 1;

                }
            }

    }
    return result;

    }
public static void main(String [] args){
    System.out.println(isVanilla(new int []{1}));
    System.out.println(isVanilla(new int []{11, 22, 13, 34, 125}));
    System.out.println(isVanilla(new int []{9, 999, 99999, -9999}));
    System.out.println(isVanilla(new int []{}));
}
    
}
