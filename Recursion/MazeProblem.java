import java.util.ArrayList;
public class MazeProblem {
    public static void main(String[] args) {
        // System.out.println(countPath(3, 3));

        // findPath("", 3, 3);

        // System.out.println(findPathRet("", 3, 3));

        // System.out.println(findPathDiagonalRet("", 3, 3));


        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        findPathWithObstacles("", maze, 0, 0);


    }

    // // Counting the number of paths in a maze
    //starting from (2,2) to (1,1) in a 2D grid
    // static int countPath(int r, int c) {
    //     if(r == 1 || c == 1) {
    //         return 1; // If we are at the first row or first column, there's only one way to reach the destination

    //     }

    //     int left = countPath(r - 1, c); // Move up //in left hand side decreasing row - 1
    //     int right = countPath(r, c - 1); // Move left //in right hand side decreasing column - 1
        
    //     return left + right; // Total paths = paths from left + paths from down
    // }
    

    // //finding all possible paths in a maze (only moving right or down)
    // static void findPath(String p, int r, int c) {
    //     if(r == 1 && c == 1) {
    //         System.out.println(p); // If we reach the destination, print the path
    //         return;
    //     }

    //     if(r > 1) {
    //         findPath(p + "D", r -1, c); // Move down
    //     }
    //     if(c > 1) {
    //         findPath(p + "R", r, c - 1); // Move right
    //     }
    // }

    // // Finding all possible paths in a maze (only moving right or down) and returning them as a list
    // static ArrayList<String> findPathRet(String p, int r, int c) {
    //     if(r == 1 && c == 1) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p); // If we reach the destination, add the path to the list
    //         return list;
    //     }

    //     ArrayList<String> paths = new ArrayList<>();
    //     if(r > 1) {
    //         paths.addAll(findPathRet(p + "D", r -1, c)); // Move down
    //     }
    //     if(c > 1) {
    //         paths.addAll(findPathRet(p + "R", r, c - 1)); // Move right
    //     }
        
    //     return paths; // Return all the paths found
    // }


    // //finding path if we can move diagonally as well (right, down, diagonal)
    // static ArrayList<String> findPathDiagonalRet(String p, int r, int c) {
    //     if(r == 1 && c == 1) {
    //         ArrayList<String> path = new ArrayList<>();
    //         path.add(p); // If we reach the destination, add the path to the list
    //         return path;
    //     }

    //     ArrayList<String> paths = new ArrayList<>();

    //     if(r > 1 && c > 1) {
    //         paths.addAll(findPathDiagonalRet(p + "D", r - 1, c - 1)); // Move down
    //     }
    //     if(r > 1) {
    //         paths.addAll(findPathDiagonalRet(p + "V", r - 1, c)); // Move down(Vertical)
    //     }
    //     if(c > 1) {
    //         paths.addAll(findPathDiagonalRet(p + "H", r, c - 1)); // Move right(Horizontal)
    //     }
        
    //     return paths; // Return all the paths found
    // }


    //finding path for a maze having obstacles at (1,1 or any false cell)(only move right or down)
    static void findPathWithObstacles(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) { // If the cell is an obstacle, return
            return;
        }

        if(r < maze.length - 1) {
            findPathWithObstacles(p + 'D', maze, r + 1, c);
        }

        if(c < maze[0].length - 1) {
            findPathWithObstacles(p + 'R', maze, r, c + 1);
        }


    }

}