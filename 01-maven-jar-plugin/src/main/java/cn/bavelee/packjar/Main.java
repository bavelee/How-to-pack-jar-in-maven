package cn.bavelee.packjar;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] add = ArrayUtils.add(arr, 4);
        System.out.println(Arrays.toString(add));
    }
}
