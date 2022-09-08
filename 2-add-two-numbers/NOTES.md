As long as one of l1.val, l2.val, carry is not 0 or null, we keep adding, hence the loop

'''
while (l1 != null || l2 != null || carry != 0) {
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            ListNode cur = new ListNode(sum % 10); 
            carry = sum / 10;
            prev.next = cur;
            prev = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
'''
