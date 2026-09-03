
import java.util.Arrays;

public class Floorceil {
    public int[] lbub(int target, int[] arr){

        int lb = -1;
        int ub = -1;
        int n = arr.length;
        int st = 0;
        int end = n-1;

        while(st<=end){
            int mid = (end - st)/2 + st;

            if(arr[mid]<=target){
                lb = arr[mid];
                st = mid+1;
            }else{
                ub = arr[mid];
                end = mid-1;
            }
        }
        return new int[]{lb, ub};
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 7, 9, 12};

        Floorceil obj = new Floorceil();
        int[] result = obj.lbub(6, arr);
        System.out.println(Arrays.toString(result));
    }
}
