package 队列;

public class Myqueue {
		//队列和栈的装填子弹相反，先进先出，底层仍然使用数组来实现
        int[] elements;
        
        public Myqueue() {
        	elements=new int[0];
        }
        
        //入队
        public void addIn(int element) {//入队，将数据存入最后
        	int[] arr=new int[elements.length+1];
        	for(int i=0;i<elements.length;i++) {
        		arr[i]=elements[i];
        	}
        	arr[elements.length]=element;
        	elements=arr;
     	}
        
        //一个数据出队
        public int poll() {
        	//队列的出队是先进先出，一个出口一个入口，从第一位取数据
        	boolean flag= havaData();
        	if(flag==true) {
        	int element=elements[0];
        	int[] arr=new int[elements.length-1];
        	for(int i=0;i<elements.length-1;i++) {
        		arr[i]=elements[i+1];
        	}
        	elements=arr;
        	return element;
        }else {
        	throw new NullPointerException("队列为空");
        }
     }    	
        
        //判断队列是否为空
        public boolean havaData() {
        	return elements.length==0?false:true;
        }

}
