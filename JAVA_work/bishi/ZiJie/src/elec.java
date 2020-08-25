package src;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Arrays;
import java.util.Collections;

public class elec {

    public static void main(String[] args) {
        int []a = {3,2,1};
        int k = 3;
        int c = (int) shortstimes(a,k);
        System.out.println(c);
    }



    public static int shortstimes(int []nums,int k){
        int times = 0;
        //第一种情况

        if (k>=nums.length-1){
            Arrays.sort(nums);
            times = nums[0];
        }
     else{

         Integer []nums2=new Integer[k];//1
         Integer []nums3=new Integer[nums.length-k];//2
         for (int i = 0; i <nums.length ; i++) {

         }


         Arrays.sort(nums2, Collections.reverseOrder());
         times=nums2[0];
         Arrays.sort(nums3,Collections.reverseOrder());
         times=times+nums3[0];


     }

    return times;
}

}
