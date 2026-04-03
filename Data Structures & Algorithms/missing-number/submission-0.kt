class Solution {
    fun missingNumber(nums: IntArray): Int {
       var n = nums.size
      // var expectedSum = n * (n+1)/2
      // var actualSum = nums.sum()
      // return expectedSum - actualSum


    // var min = arr.minOrNull()!!
   //  var max = arr.maxOrNull()!!

     val start = 0
    val end = nums.maxOrNull()!!

    println(" $start--- $n")

     for(i in 0..n){
       if(!nums.contains(i)){
        return i
       }
     }
    
     return 0
    }

}
