public class NumOfRectanglesInACircle {
    public static void main(String[] args) {
        int r = 2;
        System.out.println(rectanglesInCircle(r));
    }

    public static int rectanglesInCircle(int r) {
        int rect = 0;
        for (int i = 1; i <= r * 2; i++) {
            for (int j = 1; j <= r * 2; j++) {
                if (i * i + j * j <= r * r * 4) {
                    rect++;
                }
            }
        }
        return rect;
    }
}
