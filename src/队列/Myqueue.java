package ����;

public class Myqueue {
		//���к�ջ��װ���ӵ��෴���Ƚ��ȳ����ײ���Ȼʹ��������ʵ��
        int[] elements;
        
        public Myqueue() {
        	elements=new int[0];
        }
        
        //���
        public void addIn(int element) {//��ӣ������ݴ������
        	int[] arr=new int[elements.length+1];
        	for(int i=0;i<elements.length;i++) {
        		arr[i]=elements[i];
        	}
        	arr[elements.length]=element;
        	elements=arr;
     	}
        
        //һ�����ݳ���
        public int poll() {
        	//���еĳ������Ƚ��ȳ���һ������һ����ڣ��ӵ�һλȡ����
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
        	throw new NullPointerException("����Ϊ��");
        }
     }    	
        
        //�ж϶����Ƿ�Ϊ��
        public boolean havaData() {
        	return elements.length==0?false:true;
        }

}
