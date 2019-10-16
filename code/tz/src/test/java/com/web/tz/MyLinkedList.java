package com.web.tz;

import java.io.Serializable;

public class MyLinkedList implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Node first;//定义一个头结点
	public Node last;//定义一个尾节点
	public int size;

        //添加业务数据
    public void add(Object obj){
                //new一个结点出来
        Node n = new Node();
        Node n2 = new Node();
            //如果是一个新的链表，没有任何数据
        if(first==null){
        //从图示可知，这个时候新增的结点既是头结点也是尾节点，头结点的头部没有任何指向所以设置为null，
       //尾节点的尾部没有任何指向，所以也为null，真正的业务数据放在obj属性里面
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            
            n2.setPrevious(null);
            n2.setObj(obj);
            n2.setNext(null);

            first = n;
            last = n2;
        }else{
            //这个时候我们添加下一个结点，直接往last节点后增加新的节点
        	
        	Node n3 = new Node();
        	n3.setPrevious(last.getPrevious());
        	n3.setObj(last.getObj());
        	n3.setNext(last.getNext());
        	
            n.setPrevious(n3);
            n.setObj(obj);
            n.setNext(null);
            //当前结点尾部要指向新添加进来的结点
            last.setNext(n);
            //此时，新加进来的结点就变成了尾节点
            last = n;
        }
        size++;
    }

     public int size(){
        return size;
    }
     
	public Object get(int index) { // 2
		// 0 1 2 3 4
		Node temp = node(index);
		if (temp != null) {
			return temp.obj;
		}
		return null;
	}

	public Node node(int index) {
		Node temp = null;
		if (first != null) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		return temp;
	}
}