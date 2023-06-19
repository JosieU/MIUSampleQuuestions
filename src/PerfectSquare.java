class PerfectSquare{
    public static int perfectSquare(int n){
        int a = 0;
        if(n > 0){
        double nextNumber = (Math.sqrt(n));
        if(nextNumber % 1 == 0){
            a = (int) ((nextNumber  +1) * (nextNumber + 1));
        }
        while(nextNumber % 1 != 0){
            n=n+1;
            nextNumber =(int) (Math.sqrt(n));
        
        if(nextNumber % 1 == 0){
        a =(int) ((nextNumber) * (nextNumber));
        }
    }
}

        return a;


    }
    public static void main(String [] args){
        System.out.println(perfectSquare(0));
        System.out.println(perfectSquare(8));
        System.err.println(perfectSquare(24));
        System.out.println(perfectSquare(9));
        System.out.println(perfectSquare(16));
        System.out.println(perfectSquare(49));

}}
    
     
    /*public static void main(String [] args){
        int n = 36;
        double nextNumber = (Math.sqrt(n));
        while(nextNumber % 1 != 0){
            n=n+1;
            nextNumber =(int) (Math.sqrt(n));
        }
        int a =(int) ((nextNumber+1) * (nextNumber+1));
        System.out.println(a);
        

}
}*/