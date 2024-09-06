fun main() {
  removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
  removeDuplicates(intArrayOf(1,1,2))
}

fun removeDuplicates(nums: IntArray): Int {
  return if (nums.isEmpty()) 0 else {
    var count = 1
    var currNumber = nums[0]
    for (i in 1 until nums.size) {
      if (currNumber != nums[i]) {
        currNumber = nums[i]
        nums[count] = currNumber
        count++
      }
    }
    count
  }
}
