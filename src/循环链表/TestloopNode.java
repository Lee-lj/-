package ѭ������;

public class TestloopNode {
	
	public static void main(String[] args) {
		LoopNode lp1=new LoopNode("hello");
		LoopNode lp2=new LoopNode("fighting");
		LoopNode lp3=new LoopNode("allright");
		LoopNode lp4=new LoopNode("gogogo");//����ֻ��ʵ�����ĸ�����ÿһ�������Լ�ѭ��
		
		/*lp1.addNode(lp2);//��lp1��ѭ���м���lp2
		System.out.println(lp1.next().getData());
		System.out.println(lp2.next().getData());//����lp1,lp2�͹�����һ��ѭ����lp1����һ������lp2��lp2����һ������lp1*/
		
		lp1.addNode(lp2);//��lp1��ѭ���м���lp2
		lp2.addNode(lp3);//2�м���3
		lp3.addNode(lp4);//3�м���4��4��Ĭ�Ͼ����ӵ���1
		System.out.println(lp1.next().getData());
		System.out.println(lp2.next().getData());
		System.out.println(lp3.next().getData());
		System.out.println(lp4.next().getData());
	}

}
