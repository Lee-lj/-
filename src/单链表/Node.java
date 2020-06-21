package 单链表;

public class Node {//单链表，麻辣香锅存储模式（链式存储）,不同于循环链表，首尾不相连
	//java中对象类型的引用中存储的就是下一个对象的地址，对象引用就是指向对象，就是传地址
	//节点内容
	int data;
	
	//下一个节点，依然是一个Node
	Node next;
	
	public Node(int data) {
		this.data=data;
	}//到这一步就算是创建了节点

	//为节点追加节点（创建下一个节点
	public Node append(Node node) {
		//this.next=node;这个方法只能为一个节点创建下一个节点
		Node currentNode=this;//当前节点，这种方法可以无限添加节点  第三种方法
		//循环向后查找还有没有下一个节点
		while(true) {
			Node nextNode = currentNode.next;//取出下一个节点
			//如果下一个节点为null,当前节点已经是最后一个节点，就break跳出
			if(nextNode==null) {
				break;
			}
			currentNode=nextNode;//将下一个节点赋给当前节点
		}
			//把需要追回的节点追加为找到的当前节点的下一个节点
			currentNode.next=node;	
			return this;
	}
	/*
	 * public void append(Node node) {
		//this.next=node;这个方法只能为一个节点创建下一个节点
		
		Node currentNode=this;//当前节点，这种方法可以无限添加节点  第二种方法
		//循环向后查找还有没有下一个节点
		while(true) {
			Node nextNode = currentNode.next;//取出下一个节点
			//如果下一个节点为null,当前节点已经是最后一个节点，就break跳出
			if(nextNode==null) {
				break;
			}
			currentNode=nextNode;//将下一个节点赋给当前节点
		}
			//把需要追回的节点追加为找到的当前节点的下一个节点
			currentNode.next=node;	
	}
			
	 */
	
	//获取下一个节点
	public Node next() {
		return this.next;
	}
	
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
	
	//删除一个节点(删除当前节点的下一个节点)
	public void remove() {
		Node newNode=next.next;//取到下下一个节点
		this.next=newNode;//指定这个节点的下一个节点为下下一个节点
	}
	
	//显示所有节点信息
	public void show() {
		Node currentNode=this;//指定当前节点信息
		while(true) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
			if(currentNode==null) {
				break;
			}
		}
		System.out.println	();
	}
	
	//插入一个节点  在指定的节点之后插入一个节点，并将原来节点之后的下一个节点连接到插入的节点
	public void after(Node node) {
		//首先取出下一个节点，作为插入节点的下一个节点
		Node nextNextNode=next;
		//将新节点作为当前节点的下一个节点
		this.next=node;
		//将下下一个节点设置为新节点的下一个节点
		node.next=nextNextNode;
	}
	
	//判断当前节点是否是最后一个节点  直接判断下一个节点是否为空
	public boolean isLast() {
		return next==null;
	}
}
