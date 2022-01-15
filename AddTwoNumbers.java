class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        
        int carry = 0;
        
        while(l1 != null || l2 != null) {
            int sum = 0;
            
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            current.next = new ListNode((sum + carry) % 10);
            current = current.next;

            // carry should = 1 if carried
            carry = (sum + carry)/ 10;
             

        }
        
        
        
        if(carry != 0) {
            current.next = new ListNode(carry);
        }
        
        return result.next;
    }
}
