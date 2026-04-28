public class LC485 {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 0, 1, 1, 1};
        int n = arr.length;

        int maxLength = Integer.MIN_VALUE;
        int count = 0;
        int l=0;
        int r=0;
        while(r<n){
            if(arr[r]==0){
                l= Math.max(l, r-l+1);
                count = 0;
            }else{
                count++;
            }

            maxLength = Math.max(maxLength, count);
            r++;
        }


        System.out.println(maxLength);
    }
}
