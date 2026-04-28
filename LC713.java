public class LC713 {
    public static void main(String[] args) {
        
        // optimal approach
        int[] nums = {10, 5, 2, 6};
        int n = nums.length;
        int k=100;
        int maxCount = 0;
        int count = 0;
        int product = 1;
        int l=0;
        int r=0;

        while(r<n){
            product *= nums[r];
            
            while(product>=k){
                product = product/ nums[l];
                l++;
            }
            maxCount += (r-l+1);
            r++;
        }

        System.out.println(maxCount);
    }
}
