package com.web.tz;

//用来表示一个节点
public class Node{
     Node previous;//头部，用来指向上一个节点
     Object obj;
     Node next;//尾部，用来指向下一个节点

    public Node() {
    }

    public Node(Node previous, Object obj, Node next) {
        super();
        this.previous = previous;
        this.obj = obj;
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
