// https://leetcode.com/problems/find-in-mountain-array/?envType=problem-list-v2&envId=array
// find element in mountain array

package BinarySearch;
public class BS8 {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakelement(arr);
        int firstTry = FindInMountain(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            int ans = FindInMountainDescending(arr, target, peak + 1, arr.length - 1);
            return ans;
        }
    }

    public static int peakelement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static int FindInMountain(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int FindInMountainDescending(
            int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


