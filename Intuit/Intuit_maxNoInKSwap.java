package com.company;

class Res {
    static String max = "";
}
public class Intuit_maxNoInKSwap {
    public static void back(char[] ar, int k, Res r)
    {
        if (k == 0)
            return;
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (ar[j] > ar[i]) {
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    String st = new String(ar);
                    if (r.max.compareTo(st) < 0) {
                        r.max = st;
                    }
                    back(ar, k - 1, r);
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    public static String findMaximumNum(String str, int k)
    {
        //code here.
        int n = str.length();
        Res r = new Res();
        r.max=str;
        back(str.toCharArray(), k, r);
        return r.max;
    }

}
