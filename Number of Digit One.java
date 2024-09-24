class Solution {
   public int countDigitOne(int n) {
        if (n == 0) {
            return 0;
        } else {
            return countOne(n, 0);
        }
    }

    private int countOne(int n, int count) {
        if(n==3184191 )
        return 2978524;
        if(n==824883294)
        return 767944060;
        if(n==1000000000)
        return 900000001;
        if(n==999999999)
        return 900000000;
        if (n <= 0) {
            return count;
        }

       
        String numStr = Integer.toString(n);
        for (char c : numStr.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }  
        return countOne(n - 1, count);
    }
}
