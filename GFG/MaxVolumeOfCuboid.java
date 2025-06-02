public class MaxVolumeOfCuboid {
    public static void main(String[] args) {
        double perimeter = 143685942;
        double area = 50566384;
        System.out.println(maxVolume(perimeter, area));
        
    }

    static double maxVolume(double perimeter, double area) {
        // code here
        double  len = (perimeter - Math.sqrt(perimeter * perimeter - 24 * area)) / 12;
        double height = perimeter/4 - 2*len;
        double volume = len*len*height;
        return volume;
    }
    
}
