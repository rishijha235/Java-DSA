
// package Heaps;
import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if(index == 0) {
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Removing from an empty heap");
        }
        T removedValue = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return removedValue;
    }

    private void downheap(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < list.size() && list.get(smallest).compareTo(list.get(left)) > 0) {
            smallest = left;
        }
        if(right < list.size() && list.get(smallest).compareTo(list.get(right)) > 0) {
            smallest = right;
        }
        if(smallest != index) {
            swap(index, smallest);
            downheap(smallest);
        }
    }

    // For testing purposes
    public ArrayList<T> getList() {
        return list;
    }

    //Heap Sort Method
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
            Heap<Integer> heap = new Heap<>();
            heap.insert(10);
            heap.insert(5);
            heap.insert(20);
            heap.insert(3);
            heap.insert(15);
            heap.insert(50);
            heap.insert(59);
            System.out.println("Heap after insertions: " + heap.getList()); // Should show a min-heap structure
            

            System.out.println("peek: " + heap.list.get(0)); // Should be 3
            System.out.println("Removed: " + heap.remove()); // Should remove 3
            System.out.println("peek: " + heap.list.get(0)); // Should be 5
            System.out.println("Removed: " + heap.remove()); // Should remove 5
            System.out.println("Heap after removals: " + heap.getList()); // Should show remaining elements in min-heap order
            
            //sorted output
            System.out.println("Heap sort: " + heap.heapSort());
            
    }
}
