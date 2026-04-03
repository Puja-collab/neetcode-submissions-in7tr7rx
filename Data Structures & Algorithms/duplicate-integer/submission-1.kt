class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val map = HashMap<Int,Int>()
    

        for(i in nums){
           map.put(i,map.getOrDefault(i,0)+1)
        }

        for((k,v) in map){
           // Log.d(" $k -- $v")
            if(v >= 2){
                return true
            }
        }

        return false

    }
}
