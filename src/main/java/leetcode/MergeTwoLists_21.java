package leetcode;



/**
 * @author qiaoying
 * @date 2018-12-09 21:10
 */
public class MergeTwoLists_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;}

        if(l2==null){
            return l1;}
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }

    }
}
