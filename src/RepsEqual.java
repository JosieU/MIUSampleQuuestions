    public class RepsEqual {
        static int repsEqual(int []a, int n){
            int comfirm = 0;
            for(int i = a.length-1; i >= 0; i--){
                int lastrep = n % 10;
                n = n / 10;
                if (lastrep == a[i]) {
                    comfirm = 1;

                }
                else{
                    comfirm = 0;
                    break;
                }

                    
            }
            return comfirm;
            
        }

    public static void main(String[] args){
        System.out.println(repsEqual(new int []{3, 2, 0, 5, 3} , 32053));
        System.out.println(repsEqual(new int []{3,2,2} , 3205));
        System.out.println(repsEqual(new int []{3, 8, 0, 5,3,4} , 320531));
        System.out.println(repsEqual(new int []{9,3,1,1,3} , 32053));

            }
            
        }

