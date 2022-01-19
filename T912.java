public class T912 {
    public int[] sortArray(int[] nums) {
        ShellSort(nums, nums.length);
        return nums;
    }

    //直接插入
    public int[] EasyInsert(int[] nums){
        for(int i=0; i< nums.length; i++){
            int temp = nums[i];
            for(int j=i; j>0; j--){
                if(temp<nums[j-1]) nums[j] = nums[j-1];
                else nums[j] = temp;
            }
        }
        return nums;
    }

    //折半插入
    public int[] HalfInsert(int[] nums){
        int mid, low, high;
        for(int i=1; i< nums.length; i++){
            int temp = nums[i];
            low = 0;
            high = i-1;
            while(low<=high){
                mid = (low+high)/2;
                if(temp<nums[mid]) high = mid-1;
                else if(temp>nums[mid]) low = mid+1;
            }
            for(int j=i-1;j>=high+1;j--){
                nums[j+1] = nums[j];
            }
            nums[high+1] = temp;
        }
        return nums;
    }

    void ShellSort(int[] nums,int n){
        for(int dk = n/2;dk>=1;dk=dk/2){
            for(int i=dk;i<n;++i) {
                if(nums[i]<nums[i-dk]){
                    int tmp = nums[i],j;
                    for(j = i-dk;j>=0&&tmp<nums[j];j-=dk){
                        nums[j+dk] = nums[j];
                    }
                    nums[j+dk]=tmp;
                }
            }
        }
    }

    public void QuickSort(int[] nums,int low,int high,int n){
        if(low<high) {
            int pivotpos = Partition(nums,low,high);
            QuickSort(nums,low,pivotpos-1,n);
            QuickSort(nums,pivotpos+1,high,n);
        }
    }
    public int Partition(int[] nums,int low,int high){
        int pivot = nums[low];
        while(low<high) {
            while(low<high && nums[high]>=pivot)--high;
            nums[low] = nums[high];
            while(low<high && nums[low]<=pivot) ++low;
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }

}
