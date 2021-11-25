public class T458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int times = minutesToTest / minutesToDie;
        int pigs = 0;
        while(Math.pow(times+1,pigs) < buckets){
            pigs++;
        }
        return pigs;
    }
}
