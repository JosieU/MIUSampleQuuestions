import javax.naming.spi.DirStateFactory.Result;

public class OddCentered{
    static int isCentered(int []a){
        int min = a.length / 2;
        int result = 0; // 2;
        if(a.length  % 2 == 0)return 0;
        for(int i = 0; i < a.length; i++){
            if(a[min] < a[i] && i != min){
                result = 1;
            }
            if(a[min] >= a[i]&& i != min){
                result = 0;
                return result;
            }
        }
        return result;
    }


    public static void main (String [] args){
        System.out.println(isCentered(new int []{2,4,1,5}));
        System.out.println(isCentered(new int []{2,3,1,5,6}));
        System.out.println(isCentered(new int []{2,3,10,5,1,0,2,3,10,5,1}));

    }
    
}
