public class Code {
    public static void main(String[] args) {
        int[] nums = {9,11,34,98,24,65,77,53};
        int target = 24;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int arr[], int target){
        if (arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        return -1;
    }
}
