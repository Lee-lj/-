package ˫����;

public class TestDoubleNode {

	public static void main(String[] args) {
		
		DoubleNode dn1=new DoubleNode("����");
		DoubleNode dn2=new DoubleNode("�в���");
		DoubleNode dn3=new DoubleNode("gogogo");
		DoubleNode dn4=new DoubleNode("��");
		
		
		System.out.println(dn2.before().getData());
		System.out.println(dn2.getData());
		System.out.println(dn2.next().getData());
		//��ʱ��û�н����ڵ�֮�����ϵ�����Բ鵽�Ķ������Լ�
		//��ʼ׷�ӽڵ�
		dn1.after(dn2);
		dn2.after(dn3);
		dn3.after(dn4);
		//�������֮�����ٽ���dn1��dn4����ϵ�������Լ��Զ�������һ��ѭ��
		System.out.println(dn2.before().getData());
		System.out.println(dn2.getData());
		System.out.println(dn4.next().getData());//����һ��

	}

}
