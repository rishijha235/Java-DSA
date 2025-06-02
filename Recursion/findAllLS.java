import java.util.ArrayList;

public class findAllLS {
    public static void main(String[] args) {
        int[] arr = {9, 18, 13, 9, -9, 0, 11, 9};
        int target = 9;

        // findAllIndex(arr, target, 0);
        // System.out.println(list);

        // System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));

        System.out.println(findAllIndex2(arr, target, 0));
    }

    // Linear search using recursion to find all target exists in the array
    // static ArrayList<Integer> list = new ArrayList<>();
    // public static void findAllIndex(int[] arr, int target, int index) {
    //     if(index == arr.length) {
    //         return; // target not found
    //     }
    //     if(arr[index] == target){
    //         list.add(index);
    //     }
    //     findAllIndex(arr, target, index + 1);
    // }


    // //return arraylist
    // public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
    //     if(index == arr.length) {
    //         return list; // target not found
    //     }
    //     if(arr[index] == target){
    //         list.add(index);
    //     }
    //     return findAllIndex(arr, target, index + 1, list);
    // }

        //returning list but without taking it in arguments
        //problem: it will not work if we call the function multiple times(every call will create a new list)
        //we need some sort of a way to pass the data of function calls above
        //not very optimised because it creates a new list for every function call
        //so don't use this approach (some problems may use this approach)
        public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list; // target not found
        }
        //this will contain answer for that function call only
        //
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}

