package model;

import java.util.Arrays;

public class ReservationSorter {
    public static Reservation[] mergeSortByTime(Reservation[] arr) {
        if (arr == null || arr.length < 2) return arr;

        int mid = arr.length >>> 1;
        Reservation[] left = Arrays.copyOf(arr, mid);
        Reservation[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSortByTime(left), mergeSortByTime(right));
    }

    private static Reservation[] merge(Reservation[] left, Reservation[] right) {
        int total = left.length + right.length;
        Reservation[] result = new Reservation[total];
        int i = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            result[i++] = left[l].getTime().compareTo(right[r].getTime()) <= 0 ? left[l++] : right[r++];
        }

        while (l < left.length) result[i++] = left[l++];
        while (r < right.length) result[i++] = right[r++];
        return result;
    }
}
