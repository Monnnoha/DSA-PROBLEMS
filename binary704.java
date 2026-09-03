public class binary704 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int n = arr.length;

        int target = 9;

        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = (st+end)/2;

            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                st = mid+1;
            }else{
                System.out.println(arr[mid]);
                return;
            }
        }

        System.out.println(-1);
    }
}
