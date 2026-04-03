class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        val list = mutableListOf<Int>()
        val index = 0

       for(i in 0 until numbers.size){  

        for (j in i+1 until numbers.size){
            var outer = numbers[i]
            var inner = numbers[j]

            println(" $outer --- $inner")

            if(outer+inner == target){
                list.add(i+1)
                list.add(j+1)
            }

        }

        
       }
         
      
        return list.toIntArray()

    }
}
