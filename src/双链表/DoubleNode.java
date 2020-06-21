package 双链表;

public class DoubleNode {//双链表分为循环双链表和不循环双链表，跟单链表差不多，但是

	//上一个节点的信息,循环双链表，那么他的上一个节点，下一个节点就是他自己
	DoubleNode before=this;
	//下一个节点
	DoubleNode next=this;
	
	//节点数据
	Object data;
	
	public DoubleNode(Object data) {
		this.data=data;
	}
	
	//插入节点
	public void after(DoubleNode node) {
		//先找到下一个节点作为下下一个节点
		DoubleNode nextNext=next;
	    //新节点作为下一个节点
		this.next=node;
		//把当前新节点的前一个结点建立联系
		node.before=this;
		//让原来的下个节点作为新节点的下一个节点
		node.next=nextNext;
		//让原来的下一个结点的上一个节点为新节点
		nextNext.before=node;
 	}
	
	//获取下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	//获取上一个节点
	public DoubleNode before() {
		return this.before;
	}
	
	//获取数据
	public Object getData() {
		return this.data;
	}
}
