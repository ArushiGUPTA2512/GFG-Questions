class Solution {
    public int myAtoi(String s) {
        // code here
        int i = 0;
        int n = s.length();
        while(i<n && s.charAt(i) == ' ')
            i++;
            
        int sign = 1;
        if(i < n && s.charAt(i) == '+')
            i++;
        else if(i < n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        
        long num = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            if (sign == 1 && num > 2147483647L) {
                return 2147483647;
            }

            if (sign == -1 && num > 2147483648L) {
                return -2147483648;
            }

            i++;
        }

        return (int)(num * sign);
    }
}