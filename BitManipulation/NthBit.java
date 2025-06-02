package BitManipulation;

public class NthBit {
    public static void main(String[] args) {
        System.out.println(getNthBit(182, 8));
    }

    public static int getNthBit(int n, int position){
        return (n & (1 << position - 1)) != 0 ? 1 : 0;
    }
    
}
