import java.util.Scanner;

/*
T11装水最多的容器
 */
public class T11maxArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] arr){
        int result = 0,area = 0;
        for(int i = 0;i < arr.length;i++){
            int left = arr[i];
            for(int j = arr.length-1;j > i;j--){
                int right = arr[j];
                if(left>right)
                    area = right*(j-i);
                else
                    area = left*(j-i);

                if(area > result)
                    result = area;
            }
        }
        return result;
    }
}
