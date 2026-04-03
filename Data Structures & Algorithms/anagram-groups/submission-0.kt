class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
     

     var map = HashMap<String,MutableList<String>>()


       for(s in strs){
        // println("$s ")
         val chararr = s.toCharArray()
         val sorted = chararr.sortedArray()
         val joins = sorted.joinToString("")
         println("s- $s.  $chararr  $sorted  $joins  ")
        val key = s.toCharArray().sortedArray().joinToString("")
       
        map.getOrPut(key){ mutableListOf()}.add(s)
       }

      

    //  for(<key_,value_> in map){
    val result = mutableListOf<List<String>>()
    for((k_,v_) in map){
        // println(" $k_,  $v_")
        result.add(v_)
    }



     

return result

      }
}


