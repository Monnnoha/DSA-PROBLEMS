public class LC_162 {

    public  int peakFind(int[] nums){

        int st = 0;
        int end = nums.length-1;

        while(st<end){
            int mid = (end-st)/2+ st;

            if(nums[mid]<nums[mid+1]){
                    st = mid+1;
            }else{
                    end = mid;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        LC_162 obj = new LC_162();
        System.out.println(obj.peakFind(nums));
        }
}
