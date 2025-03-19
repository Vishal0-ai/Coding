public class sqt {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        while (l <= r) {
            int m = l+(r - l)/2;
            long j =(long)m * m; 
            if (j==x) {
                return m;
            }
            if (j>x) {
                r=m - 1;
            } else {
                l=m + 1;
            }
        }
        return r;  
    }
}
