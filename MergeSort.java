public class MergeSort {
    
    
        public static void mergeSort(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }
            int n = arr.length;
            int mid = n / 2;
    
            // Create left and right subarrays
            int[] left = new int[mid];
            int[] right = new int[n - mid];
    
            // Copy elements to left and right subarrays
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);
    
            // Recursively sort left and right subarrays
            mergeSort(left);
            mergeSort(right);
    
            // Merge the sorted left and right subarrays
            merge(arr, left, right);
        }
    
        public static void merge(int[] arr, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;
    
            // Merge left and right arrays into arr
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }
    
            // Copy remaining elements from left and right arrays if any
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};
            System.out.println("Original Array:");
            printArray(arr);
    
            mergeSort(arr);
    
            System.out.println("Sorted Array:");
            printArray(arr);
        }
    }
    
