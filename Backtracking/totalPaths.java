package Backtracking;
// Count the total paths in a maze(matrix) to move from (0,0) to (m,n)
// Conditions: 1) You can only move towards right direction, 2) You can only move downwards.

public class totalPaths {

    public static int totalP(int m, int n, int i, int j) {

        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // move downwards
        int downPath = totalP(m, n, i + 1, j);

        // move right
        int rightPath = totalP(m, n, i, j + 1);

        int totalPaths = downPath + rightPath;
        return totalPaths;
    }

    public static void main(String[] args) {
        System.out.println(totalP(3, 3, 0, 0));
    }
}
