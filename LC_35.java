public class LC_35 {

    public int searchIndex(int[] arr, int target, int n){
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = (end - st)/2 + st;

            if(arr[mid]==target){
                System.out.println(mid);
            }else if(arr[mid] < target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        } 
        return st;
    }
    public static void main(String[] args) {

        LC_35 obj = new LC_35();
        
        int[] arr = {1, 3, 5, 6};
        int n = arr.length;
        int target = 7;

         System.out.println(obj.searchIndex(arr, target, n));
       
    }
}
