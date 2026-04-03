class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        var sMap = HashMap<Char,Int>()
        var tMap = HashMap<Char,Int>()

        var charS = s.toCharArray()
        var charT = t.toCharArray()

        for(char in charS){
            sMap.put(char, sMap.getOrDefault(char,0)+1)
        }

        for(char in charT){
            tMap.put(char, tMap.getOrDefault(char,0)+1)
        }

        return sMap == tMap

    }
}
