package 栈;

public class testStack {

	public static void main(String[] args) {
		//创建一个栈
		Mystack stack = new Mystack();
		//压入数据
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
