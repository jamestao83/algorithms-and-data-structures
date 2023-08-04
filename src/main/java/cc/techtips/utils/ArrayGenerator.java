package cc.techtips.utils;

import java.util.Random;

/**
 * 数组生成器
 *
 * @author James
 */
public class ArrayGenerator {

    private ArrayGenerator() {}

    /**
     * 生成有序的数组
     *
     * @param n 数组大小
     * @return 有序的数组
     */
    public static Integer[] generateSortedArray(int n) {

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * 生成无序的数组
     *
     * @param n   数组大小
     * @param max 随机数的最大值 [0, max)
     * @return 无序的数组
     */
    public static Integer[] generateRandomArray(int n, int max) {

        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(max);
        }
        return arr;
    }
}
