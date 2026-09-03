public class LC_153 {

    public int minBinary(int[] nums){

        int n = nums.length;
        int st = 0;
        int end = n-1;
        
        while(st<end){
            int mid = (end-st)/2 + st;
            if(nums[mid]>nums[end]){
                st=mid+1;
            }else{
                end = mid;
            }
        }


        return nums[st];
    }
    public static void main(String[] args) {
        
        int[] nums = {3, 4, 5, 1, 2};
        LC_153 obj = new LC_153();

        System.out.println(obj.minBinary(nums));
    }
}
