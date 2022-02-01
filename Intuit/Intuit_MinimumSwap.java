package com.company;

import java.util.ArrayList;
import java.util.List;

public class Intuit_MinimumSwap {
    public int minSwaps(int[][] grid) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length-1; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    l.add(j);
                    break;
                }
            }
            if (l.size() < i+1) l.add(0);
        }

        int res = 0;
        // System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) <= i) continue;
            int k = -1;
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(j) <= i) {
                    k = j;
                    break;
                }
            }
            if (k == -1) return -1;
            int v = l.remove(k);
            l.add(0, v);
            // System.out.println(l);
            res += k - i;
        }

        return res;
    }
}
