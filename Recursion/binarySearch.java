public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-11,-2,9,12,15,56,85,90};
        System.out.println(bS(arr, 56, 0, arr.length-1));
    }

    public static int bS(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return bS(arr, target, start, mid-1);
        }
        return bS(arr, target, mid+1, end);
    }
    
}
