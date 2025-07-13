import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountPaths {
    
    public static int countPaths(Node node, int sum) {
        List<Integer> path = new LinkedList<>();
        return helper(node, sum, path);
    }

    private static int helper(Node node, int sum, List<Integer> path) {
        if (node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;
        
        // how many paths i can make from the current node
        // start from lower bottom because the top already checked
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();
            
            if (s == sum) {
                count++;
            }
        }

        count += helper(node.left, sum, path) + helper(node.right, sum, path);

        //backtrrack
        path.remove(path.size() - 1);

        return count;
    }
}
