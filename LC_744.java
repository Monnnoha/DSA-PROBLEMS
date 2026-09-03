public class LC_744 {
    public static void main(String[] args) {
        
        char[] letters = {'c', 'f', 'j'};
        int n = letters.length;

        char nextGreater = letters[0];

        char target = 'c';

        int low = 0;
        int high = n-1;

        while(low<=high){

            int mid = (high-low)/2+ low;

            if(letters[mid]>target){
                nextGreater = letters[mid];
                high=mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println(nextGreater);
        
    }
}
