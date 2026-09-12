//raw code for practice
package BinarySearch;
public class  BS5 {
    public static void main(String[] args) {

    }

    static int ans(int[] arr, int target) {
        int start=0;
        int end=1;
        while(target>=arr[end]){
            int temp= start;
            end= end+ (end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(end>target){
                end = mid-1;
            }else if(end<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}