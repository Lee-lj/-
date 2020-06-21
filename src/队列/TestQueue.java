package ╤сап;

public class TestQueue {

	public static void main(String[] args) {
		
		Myqueue myqueue=new Myqueue();
		myqueue.addIn(2);
		myqueue.addIn(3);
		myqueue.addIn(4);
		myqueue.addIn(5);
		System.out.println(myqueue.havaData());
		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
	}

}
