
import java.util.Arrays;

public class LC1838 {
    public static void main(String[] args) {
        
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        int n = nums.length;
        int maxLength = 0;
        int Operation = 0;
        int sum = 0;
        Arrays.sort(nums);

        int l=0;
        int r=0;

        while(r<n){
            sum += nums[r];
            Operation = nums[r] * (r-l+1) - sum;
             
            while(Operation > k){
                sum -= nums[l];
                l++;
                Operation = nums[r] * (r-l+1) - sum;

            }
            
            maxLength = Math.max(maxLength, r-l+1);
            r++;
        }

        System.out.println(maxLength);
    }
}
