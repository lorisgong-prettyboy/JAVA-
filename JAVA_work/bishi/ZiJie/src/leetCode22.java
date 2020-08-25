package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 括号问题，例如输入输入：n = 3
输出：[
       "((()))",
       "(()())",
       "(())()",
       "()(())",
       "()()()"
     ]
ps：采用递归或者dfs
* */
public class leetCode22 {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        generateParenthesis(n);
        System.out.println(list);
    }
    public static List<String> generateParenthesis(int n) {
           dfs(n,n,"");
           return list;
    }

    public static void dfs(int left,int right,String curStr){
        if (left==0&&right==0){
            list.add(curStr);
            return;
        }
        if (left>0){
            dfs(left - 1, right, curStr + "(");
        }
        if (right > left){
            dfs(left, right - 1, curStr + ")");
        }
    }
}
