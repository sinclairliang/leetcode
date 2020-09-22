package Go

func maxArea(height []int) int {
	if height == nil || len(height) < 2 {
		return 0
	}
	maxArea := 0
	left := 0
	right := len(height) - 1
	for left < right {
		width := right - left
		high := 0
		if height[left] < height[right] {
			high = height[left]
			left++
		} else {
			high = height[right]
			right--
		}

		temp := width * high
		if temp > maxArea {
			maxArea = temp
		}
	}
	return maxArea
}
