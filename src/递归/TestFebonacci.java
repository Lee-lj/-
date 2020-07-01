package

�ݹ�;

import java.util.Arrays;
import java.util.Scanner;

public class TestFebonacci {

    public static void main(String[] args) {
		
		/*//������ʵ�ּ���쳲���������
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�����쳲��������е�����");
		int data=sc.nextInt();
		int[] array=new int[data];
		for(int i=0;i<array.length;i++) {
			if(i==0||i==1) {
				array[i]=1;
				System.out.println(array[i]);
			}else {
				array[i]=array[i-1]+array[i-2];
				System.out.println(array[i]);
			}
		}
		//System.out.println(Arrays.toString(array));  ���ǵڶ��ִ�ӡ��ʽ*/


        // ʹ�õݹ������쳲���������:1,1,2,3,5...�ӵ����ʼ���������Ĵ�С����ǰ�������ĺ�
        for (int i = 1; i < 47; i++)
            System.out.println(febonacci(i));
    }

    //��ӡ��n��쳲���������
    public static int febonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonacci(i - 1) + febonacci(i - 2);
        }
    }

}
