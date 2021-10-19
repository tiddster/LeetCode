import java.util.ArrayList;
import java.util.List;

/*
给定一个从1 到 n 排序的整数列表。
首先，从左到右，从第一个数字开始，每隔一个数字进行删除，直到列表的末尾。
第二步，在剩下的数字中，从右到左，从倒数第一个数字开始，每隔一个数字进行删除，直到列表开头。
我们不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
返回长度为 n 的列表中，最后剩下的数字。
 */
public class T390_1 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }
    public static int lastRemaining(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) list.add(i+1);
        int count = 0;
        while(list.size() != 1){
            if(count%2==0){
                for(int i=0; i<list.size(); i+=2){
                    System.out.print(list.get(i));
                    list.remove(i);
                }
            } else {
                for(int i=list.size()-1; i>=0; i-=2){
                    System.out.print(list.get(i));
                    list.remove(i);
                }
            }
            System.out.println();
            count++;
        }
        return list.get(0);
    }
}
