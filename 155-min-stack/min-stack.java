class MinStack {
    Node head;
    Node head1;
        class Node{
            int data;
            Node next;
            Node(int val){
                data=val;
                next=null;
            }
        }
        public MinStack(){
            //head=null;
            //head1=null;
        }
    
    public void push(int val) {
       Node nn = new Node(val);
       Node nn1 = new Node(val);
       if(head==null){
        head=nn;
        
       }else{
       nn.next = head;
       head = nn;
    }

    if(head1==null){
        head1=nn1;
    }else{
        if(head1.data>=val){
            nn1.next = head1;
            head1 = nn1;
        }
    }
}
    public void pop() {
       
       if(head.data==head1.data){
        head1=head1.next;
       }
       head=head.next;
    }

    
    public int top() {
        return head.data; 

    }
    public int getMin() {
        return head1.data;
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */