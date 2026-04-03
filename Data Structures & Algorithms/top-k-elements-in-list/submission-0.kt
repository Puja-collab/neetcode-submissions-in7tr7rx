class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val map = HashMap<Int,Int>()
        var arr = listOf<Int>()


        for(element in nums){

           map[element] = map.getOrDefault(element,0)+1

        }

       val sorted =  map.entries.sortedByDescending{ it.value}

       return sorted.take(k).map{
        it.key
       }.toIntArray()

      

    }
}
