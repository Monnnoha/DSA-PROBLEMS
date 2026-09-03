public class LC_81 {

    public boolean dupsearchRotate(int target, int[] nums){

        int n = nums.length;

        int st =0;
        int end =n-1;

        while(st<=end){
            int mid = (end-st)/2 + st;

            if(nums[mid]==target){
                return true;
            }

            if(nums[st]==nums[mid] && nums[mid]==nums[end]){
                st++;
                end--;
                continue;
            }
            if(nums[st]<=nums[mid]){
                if(nums[st]<=target && target < nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(nums[mid]<target && target <= nums[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int target;
        int[] nums = {1, 2, 3, 1, 1, 1, 1};

        LC_81 obj = new LC_81();
        System.out.println(obj.dupsearchRotate(1, nums));
    }
}
