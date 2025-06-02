public class fibbonachi {
    public static void main(String[] args) {
        // System.out.println(fibo(40));

        for(int i = 0; i < 50; i++){
            System.out.println(fiboFormula(i));
        }
    }

    //by formula
    public static long fiboFormula(int n){
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    // //by recursion
    // public static int fibo(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     return fibo(n-1)+fibo(n-2);
    // }
    
}
