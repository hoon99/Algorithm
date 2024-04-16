class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(Math.max(n, m), Math.min(n, m));
        
        return new int[] {gcd, n*m/gcd};
    }
    
    public int getGcd(int a, int b) {
        
        if (a % b == 0) return b;
        else return getGcd(b, a % b);
    }
}