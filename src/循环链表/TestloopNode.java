package 循环链表;

public class TestloopNode {
	
	public static void main(String[] args) {
		LoopNode lp1=new LoopNode("hello");
		LoopNode lp2=new LoopNode("fighting");
		LoopNode lp3=new LoopNode("allright");
		LoopNode lp4=new LoopNode("gogogo");//这样只是实现了四个链表，每一个都在自己循环
		
		/*lp1.addNode(lp2);//在lp1的循环中加入lp2
		System.out.println(lp1.next().getData());
		System.out.println(lp2.next().getData());//这里lp1,lp2就构成了一个循环，lp1的下一个就是lp2，lp2的下一个就是lp1*/
		
		lp1.addNode(lp2);//在lp1的循环中加入lp2
		lp2.addNode(lp3);//2中加入3
		lp3.addNode(lp4);//3中加入4，4后默认就连接到了1
		System.out.println(lp1.next().getData());
		System.out.println(lp2.next().getData());
		System.out.println(lp3.next().getData());
		System.out.println(lp4.next().getData());
	}

}
