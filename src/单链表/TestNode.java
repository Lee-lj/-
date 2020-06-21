package 单链表;

public class TestNode {

	public static void main(String[] args) {
		//创建节点
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		/*n1.append(n2);//指定n1的下一个节点为n2  第一种方法
		n2.append(n3);//指定n2的下一个节点为n3
        //取出下一个节点
		System.out.println(n1.next().getData());
		System.out.println(n2.next().getData());*/

		//使用了第二种方法的无限添加节点
		/*n1.append(n2);
		n1.append(n3);//虽然给n1增加，但是3在2之后增加，所以3的前一个结点为2
		System.out.println(n1.next().next().getData());//结果为3*/
		
		//使用了第三种方法，可以直接append，也可以直接New 下一个节点           链式编程
		n1.append(n2).append(n3).append(new Node(4));
		System.out.println(n1.next().next().next().getData());
		
		//判断一个节点是否为最后一个节点
		System.out.println(n1.isLast());
		System.out.println(n1.next().next().next().isLast());
		
		n1.next().remove();//删除了三号节点
		
		n1.show();
		
		n1.after(new Node(5));
		n1.show();
		
		//可以一个节点取出N个节点之后的节点的数据，取决于有多少个next
		//例如System.out.println(n1.next().next().xxxx.next());
	}

}
