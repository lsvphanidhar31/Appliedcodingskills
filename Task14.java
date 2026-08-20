class Task14 {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = merge(result, lists[i]);
        }

        return result;
    }
