package ѭ������;

import ������.Node;

public class LoopNode {//��������һ�еģ���β������  ѭ������ֻ�ǵ�������β����
	
	//���ýڵ�����
	Object data;
	
	//������һ���ڵ㣬��������Node
	LoopNode next=this;
	
	public LoopNode(Object data) {//�������������ķ�������ֱ��ʹ��
		this.data=data;
	}

	//����ڵ���Ϊ��һ���ڵ㣨���ӽ��,ͬʱ��ǰ��ڵ㽨����ϵ��
	public void addNode(LoopNode ln) {
		//ȡ����һ���ڵ㣬��Ϊ��Ͻһ���ڵ�
		LoopNode nextNext=next;
		//�½ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		this.next=ln;
		ln.next=nextNext;
	}
	
	//��ȡ��һ���ڵ�
	public LoopNode next() {
		return this.next;
	}
	
	//ɾ����һ���ڵ�
	public void cutLoopNode() {
		LoopNode thirdNode=next.next;
		this.next=thirdNode;
	}
	
	//��ȡ�ڵ��е�����
	public Object getData() {
		return this.data;
	}
}
