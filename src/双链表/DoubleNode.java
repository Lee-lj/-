package ˫����;

public class DoubleNode {//˫�����Ϊѭ��˫����Ͳ�ѭ��˫�������������࣬����

	//��һ���ڵ����Ϣ,ѭ��˫������ô������һ���ڵ㣬��һ���ڵ�������Լ�
	DoubleNode before=this;
	//��һ���ڵ�
	DoubleNode next=this;
	
	//�ڵ�����
	Object data;
	
	public DoubleNode(Object data) {
		this.data=data;
	}
	
	//����ڵ�
	public void after(DoubleNode node) {
		//���ҵ���һ���ڵ���Ϊ����һ���ڵ�
		DoubleNode nextNext=next;
	    //�½ڵ���Ϊ��һ���ڵ�
		this.next=node;
		//�ѵ�ǰ�½ڵ��ǰһ����㽨����ϵ
		node.before=this;
		//��ԭ�����¸��ڵ���Ϊ�½ڵ����һ���ڵ�
		node.next=nextNext;
		//��ԭ������һ��������һ���ڵ�Ϊ�½ڵ�
		nextNext.before=node;
 	}
	
	//��ȡ��һ���ڵ�
	public DoubleNode next() {
		return this.next;
	}
	
	//��ȡ��һ���ڵ�
	public DoubleNode before() {
		return this.before;
	}
	
	//��ȡ����
	public Object getData() {
		return this.data;
	}
}
