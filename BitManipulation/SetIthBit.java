package BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(182, 4));
    }

    public static int setIthBit(int n, int position){
        return n | (1 << position - 1);
    }
    
}
