package ����;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class testArray {

	public static void main(String[] args) {
/*        //����һ�����飬���ȶ���Ԫ������,��������ĳ��ȣ���̬��ʼ����ֱ�Ӷ�������ĳ���
		int[] array=new int[8];
		//��ȡ���鳤��
		int lenth=array.length;
		System.out.println(lenth);
		
		//���������е�Ԫ��:1.��ȡ��     ����ͨ��������±������з���
		int numb1=array[0];//��ȡ
		System.out.println(numb1);
		
		//���������е�Ԫ��:2.��ֵ
		array[1]=5;
		int numb2=array[1];
		System.out.println(numb2);
		
		
		
		array[2]=6;
		array[3]=7;
		array[4]=8;
		array[5]=9;
		//��������
		for(int i=0;i<lenth;i++) {
			System.out.println("��"+i+"����Ϊ"+array[i]);
		}
*/		
		//��������ͬʱΪ�����е�Ԫ�ظ�ֵ:��̬��ʼ����ֱ�Ӹ�ֵ�����鳤�Ⱦ���ֵ�ĸ���
/*		int[]  array1=new int[] {1,2,2,3,4,5,6,8,7,9};
		System.out.println(array1.length);
		
		//ʹ���鳤�ȿɱ�
		int[] array2=new int[] {1,2,3};//���鳤�ȳ�ʼ��Ϊ3
		System.out.println(Arrays.toString(array2));//���ٲ��������е�Ԫ��
		int insert=4;//Ҫ�����Ŀ��Ԫ��
		int[] newArr=new int[array2.length+1];//����һ�������飬�������鳤������Ϊԭ���鳤��+1
  		for(int i=0;i<array2.length;i++){
  			newArr[i]=array2[i];//��ԭ�����е����ݷ�����������
  		}
		newArr[array2.length]=insert;//��Ŀ��Ԫ��insert��������������,ԭ����ĳ���ǡ�������������һ��Ԫ�ص��±�
		System.out.println(Arrays.toString(newArr));
		array2=newArr;//������������滻��ԭʼ����
*/		
	    
		/*��������ɾ����һ��Ԫ��ͬʱʹ���鳤�ȼ�һ
		int[] arr=new int[] {2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int[] arr1=new int[arr.length-1];
		int no=3;
		for(int i=0;i<arr.length;i++) {
			if(i<no) {
				arr1[i]=arr[i];
			}else if(i>no){
				arr1[i-1]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
		arr=arr1;
		System.out.println(Arrays.toString(arr));
		*/
		
		/*
		 * ������������
		 */
		//����һ���ɱ�����
		MyArray myarray=new MyArray();
		//���Ի�ȡ����ĳ���
		System.out.println(myarray.size());
		//�����������м����µ�����
		myarray.addData(4);
		myarray.addData(5);
		myarray.addData(6);
		myarray.addData(7);
		myarray.addData(8);
		System.out.println(myarray.toString());
		System.out.println(myarray.size());
		
		//����ɾ�������е�һ���±�Ϊn������
		/*myarray.cutData(1);
		System.out.println(myarray.size());
		System.out.println(myarray.toString());
		//����һ���±�ΪN��Ԫ��
		System.out.println(myarray.get(0));
		//����һ��ָ��λ�õ�����
		try {
			myarray.insert(1, 6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myarray.size());
		System.out.println(myarray.toString());
		//�滻һ��ָ��λ�õ�Ԫ��
		myarray.recoverData(1, "hello");
		System.out.println(myarray.toString());
		*/
		
		int index=myarray.searchLine(6);
		System.out.println("�����ҵ�Ԫ���±�Ϊ"+index);
		System.out.println(myarray.toString());
		int result=myarray.searchTwoDivide(7);
		if(result>=0) {
			System.out.println("�����ҵ�Ԫ���±�Ϊ"+result);
		}else {
			System.out.print("��ѯ�޹�");
		}
		
	}

}
