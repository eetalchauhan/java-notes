//command not given yet
package BinarySearch;
public class BS4 {
    public static void main(String[] args) {

    }

    //return the index of smallest no>=target
    static int ceiling(char[] arr, char target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }else  {
                return mid;
            }
        }
        return start;
    }
}
