package ջ;

public class Mystack {
	
	//ջ�ĵײ�ʹ���������洢����,ջ����ѹ�ӵ����Ƚ����������ȳ�
	int[] elements;
	
	public Mystack() {
		elements = new int[0];
	}
	
	//��ջ��ѹ��Ԫ��
	public void pushData(int element) {
		int[] newarray=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newarray[i]=elements[i];
		}
		newarray[elements.length]=element;
		elements=newarray;//�������������м���Ԫ�صķ����������λ�ò�������element
	}

	//ȡ��ջ��Ԫ��
	public int popData() {
		//ȡ��ջ��Ԫ��:�൱����������һ��Ԫ��
		if(elements.length==0) {//��Ϊ����length-1�������������Ϊ0����ֱ���׳��쳣
			throw new RuntimeException("stack is empty");
		}
		int element=elements[elements.length-1];
		int[] array=new int[elements.length-1];
		for(int i=0;i<elements.length-1;i++) {
			array[i]=elements[i];
		}
        elements=array;
        return element;//����ȡ����ջ��Ԫ��
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean havaData() {
		/*if(elements.length>0) {
			return true;
		}else {
			return false;
		}*/
		return elements.length==0?false:true;
	}
	
	//�鿴ջ��Ԫ��
	public int topData() {
		return elements[elements.length-1];
	}
}
