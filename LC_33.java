public class LC_33 {

    public int searchRotate(int target, int[] arr){

        int n = arr.length;
        int st = 0;
        int end = n-1;

        while(st<=end){
            int mid = (end-st)/2 + st;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[st]<=arr[mid]){

                if(arr[st]<=target && target < arr[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                if(arr[mid]<=target && target < arr[end]){
                    st= mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};
        LC_33 obj = new LC_33();
        System.out.println(obj.searchRotate(3, arr));
    }

}
