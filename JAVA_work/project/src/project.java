
/*  广联达 游戏3/3*/


import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();//第一个数字是小怪的个数，也就是后面要输入几个数组
        int f = reader.nextInt();
        int [][]array = new int[m][2];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <2 ; j++) {
                array[i][j]=reader.nextInt();
            }
        }

        int n =cishu(array,m,f);
        System.out.println(n);
    }

    public static int cishu(int[][] array, int m, int f) {
        if (array==null) return 0;
        int left=0, right=1,JNfanwei=2*f;
        int countHp=0;//技能需要分的范围
        while (right<m){//右指针小于m
            int sum = array[right][0]-array[left][0];
            int Hp  = array[left][1];
            if (sum<JNfanwei){
                Hp=Math.max(Hp,array[right][1]);
                right++;
            }
            else {
                countHp=countHp+Hp;
                left=right;
            }
        }
        countHp=countHp+array[left][1];
        return countHp;
    }

}
