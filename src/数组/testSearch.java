package ����;

import java.util.Arrays;

public class testSearch {

	public static void main(String[] args) {//����һ��ֵ���Ա������е��������ݣ������ͬ���ͷ���������ݵ��±�
        //Ŀ������
		int[] a=new int[] {1,2,3,4,5,8,9,0};
		//Ҫ���ҵ�Ԫ��
		int target=0;
		//�����±�
		int index=0;
		//���������е�Ԫ�ؿ��Ƿ�ƥ��
		for(int i=0;i<a.length;i++) {
			if (a[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
