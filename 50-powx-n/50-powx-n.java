class Solution {
    public double myPow(double x, long n) {
        if(n<0){
            x = 1/x;
            n = -n;
        }
        if(n ==1)
            return x;
        if(x==1)
            return x;
        if(n==0)
            return 1;
        double m = myPow(x,(long) (n/2) );
     
        m*= m;
        if(n % 2 ==1){
            m = m*x;
        }
        return m;
    }
}