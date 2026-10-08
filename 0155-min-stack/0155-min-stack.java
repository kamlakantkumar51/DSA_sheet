import java.util.*;
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }else{
            minstack.push(Math.min(val,minstack.peek()));
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }
    
    public int getMin() {
        if(stack.isEmpty()) return -1;
        return minstack.peek();
    }
}