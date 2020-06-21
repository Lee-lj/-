package 双链表;

public class TestDoubleNode {

	public static void main(String[] args) {
		
		DoubleNode dn1=new DoubleNode("冲冲冲");
		DoubleNode dn2=new DoubleNode("行不行");
		DoubleNode dn3=new DoubleNode("gogogo");
		DoubleNode dn4=new DoubleNode("买");
		
		
		System.out.println(dn2.before().getData());
		System.out.println(dn2.getData());
		System.out.println(dn2.next().getData());
		//此时还没有建立节点之间的联系，所以查到的都是他自己
		//开始追加节点
		dn1.after(dn2);
		dn2.after(dn3);
		dn3.after(dn4);
		//这样添加之后不用再建立dn1和dn4的联系，他们以及自动构成了一个循环
		System.out.println(dn2.before().getData());
		System.out.println(dn2.getData());
		System.out.println(dn4.next().getData());//测试一下

	}

}
