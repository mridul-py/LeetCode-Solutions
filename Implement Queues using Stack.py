class MyQueue {
    ArrayDeque<Integer> L;
    public MyQueue() {
        L=new ArrayDeque<>();
    }
    
    public void push(int x) {
        L.offerLast(x);
    }
    
    public int pop() {
        return L.pollFirst();
    }
    
    public int peek() {
        return L.peek();
    }
    
    public boolean empty() {
        return L.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
