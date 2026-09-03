public class Occurence {
    public int lowerBound(int target, int[] arr){

        int n = arr.length;
        int st = 0;
        int end = n-1;
        int lb = -1;
        while(st<=end){
            int mid = (end-st)/2+st;

            if(arr[mid]<target){
                st  = mid+1;
            }else{
                lb = mid;
                end=mid-1;
            }
        }
        return lb;
    }

    public int upperBound(int target, int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n-1;

        int ub=n;

        while(st<=end){
            int mid = (end-st)/2 + st;

            if(arr[mid]<=target){
                st=mid+1;
            }else{
                ub = mid;
                end = mid-1;
            }
        }
        return ub;

    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 2, 2, 3, 4, 5};
        
        Occurence obj = new Occurence();
        int lb=obj.lowerBound(2, arr);
        int ub =obj.upperBound(2, arr);
        System.out.println(ub-lb);
    }
}
