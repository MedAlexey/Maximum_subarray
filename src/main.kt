
fun searching(arr: List<Int>):List<Int>{
    var maxSum = arr[0]
    var leftBorder = 0
    var rightBorder = 0
    var minusPosition = -1
    var sum = 0

    for(i in 0..arr.size-1){
        sum += arr[i]

        if(sum > maxSum){
            maxSum = sum
            rightBorder = i
            leftBorder = minusPosition + 1
        }

        if(sum < 0){
            sum = 0
            minusPosition = i
        }
    }

    return (listOf(leftBorder, rightBorder, maxSum))
}