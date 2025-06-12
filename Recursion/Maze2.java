public class Maze2 {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        // allPath("", maze, 0, 0);

        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("", maze, 0, 0, path, 1);
    }

    // //in this maze you can move to all four directions (up, down, left, right)
    // //but you cannot move diagonally
    // static void allPath(String p, boolean[][] maze, int r, int c) {
    //     if(r == maze.length - 1 && c == maze[0].length - 1) {
    //         System.out.println(p);
    //         return;
    //     }

    //     if(!maze[r][c]) { // If the cell is an obstacle, return
    //         return;
    //     }

    //     //I am considering this block in  my path
    //     maze[r][c] = false; // Mark the cell as visited

    //     if(r < maze.length - 1) {
    //         allPath(p + 'D', maze, r + 1, c);
    //     }

    //     if(c < maze[0].length - 1) {
    //         allPath(p + 'R', maze, r, c + 1);
    //     }

    //     if(r > 0) {
    //         allPath(p + 'U', maze, r - 1, c);
    //     }

    //     if(c > 0) {
    //         allPath(p + 'L', maze, r, c - 1);
    //     }

    //     //This line is where the function will be over
    //     // before the function gets removed, also remove the changes that were made by that function
    //     maze[r][c] = true; // Unmark the cell as visited (backtrack)
    //     // This allows other paths to use this cell again
    // }


    //Print all path with the level of recursion
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step; // store the last step in the path array
            for(int[] arr : path) {
                System.out.println(java.util.Arrays.toString(arr));
            }
            System.out.println(p); // Print the path when we reach the destination
            System.out.println();
            return;
        }

        if(!maze[r][c]) { // If the cell is an obstacle
            return;
        }

        maze[r][c] = false; // Mark the cell as visited
        path[r][c] = step; // Store the step in the path

        if(r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if(c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if(r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if(c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true; // Unmark the cell as visited (backtrack)

        path[r][c] = 0; // Unmark the step in the path (backtrack)
    }
}
