package com.traveler.denomination.service;

import com.traveler.denomination.exception.CustomIndexOutOfBondException;
import com.traveler.denomination.utils.ErrorCode;

public class MergeSort {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%d ", arr[i]));
        }
        System.out.println();
    }

    public void sort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {

        int ls = mid - left + 1;
        int rs = right - mid;
        int[] ra = new int[rs];
        int[] la = new int[ls];
        try {
            for (int i = 0; i < ls; i++)
                la[i] = arr[left + i];
            for (int i = 0; i < rs; i++)
                ra[i] = arr[mid + 1 + i];

            int i = 0, j = 0, k = left;

            while (i < ls && j < rs) {
                if (la[i] >= ra[j]) {
                    arr[k] = la[i++];
                } else {
                    arr[k] = ra[j++];
                }
                k++;
            }
            while (i < ls) {
                arr[k++] = la[i++];
            }
            while (j < rs) {
                arr[k++] = ra[j++];
            }

        } catch (IndexOutOfBoundsException e) {
            throw new CustomIndexOutOfBondException(ErrorCode.CUSTOM_INDEX_OUT_OF_BOUNDS, e);
        }

    }
}
