package page2;

import sun.security.provider.MD2;

public class MergeSortedArray88 {


    public static void main(String[] args) {
        new MergeSortedArray88().merge(new int[]{1}, 1, new int[]{}, 0);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1p = 0, m2p = 0, ss = 0;
        int[] copy = new int[m + n];
//
//        while (m1p != m-1 || m2p != n-1) {
//            if (m1p == n) {
//                ss = nums2[m2p++];
//            } else if (m2p == m) {
//                ss = nums1[m1p++];
//            } else if (nums1[m1p] > nums2[m2p]) {
//                ss = nums2[m2p++];
//            } else {
//                ss = nums1[m1p++];
//            }
//            copy[m1p + m2p - 1] = ss;
//        }
//        for (int i = 0; i < copy.length; i++) {
//            nums1[i] = copy[i];
//        }
    }
}
