class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        var fMap = mutableMapOf<Char,Int>()
        var sMap = mutableMapOf<Char,Int>()

        for(i in s){
            fMap.put(i,fMap.getOrDefault(i,0)+1)
        }
         for(j in t){
            sMap.put(j,sMap.getOrDefault(j,0)+1)
        }

        return fMap==sMap
    }
}
