package com.olehbilykh.Sorting.BubbleSort;

import com.olehbilykh.Algorithmes.Sorting.BubbleSort.Handler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HandlerTest {
    /**
     * Method under test: {@link Handler#sortBubbles(int[])}
     */
    @Test
    void testSortBubbles() {
        int[] arr = new int[]{3, 2, 4, 1};
        Handler.sortBubbles(arr);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
        assertEquals(4, arr[3]);
    }
}

