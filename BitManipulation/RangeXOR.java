package BitManipulation;

public class RangeXOR {
    public static void main(String[] args) {
        System.out.println(rangeXor(0, 10));
        System.out.println(rangeXor2(0, 10));
    }

    //xor from a to b
    public static int rangeXor(int a, int b){
        int res = xor(b) ^ xor(a - 1);
        return res;
    }

    //gives xor till o to a
    public static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a + 1;
        }
        return 0;
    }

    
    //xor from a to b, this will give TLE for large range
    public static int rangeXor2(int a, int b){
        int res = 0;
        for(int i = a; i <= b; i++){
            res ^= i;
        }
        return res;
    }
}
