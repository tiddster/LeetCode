import java.util.ArrayList;
import java.util.List;

public class T969 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int n = arr.length; n > 1; n--){
            int index = 0;
            for(int i = 1; i < n; i++){
                if (arr[i] >= arr[index]) {
                    index = i;
                }
            }
            if (index == n - 1) {
                continue;
            }
            reverse(arr, index);
            reverse(arr, n-1);
            res.add(index+1);
            res.add(n);
        }
        return res;
    }

    public void reverse(int[] a, int r){
        for(int i=0, j=r;i<j;i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
