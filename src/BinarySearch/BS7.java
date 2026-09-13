package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/?envType=problem-list-v2&envId=array
public class BS7 {
    public static void main(String[] args){
        int[] arr={1,2,3,45,667,45,2,1};
        int target=2;
        int ans= mountain(arr);
        System.out.println(ans);
    }
    public static int mountain(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the dec part of array
                // this may be the ans, but look at left
                //this is why end != mid -1
                end = mid;
            } else {
                start = mid + 1;
                //mid+1 is greater than mid
            }
        }
        // in end, start==end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in above 2 checks
        //hence, when they are pointing to st one element, i.e. max one coz thats what checks says
        //more elaboration: at every point of time for start and end, they have the best possible ans till that time
        //and if only one item is remaining then that is the best possible ans
        return start;
    }

}
