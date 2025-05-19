package model;

import java.util.Arrays;

public class ReservationSorter {
    public static Reservation[] mergeSortByTime(Reservation[] arr) {
        if (arr.length < 2) return arr;

        int mid = arr.length >>> 1;
        Reservation[] left = Arrays.copyOfRange(arr, 0, mid);
        Reservation[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSortByTime(left), mergeSortByTime(right));
    }


}
