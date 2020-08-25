import java.util.Scanner;

/*
*  输入T+1行，第一行代表输入几行的数  输出T行，每一行输出前面所有数二进制的和（暴力解法）
* */
public class BinaryZhuan {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[]bi =new int[n];
        int[]count = new int[5];
        for (int i = 0; i <n ; i++) {
            bi[i] = reader.nextInt();
                reader.nextLine();
        }
        for (int i = 0; i <n; i++) {
            count[i]=binary(bi[i]);
            System.out.println(count[i]);
        }

    }

    public static int binary(int n){
        int count=0;
        if(n<0||n>10000000){
            return 0;
        }

        for(int i=1;i<=n;i++){
            int num=i;
            while (num!=0){

                if(num%2==1){
                    count=count+1;
                }
                num=num/2;

            }
        }
        return count;
    }
}
