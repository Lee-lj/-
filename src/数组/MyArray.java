package ����;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {//�����������飬�������װ��Ϊһ���࣬Ȼ�����������˶�����Ѿ�����������������ӣ��޸ģ�ɾ���ȵȵ�����

	private Object[] myarray;//����������飬���Դ���κ����͵�����
	
	public MyArray(){//���췽��
		myarray=new Object[0];
	}//�൱�ڴ�����ʱ�����鶨��Ϊ��Object��ĳ���Ϊ0������
	
	public int size() {//��ȡ���鳤�ȵķ���
		return myarray.length;
	}
	
	public void addData(int data) {//������ݵķ���
		//����һ�������飬����Ϊԭ���ĳ��ȼ�1
		Object[] newarray=new Object[myarray.length+1];
		//��ԭ�����������ݸ��Ƶ���������
		for(int i=0;i<myarray.length;i++) {
			newarray[i]=myarray[i];
		}
		//���¼�������ݷ�����������
		newarray[myarray.length]=data;
		//ʹ�������鸲�Ǿɵ�����
		myarray=newarray;
	}
	
	public void cutData(int id) {
		//�ж��±��Ƿ�Խ��
		if(id<0||id>myarray.length-1) {
			System.out.println("�±�Խ��");
		}else {
			Object[] newarray=new Object[myarray.length-1];
			//forѭ����ԭ�����е���Ϣȫ�����Ƶ���������
			for(int i=0;i<newarray.length;i++) {
				if(i<id) {//С�������ID��ԭ�����и���
					newarray[i]=myarray[i];
				}else {//���ڻ���������ID��ԭ����ĳ��ȣ��±����һ���и�ֵ
					newarray[i]=myarray[i+1];
				}
			}
			myarray=newarray;	
		}
	}
	
	//��ȡĳ��λ�õ�Ԫ��
	public Object get(int number) {
		return myarray[number];
	}
	
	// ����ĳһ�����ݵ�ָ����λ��
	public void insert(int index, Object data) throws Exception {
		Object[] newarray = new Object[myarray.length + 1];
		if (index < 0 || index > myarray.length) {
			throw new Exception("����λ�ó�����Χ");
		} else {// i<λ����Ϣ��ԭ�����룬i=λ����Ϣ�����ݲ��룻i����λ����Ϣ���±��1��������
			for (int i = 0; i < myarray.length; i++) {
				if (i < index) {
					newarray[i] = myarray[i];
				} /*else{ 
					     if (i == index) {
					    	 newarray[i] = data;
					     }else {
								newarray[i + 1] = myarray[i];
							}�����ʣ�Ϊʲô������ôд������if (i < index) {
					                                  newarray[i] = myarray[i];
				                                                } else  if (i == index) {
					    	                                         newarray[i] = data;
					                                                }else {
							                                        	newarray[i + 1] = myarray[i];��*/
				else {
					newarray[1+1]=myarray[i];
				}
			  newarray[index]=data;
			}
			myarray = newarray;
		}
	}
	
	//�滻ָ��λ�õ�Ԫ��
	public void recoverData(int position,Object data) {
		Object[] newarr=new Object[myarray.length];
		for(int i=0;i<newarr.length;i++) {
			if(i!=position) {
				newarr[i]=myarray[i];
			}else {
				newarr[i]=data;
			}
		}
		myarray=newarr;
		
	}
	
	//���Բ���һ��Ԫ�����ڵ��±�
	public int searchLine(Object target) {//���Բ���Ԫ���±�
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]==target) {
				return i;
			}
		}
		return -1;
 	}
	
	//���ַ�����һ��Ԫ�ص��±�
	public int searchTwoDivide(int target) {
		//int[] a=new int[myarray.length];
		//System.arraycopy(myarray, 0, a, 0, myarray.length);
		Integer[] a=Arrays.copyOf(myarray,myarray.length,Integer[].class);
		int begin=0;
		int end=a.length-1;
		int mid=(begin+end)/2;
		while(end>=begin) {
			if(a[mid]==target) {
				return mid;	
			}else {
				if(a[mid]>target) {
					end=mid-1;
				}
				else {
					begin=mid+1;
				}
			}
			mid=(end+begin)/2;
		}
		return -1;
	}
	

	@Override
	public String toString() {
		return "MyArray [myarray=" + Arrays.toString(myarray) + "]";
	}
	
}
