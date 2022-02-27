class Solution:
    def optimalDivision(self, nums: List[int]) -> str:
        if len(nums) == 1:
            return str(nums[0])
        if len(nums) == 2:
            return str(nums[0]) + "/" + str(nums[1])
        string = str(nums[1])
        for i in range(2,len(nums)):
            string+= "/"+str(nums[i])  
        return str(nums[0]) + "/(" + string + ")"