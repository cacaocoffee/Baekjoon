class Solution {
    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = numer1 * denom2 + denom1 * numer2;
        int b = denom1 * denom2;
        
        int gcd = getGCD(a, b);
        
        int simplifiedNumer = a / gcd;
        int simplifiedDenom = b / gcd;
        
        int[] answer = {simplifiedNumer, simplifiedDenom};
        
        return answer;
    }
}