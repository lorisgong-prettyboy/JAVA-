import java.util.Scanner;
/*
* 字节跳动第一题   二分法求得先升后降的正数组中最大的数值
*
* */
public class erFenfa1 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=reader.nextInt();
        }
        reader.close();

        int R = erFen(array);
        System.out.println(R);

    }

    public static int erFen(int[]array){
        int left = 0;
        int num = 0;
        int right=array.length-1;
        for ( int i = 0; i <array.length; i++) {
            int mid = (left+right)/2;
            if (array[left]<array[mid]) left =mid;
            else if (array[right]<array[mid]) right=mid;
            else {
                num = array[mid];
            }
        }
        return num;
}

}

