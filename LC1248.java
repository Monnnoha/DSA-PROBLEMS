

public class LC1248 {

     public static int atMost(int[] nums, int k){
        int n = nums.length;
        int count= 0;
        int odd = 0;
        int l=0;
        int r=0;
        while(r<n){
            if(nums[r]%2==1){
            odd++;
            }
            while(odd>k){
                if(nums[l]%2==1){
                    odd--;
                }
                l++;
            }
                count += (r-l+1);
            r++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        int result = atMost(nums, k) - atMost(nums, k-1);
        System.out.println(result);
        
        }
}
