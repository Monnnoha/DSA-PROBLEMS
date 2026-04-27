public class LC1456 {
    public static void main(String[] args) {
        
        String S = "abciiidef";
        int n = S.length();
        int k = 3;
        int vowel = 0;
        int l=0;
        int r=0;
        int maxVowel = 0;
        while(r<n){
           char ch = S.charAt(r);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }

            if(r-l+1 == k){
                char ch1 = S.charAt(l);
                maxVowel = Math.max(vowel, maxVowel);

                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                    vowel--;
                }
                l++;
            }

            r++;
            }

            System.out.println(maxVowel);
    }
}
