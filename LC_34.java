public class LC_34 {


    public int lowerBound(int[] arr, int target){

        int lowerBound = -1;
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (high - low)/2 + low;

            if(arr[mid]==target){
                lowerBound = mid;
                high = mid-1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return lowerBound;
    }
    public int upperBound(int[] arr, int target){

        int upperBound = -1;
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (high - low)/2 + low;

            if(arr[mid]==target){
                upperBound = mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return upperBound;
    }
    public static void main(String[] args) {

        LC_34 obj = new LC_34();
        LC_34 obj1 = new LC_34();

        
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 0;

        System.out.println(obj.lowerBound(arr, target) + " " +  obj1.upperBound(arr, target));


    }
}
