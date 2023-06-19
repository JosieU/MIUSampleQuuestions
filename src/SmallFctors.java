class SmallFctors{
    static int hasSmallFactors(int k, int n){
        int count = 0;
        int result = 0;
        int starIndex = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        int []a = new int[count];
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                a[starIndex] = i;
                starIndex++;
            } 
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
            if(a[i] * a[j] == n){
                if(a[i] < k && a[j] < k){
                    result = 1;
                }
            }

        }
    }
    return result;  
    }
    public static void main (String []args){
        System.out.println(hasSmallFactors(7, 30));
        System.out.println(hasSmallFactors(6, 14));
        System.out.println(hasSmallFactors(10, 20));
    }
}
