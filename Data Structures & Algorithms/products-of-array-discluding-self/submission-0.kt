class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
      
      var intArr = IntArray(nums.size)
      var mult = 1

        for(i in nums.indices){ 

            for(j in nums.indices){ 

             if(i!= j){
                mult*= nums[j]
             }   
             
    
            }

            intArr[i] = mult
            mult = 1


        }
        return intArr


    }
}
