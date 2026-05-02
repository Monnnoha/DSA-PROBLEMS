
import java.util.HashMap;
import java.util.Map;

public class LC992 {
    public static int atMost(int[] nums , int k){
        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        int l=0;
        int r=0;
        while(r<n){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while(map.size() > k){
                map.put(nums[l], map.get(nums[l]) - 1);

                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }

            count += (r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = atMost(nums, k) - atMost(nums, k-1);
        System.out.println(result);
    }
}
