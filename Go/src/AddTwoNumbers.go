package Go

type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil || l2 == nil {
		return nil
	}
	head := &ListNode{Val: 0, Next: nil}
	current := head
	carryOver := 0

	for l1 != nil || l2 != nil {
		var x, y int
		if l1 == nil {
			x = 0
		} else {
			x = l1.Val
		}
		if l2 == nil {
			y = 0
		} else {
			y = l2.Val
		}
		current.Next = &ListNode{Val: (x + y + carryOver) % 10, Next: nil}
		current = current.Next
		carryOver = (x + y + carryOver) / 10
		if l1 != nil {
			l1 = l1.Next
		}
		if l2 != nil {
			l2 = l2.Next
		}
	}
	if carryOver > 0 {
		current.Next = &ListNode{Val: carryOver % 10, Next: nil}
	}
	return head.Next
}
