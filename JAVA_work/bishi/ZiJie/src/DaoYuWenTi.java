import java.util.Scanner;

/*
* leetcode200返回岛屿的个数（DFS）
* */
public class DaoYuWenTi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows =scanner.nextInt();
        int cows =scanner.nextInt();
        int[][] grid=new int[rows][cows];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cows ; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        // 标记数组，标记了 grid 的坐标对应的格子是否被访问过
        // grid 的行
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){

                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    static void dfs(int[][] grid, int r, int c) {
        // 判断 base case
        if (!inArea(grid, r, c)) {
                return;
        }
        // 如果这个格子不是岛屿，直接返回
        if (grid[r][c] != 1) {
            return;
        }
        grid[r][c] = 2; // 将格子标记为「已遍历过」

        // 访问上、下、左、右四个相邻结点
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    // 判断坐标 (r, c) 是否在网格中
    static boolean inArea(int[][] grid, int r, int c) {
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }

}
