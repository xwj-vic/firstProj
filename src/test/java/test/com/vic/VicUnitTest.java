package test.com.vic;

import com.vic.SortMain;
import org.junit.Test;

import static org.junit.Assert.*;

public class VicUnitTest {

    /**
     * 冒泡排序测试
     */
    @Test
    public void testBubboSort() {
        int[] numbers = {38, 5, 8, 98, 58, 10, 100, 50};
        SortMain sortMain = new SortMain();
        int[] ms = sortMain.bubboSort(numbers);
        boolean flag = true;
        for (int i = 0; i < ms.length - 1; i++) {
            if (ms[i] > ms[i + 1]) {
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }

    /**
     * 选择排序测试
     */
    @Test
    public void testSelectSort() {
        int[] numbers = {38, 5, 8, 98, 58, 10, 100, 50};
        SortMain sortMain = new SortMain();
        int[] ms = sortMain.selectSort(numbers);
        boolean flag = true;
        for (int i = 0; i < ms.length - 1; i++) {
            if (ms[i] > ms[i + 1]) {
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }

    /**
     * 二分查找测试
     */
    @Test
    public void testBinarySearch() {
        int[] numbers = {38, 5, 8, 98, 58, 10, 100, 50};
        SortMain sortMain = new SortMain();
        int index = sortMain.binarySearch(numbers, 8);
        assertEquals(index, 2);
    }


}
