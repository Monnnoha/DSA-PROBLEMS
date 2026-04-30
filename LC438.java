import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC438 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        String s = "cbaebabacd";
        String p = "abc";

        int[] freq = new int[26];
        int[] wind = new int[26];

        for(int i = 0; i<p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }
        int n = s.length();
        int k = p.length();

        int l=0;
        int r=0;
        while(r<n){
            wind[s.charAt(r) - 'a']++;
            while(r-l+1 > k){
                wind[s.charAt(l) - 'a']--;
                l++;
            }

            if(r-l+1 == k){
                if(Arrays.equals(freq, wind)){
                    list.add(l);
                }
            }
            r++;
        }

            System.out.println(list);
        
    }
}
