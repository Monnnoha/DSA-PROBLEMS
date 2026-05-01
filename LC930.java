public class LC930 {
    public static int atMost(int[] nums, int goal){  
        int n = nums.length;
        int sum=0;
        int count = 0;

        int l=0;
        int r=0;
        while(r<n){
            sum += nums[r];
            while(sum>goal){
                    sum -= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = atMost(nums, goal) - atMost(nums, goal-1);
        System.out.println(result);

    }
}
