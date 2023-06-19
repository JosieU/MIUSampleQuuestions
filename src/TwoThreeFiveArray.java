public class TwoThreeFiveArray {
    static int isTwoThreeFiveArray(int []a){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
    for(int i = 0; i < a.length; i++){
        if(a[i] % 2 == 0){
            count1++;
        }
        if(a[i] % 3 == 0 ){
            count2++;
        } 
        if(a[i] % 5 == 0){
            count3++;

        }
        if(a[i] % 2 != 0 && a[i] % 3 != 0 &&  a[i] % 5 != 0) {
            count4++;

        }
        
    }
    if(count1 + count2+count3+count4 == a.length){
        return 1;
    }
    return 0;
    
    }
    public static void main(String [] args){
        System.out.println(isTwoThreeFiveArray(new int[]{2, 3, 5, 7, 11}));
        System.out.println(isTwoThreeFiveArray(new int[]{2, 3, 5, 7, 11}));
        System.out.println(isTwoThreeFiveArray(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isTwoThreeFiveArray(new int[]{2, 4, 8, 16, 32}));
        System.out.println(isTwoThreeFiveArray(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(isTwoThreeFiveArray(new int[]{7, 11, 77, 49} ));
        System.out.println(isTwoThreeFiveArray(new int[]{2} ));
        System.out.println(isTwoThreeFiveArray(new int[]{} ));
        System.out.println(isTwoThreeFiveArray(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }
}

