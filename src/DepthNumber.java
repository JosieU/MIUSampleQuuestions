public class DepthNumber {
    static int computeDeth(int n){
        int [] a = new int [10];
        int number;
        int depthModule;
        int index = 0;
        for( int i = 1; i <= 7; i++){
            number = n * i ;
            while(number != 0){
                depthModule = number % 10;
                number = number / 10;
                for(int j = 0; j < a.length;j++){
                    if(a[j] != depthModule && j== a.length -1){
                        a[index] = depthModule;
                        index++;
                        break;
                    }
                    if(depthModule == 0){
                        a[index] = depthModule;
                        index++;
                        break;
                    }
                    if(a[j]== depthModule){
                        break;
                    }
                    }
                    

                } 
                } 
                return index;
            } 



    public static void main(String []args){
        System.out.println(computeDeth(13));
        
    }    
}
