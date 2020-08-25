package src;
/*
* 输入一个集合，输出他的所有子集，包括空集
* */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class leetcode78 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int v = reader.nextInt();
        int[] nums = new int[v];
        for (int i = 0; i <v ; i++) {
            nums[i]=reader.nextInt();
        }

        List<List<Integer>> list = subsets(nums);
        System.out.println(list);

    }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new LinkedList<>();
        backtracks(nums,0,new LinkedList<>(),result);
        return result;
    }

   public static void backtracks(int[]nums,int current,LinkedList<Integer> track,List<List<Integer>> result){
        if (current == nums.length){
            result.add(new LinkedList<>(track));
            return;
        }
        //不选当前元素
       backtracks(nums,current+1,track,result);
        track.add(nums[current]);//选取挡墙的元素，相当于中序遍历中的右子树
       backtracks(nums,current+1,track,result);
        track.removeLast();//撤销选取当前元素
   }
}
