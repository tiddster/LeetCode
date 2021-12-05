public class T50 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == Integer.MIN_VALUE)
            return (x == 1 || x == -1) ? 1 : 0;

        if(n<0){
            return myPow(1/x,-n);
        }
        if(n%2 == 1){
            return x*myPow(x,n-1);
        } else {
            return myPow(x*x,n/2);
        }
    }
}
