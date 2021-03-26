package cc.techtips.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 排序测试
 *
 * @author tao
 */
public class SortingTester {

    private SortingTester() {
    }

    /**
     * 测试
     *
     * @param clazz 排序算法
     * @param arr   待排序的数组
     * @param <T>   排序算法类型
     * @param <E>   数组中元素的类型
     */
    public static <T, E extends Comparable<E>> void test(Class<T> clazz, E[] arr) {

        long start = System.nanoTime();

        try {
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if ("sort".equals(method.getName())) {
                    method.setAccessible(true);
                    method.invoke(clazz, (Object) arr);
                    break;
                }
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(clazz.getSimpleName() + " exception: " + e.getMessage());
        }

        long end = System.nanoTime();

        if (!isSorted(arr)) {
            throw new RuntimeException(clazz.getSimpleName() + " sort failed");
        }

        double costTime = (end - start) / 1_000_000_000.0;
        System.out.printf("%s, arr size: %d, cost %f s", clazz.getSimpleName(), arr.length, costTime);
    }

    /**
     * 验证数组是否有序
     *
     * @param arr 待验证的数组
     * @param <E> 数组中元素的类型
     * @return 数组是否有序
     */
    private static <E extends Comparable<E>> boolean isSorted(E[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
