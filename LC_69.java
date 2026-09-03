public class LC_69 {

    public int sqrt(int x){

        int ans = 0;
        int st = 0;
        int end = x;

        while(st<=end){
            int mid = (end-st)/2 + st;

            if(x == 1){
                return 1;
            }
            else if((long)mid * mid <= x){
                ans = mid;
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {


        LC_69 obj = new LC_69();
        System.out.println(obj.sqrt(4));

    }
}
