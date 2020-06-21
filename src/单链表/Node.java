package ������;

public class Node {//��������������洢ģʽ����ʽ�洢��,��ͬ��ѭ��������β������
	//java�ж������͵������д洢�ľ�����һ������ĵ�ַ���������þ���ָ����󣬾��Ǵ���ַ
	//�ڵ�����
	int data;
	
	//��һ���ڵ㣬��Ȼ��һ��Node
	Node next;
	
	public Node(int data) {
		this.data=data;
	}//����һ�������Ǵ����˽ڵ�

	//Ϊ�ڵ�׷�ӽڵ㣨������һ���ڵ�
	public Node append(Node node) {
		//this.next=node;�������ֻ��Ϊһ���ڵ㴴����һ���ڵ�
		Node currentNode=this;//��ǰ�ڵ㣬���ַ�������������ӽڵ�  �����ַ���
		//ѭ�������һ���û����һ���ڵ�
		while(true) {
			Node nextNode = currentNode.next;//ȡ����һ���ڵ�
			//�����һ���ڵ�Ϊnull,��ǰ�ڵ��Ѿ������һ���ڵ㣬��break����
			if(nextNode==null) {
				break;
			}
			currentNode=nextNode;//����һ���ڵ㸳����ǰ�ڵ�
		}
			//����Ҫ׷�صĽڵ�׷��Ϊ�ҵ��ĵ�ǰ�ڵ����һ���ڵ�
			currentNode.next=node;	
			return this;
	}
	/*
	 * public void append(Node node) {
		//this.next=node;�������ֻ��Ϊһ���ڵ㴴����һ���ڵ�
		
		Node currentNode=this;//��ǰ�ڵ㣬���ַ�������������ӽڵ�  �ڶ��ַ���
		//ѭ�������һ���û����һ���ڵ�
		while(true) {
			Node nextNode = currentNode.next;//ȡ����һ���ڵ�
			//�����һ���ڵ�Ϊnull,��ǰ�ڵ��Ѿ������һ���ڵ㣬��break����
			if(nextNode==null) {
				break;
			}
			currentNode=nextNode;//����һ���ڵ㸳����ǰ�ڵ�
		}
			//����Ҫ׷�صĽڵ�׷��Ϊ�ҵ��ĵ�ǰ�ڵ����һ���ڵ�
			currentNode.next=node;	
	}
			
	 */
	
	//��ȡ��һ���ڵ�
	public Node next() {
		return this.next;
	}
	
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
	
	//ɾ��һ���ڵ�(ɾ����ǰ�ڵ����һ���ڵ�)
	public void remove() {
		Node newNode=next.next;//ȡ������һ���ڵ�
		this.next=newNode;//ָ������ڵ����һ���ڵ�Ϊ����һ���ڵ�
	}
	
	//��ʾ���нڵ���Ϣ
	public void show() {
		Node currentNode=this;//ָ����ǰ�ڵ���Ϣ
		while(true) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
			if(currentNode==null) {
				break;
			}
		}
		System.out.println	();
	}
	
	//����һ���ڵ�  ��ָ���Ľڵ�֮�����һ���ڵ㣬����ԭ���ڵ�֮�����һ���ڵ����ӵ�����Ľڵ�
	public void after(Node node) {
		//����ȡ����һ���ڵ㣬��Ϊ����ڵ����һ���ڵ�
		Node nextNextNode=next;
		//���½ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		this.next=node;
		//������һ���ڵ�����Ϊ�½ڵ����һ���ڵ�
		node.next=nextNextNode;
	}
	
	//�жϵ�ǰ�ڵ��Ƿ������һ���ڵ�  ֱ���ж���һ���ڵ��Ƿ�Ϊ��
	public boolean isLast() {
		return next==null;
	}
}
