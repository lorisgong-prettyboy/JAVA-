package src;

import java.util.HashMap;

/*
*
*
* */
public class leetcode567 {

    public boolean minWindow(String s, String t) {
        //首先确定所需要用到的变量
        int count=0;//用于处理窗口中的字符和target之间字符之间关系的计数
        int left=0;//左边滑动窗口
        int right=0;//右边滑动窗口
        int MinLen=Integer.MAX_VALUE;//初始化窗口之间的值
        int start=0,end=0;
        boolean c=false;
        //创建两个hashmap，用来存储目标字符串个数的次数，以及滑动窗口的字符串个数次数
        HashMap<Character,Integer> needs = new HashMap<>();
        HashMap<Character,Integer> window= new HashMap<>();

        //初始化needs
        for (int i = 0; i <t.length() ; i++) {
            needs.put(t.charAt(i),needs.getOrDefault(t.charAt(i),0)+1);
        }

        //接下来进行获取字符的操作
        while (right<s.length()){
            //获取右窗口的字符
            char temp = s.charAt(right);
            //如果needs包含了temp这个值
            if (needs.containsKey(temp)){
                window.put(temp,window.getOrDefault(temp,0)+1);//将need含有的所有的字符添加到window窗口中
                if(window.get(temp).compareTo(needs.get(temp))==0){
                    count++;
                }
            }
            //若needs不包含temp那就直接右边界++
            right++;
            //当count和needs的数组长度相同时，表示当前窗口包含了所有target所满足的字符以及数量
            while (count == needs.size()){

                if(right-left<MinLen){
                    start=left;
                    end =right;
                    MinLen=end-start;
                }

                char ltemp = s.charAt(left);

                if (needs.containsKey(ltemp)){
                    window.put(ltemp,window.getOrDefault(ltemp,1)-1);
                    if (window.get(ltemp)<needs.get(ltemp))
                        count--;
                }
                left++;
            }

        }
        if (MinLen==t.length()){
            c=true;
        }
        return c;
    }
}
