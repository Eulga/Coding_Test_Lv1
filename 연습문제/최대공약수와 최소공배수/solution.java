class Solution {
    public int[] solution(int n, int m) {
		int gcd = euclid(n, m);
		return new int[] {gcd, n*m/gcd};
        
    }
    public int euclid(int a, int b) {
        int r = 0;
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
