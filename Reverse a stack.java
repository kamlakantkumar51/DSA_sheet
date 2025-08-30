import java.util.Stack;
class Solution {
    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, element);
        stack.push(temp);
    }

    static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }
    }
}
