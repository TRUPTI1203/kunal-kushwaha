public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,5,8,10,22,47,89,90};
        int target = 47;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if (target > arr[mid]){
                s = mid + 1;
            }
            else if (target < arr[mid]){
                e = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
