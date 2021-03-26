package cc.techtips.algorithms.sort.selectionsort;

import cc.techtips.utils.ArrayGenerator;
import cc.techtips.utils.SortingTester;

/**
 * @author tao
 */
public class SelectionSortTest {

    public static void main(String[] args) {
        int n = 10_000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingTester.test(SelectionSort.class, arr);
    }
}
