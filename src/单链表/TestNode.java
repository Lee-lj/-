package ������;

public class TestNode {

	public static void main(String[] args) {
		//�����ڵ�
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		/*n1.append(n2);//ָ��n1����һ���ڵ�Ϊn2  ��һ�ַ���
		n2.append(n3);//ָ��n2����һ���ڵ�Ϊn3
        //ȡ����һ���ڵ�
		System.out.println(n1.next().getData());
		System.out.println(n2.next().getData());*/

		//ʹ���˵ڶ��ַ�����������ӽڵ�
		/*n1.append(n2);
		n1.append(n3);//��Ȼ��n1���ӣ�����3��2֮�����ӣ�����3��ǰһ�����Ϊ2
		System.out.println(n1.next().next().getData());//���Ϊ3*/
		
		//ʹ���˵����ַ���������ֱ��append��Ҳ����ֱ��New ��һ���ڵ�           ��ʽ���
		n1.append(n2).append(n3).append(new Node(4));
		System.out.println(n1.next().next().next().getData());
		
		//�ж�һ���ڵ��Ƿ�Ϊ���һ���ڵ�
		System.out.println(n1.isLast());
		System.out.println(n1.next().next().next().isLast());
		
		n1.next().remove();//ɾ�������Žڵ�
		
		n1.show();
		
		n1.after(new Node(5));
		n1.show();
		
		//����һ���ڵ�ȡ��N���ڵ�֮��Ľڵ�����ݣ�ȡ�����ж��ٸ�next
		//����System.out.println(n1.next().next().xxxx.next());
	}

}
