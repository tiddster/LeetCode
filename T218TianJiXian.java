/*
城市的天际线是从远处观看该城市中所有建筑物形成的轮廓的外部轮廓。给你所有建筑物的位置和高度，请返回由这些建筑物形成的 天际线 。

每个建筑物的几何信息由数组 buildings 表示，其中三元组 buildings[i] = [lefti, righti, heighti] 表示：

lefti 是第 i 座建筑物左边缘的 x 坐标。
righti 是第 i 座建筑物右边缘的 x 坐标。
heighti 是第 i 座建筑物的高度。
天际线 应该表示为由 “关键点” 组成的列表，格式 [[x1,y1],[x2,y2],...] ，并按 x 坐标 进行 排序 。关键点是水平线段的左端点。列表中最后一个点是最右侧建筑物的终点，y 坐标始终为 0 ，仅用于标记天际线的终点。此外，任何两个相邻建筑物之间的地面都应被视为天际线轮廓的一部分。

注意：输出天际线中不得有连续的相同高度的水平线。例如 [...[2 3], [4 5], [7 5], [11 5], [12 7]...] 是不正确的答案；三条高度为 5 的线应该在最终输出中合并为一个：[...[2 3], [4 5], [12 7], ...]
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T218TianJiXian {
    public static void main(String[] args) {
        int[][] i = new int[][]{{0,2147483646,2147483646}};
        System.out.println(getSkyline(i));
    }
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ListList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<buildings.length; i++){
            list.add(buildings[i][1]);
        }
        int X = Collections.max(list);
        for(int x=buildings[0][0]; x<=X+1; x++) {
            int max = 0;
            for(int i=0; i<buildings.length; i++){
                if(x>=buildings[i][0] && x<=buildings[i][1] && buildings[i][2]>max){
                    max = buildings[i][2];
                    continue;
                }
            }
            List<Integer> List = new ArrayList<>();
            if(ListList.size() == 0){
                List.add(x);
                List.add(max);
                ListList.add(List);
            } else {
                    if(max > ListList.get(ListList.size()-1).get(1)) {
                        List.add(x);
                        List.add(max);
                        ListList.add(List);
                    } else if(max < ListList.get(ListList.size()-1).get(1)){
                        List.add(x-1);
                        List.add(max);
                        ListList.add(List);
                }
            }

        }
        return ListList;
    }
}
