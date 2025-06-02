public class test {
    public static void main(String[] args) {
        int ans = num(5);
        System.out.println(ans);
        funRev(5);
    }

    public static int num(int n){
        if(n==0){
            return 0;
        }
        System.out.print(n + " ");
        return num(n-1);
    }

    // This function prints numbers from 1 to n
    public static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.print(n + " ");
    }
    
}