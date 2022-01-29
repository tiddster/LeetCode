/*
给你一个数组 seats 表示一排座位，其中 seats[i] = 1 代表有人坐在第 i 个座位上，seats[i] = 0 代表座位 i 上是空的（下标从 0 开始）。

至少有一个空座位，且至少有一人已经坐在座位上。

亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。

返回他到离他最近的人的最大距离。
 */
public class T849 {
    public int maxDistToClosest(int[] seats) {
        int slow=0, fast=0;
        int max=0;
        for(int i=0; i<seats.length; i++){
            if(seats[i]==1||i==seats.length-1) {
                slow = fast;
                fast = i;
                if((slow==0&&seats[slow]==0)||(i==seats.length-1&&seats[fast]==0)) max = Math.max(max,fast-slow);
                else max = Math.max(max,(fast-slow)/2);
            }
        }
        return max;
    }
}
