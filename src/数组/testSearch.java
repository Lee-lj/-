package 数组;

import java.util.Arrays;

public class testSearch {

	public static void main(String[] args) {//输入一个值，对比数组中的所有数据，如果相同，就返回这个数据的下标
        //目标数组
		int[] a=new int[] {1,2,3,4,5,8,9,0};
		//要查找的元素
		int target=0;
		//定义下标
		int index=0;
		//遍历数组中的元素看是否匹配
		for(int i=0;i<a.length;i++) {
			if (a[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
