package com.example.fangxy.Utils;

public class QuickSort {

    private QuickSort() {
    }

    private static class Holder {
        private static QuickSort sInstance = new QuickSort();
    }

    public static QuickSort getInsatnce() {
        return Holder.sInstance;
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);

        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;

        while (right >= left) {
            while (right >= left) {
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;

            }

            while (right >= left) {
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    index = left;
                    right++;
                    break;
                }
                left++;
            }

        }

        arr[index] = pivot;
        return index;

    }

}
