public class T07ZhengShuFanZhuan2 {
    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
    }
    public static int reverse(int x) {
        long n = 0;
        while(x!=0){
            n = n*10+x%10;
            x = x/10;
        }
        return n<Integer.MAX_VALUE&&n>=Integer.MIN_VALUE ? (int) n :0;
    }
}
