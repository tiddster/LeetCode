public class T540 {
    public int singleNonDuplicate(int[] nums) {
        int  l = 0, r = nums.length-1, m;
        while(l<r){
             m = r+(l-r)/2;
             if(nums[m] == nums[m-1]){
                 if((m-l)%2 == 0){
                     r = m-2;
                 } else {
                     l = m+1;
                 }
             } else if(nums[m] == nums[m+1]){
                 if((m-l)%2 == 0){
                     l = m+2;
                 } else {
                     r = m-1;
                 }
             } else {
                 return nums[m];
             }
        }
        return nums[l];
    }
}
