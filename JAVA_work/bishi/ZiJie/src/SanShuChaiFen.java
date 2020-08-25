/*字节跳动第三题  输入一个正整数n 拆分为3个数，使得拆分的数乘积为最大值。
* */
public class SanShuChaiFen {
    public static void main(String[] args) {
        long n=10000L;
        long sum=sums(n);
        System.out.println(sum);
    }

    public static long sums(long n){

        if(n<3)return 0;
        long sum =0L;
        long num=n/3;
        long yu=n%3;

        if(yu==0) sum=num*num*num;
        else if (yu==1) sum=num*num*(num+1);
        else sum=num*(num+1)*(num+1);

        return sum;
    }

}
