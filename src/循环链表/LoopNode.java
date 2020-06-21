package 循环链表;

import 单链表.Node;

public class LoopNode {//单链表是一列的，首尾不相连  循环链表只是单链表首尾相连
	
	//设置节点内容
	Object data;
	
	//定义下一个节点，类型仍是Node
	LoopNode next=this;
	
	public LoopNode(Object data) {//构造器，其他的方法可以直接使用
		this.data=data;
	}

	//插入节点作为下一个节点（增加结点,同时和前后节点建立联系）
	public void addNode(LoopNode ln) {
		//取出下一个节点，作为下辖一个节点
		LoopNode nextNext=next;
		//新节点作为当前节点的下一个节点
		this.next=ln;
		ln.next=nextNext;
	}
	
	//获取下一个节点
	public LoopNode next() {
		return this.next;
	}
	
	//删除下一个节点
	public void cutLoopNode() {
		LoopNode thirdNode=next.next;
		this.next=thirdNode;
	}
	
	//获取节点中的数据
	public Object getData() {
		return this.data;
	}
}
