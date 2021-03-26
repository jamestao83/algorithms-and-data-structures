package cc.techtips.algorithms.sort.selectionsort;

/**
 * 选择排序
 *
 * @author tao
 */
public class SelectionSort {

    private SelectionSort() {}

    /**
     * 排序
     *
     * @param arr 待排序的数组
     * @param <E> 数组中元素的类型
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * 交换数组中两个索引位置的值
     *
     * @param arr 数组
     * @param i   索引
     * @param j   索引
     * @param <E> 数组中元素的类型
     */
    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
