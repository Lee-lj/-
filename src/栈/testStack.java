package ջ;

public class testStack {

	public static void main(String[] args) {
		//����һ��ջ
		Mystack stack = new Mystack();
		//ѹ������
		stack.pushData(9);
		stack.pushData(8);
		stack.pushData(7);
		System.out.println(stack.topData());
		System.out.println(stack.havaData());
		System.out.println(stack.popData());
		System.out.println(stack.popData());
		System.out.println(stack.popData());

	}
}
