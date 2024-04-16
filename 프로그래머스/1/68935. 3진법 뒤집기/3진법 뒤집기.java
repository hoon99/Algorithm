class Solution {
    public int solution(int n) {
        int deg = 0;
        
        while(n >= Math.pow(3, deg)) {
            deg++;
        }
        
        String ternary = getTernary(n, deg);
        
        StringBuffer sb = new StringBuffer(ternary);
        String reverse = sb.reverse().toString();
        
        return getDecimal(reverse);
    }
    
    public String getTernary(int num, int deg) {
        StringBuffer sb = new StringBuffer();
        int digit;
        
        for(int i=deg-1; i>=0; i--) {
            digit = num / (int) Math.pow(3,i);
            sb.append(Integer.toString(digit));
            num = num % (int) Math.pow(3,i);
        }
        return sb.toString();
    }
    
    public int getDecimal(String ternary) {
        int decimal = 0;
        for(int i=0; i<ternary.length(); i++) {
            decimal += Character.getNumericValue(ternary.charAt(i)) * Math.pow(3, ternary.length()-1-i);
        }
        return decimal;
    }
}