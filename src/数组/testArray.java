package 数组;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class testArray {

	public static void main(String[] args) {
/*        //创建一个数组，首先定义元素类型,定义数组的长度，动态初始化，直接定义数组的长度
		int[] array=new int[8];
		//获取数组长度
		int lenth=array.length;
		System.out.println(lenth);
		
		//访问数组中的元素:1.获取，     都是通过数组的下标来进行访问
		int numb1=array[0];//获取
		System.out.println(numb1);
		
		//访问数组中的元素:2.赋值
		array[1]=5;
		int numb2=array[1];
		System.out.println(numb2);
		
		
		
		array[2]=6;
		array[3]=7;
		array[4]=8;
		array[5]=9;
		//遍历数组
		for(int i=0;i<lenth;i++) {
			System.out.println("第"+i+"个数为"+array[i]);
		}
*/		
		//创建数组同时为数组中的元素赋值:静态初始化，直接赋值，数组长度就是值的个数
/*		int[]  array1=new int[] {1,2,2,3,4,5,6,8,7,9};
		System.out.println(array1.length);
		
		//使数组长度可变
		int[] array2=new int[] {1,2,3};//数组长度初始化为3
		System.out.println(Arrays.toString(array2));//快速查找数组中的元素
		int insert=4;//要插入的目标元素
		int[] newArr=new int[array2.length+1];//创建一个新数组，将新数组长度设置为原数组长度+1
  		for(int i=0;i<array2.length;i++){
  			newArr[i]=array2[i];//将原数组中的数据放入新数组中
  		}
		newArr[array2.length]=insert;//将目标元素insert放入新数组的最后,原数组的长度恰好是新数组最后一个元素的下标
		System.out.println(Arrays.toString(newArr));
		array2=newArr;//最后用新数组替换掉原始数组
*/		
	    
		/*从数组中删除掉一个元素同时使数组长度减一
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
		 * 面向对象的数组
		 */
		//创建一个可变数组
		MyArray myarray=new MyArray();
		//测试获取数组的长度
		System.out.println(myarray.size());
		//测试王数组中加入新的数据
		myarray.addData(4);
		myarray.addData(5);
		myarray.addData(6);
		myarray.addData(7);
		myarray.addData(8);
		System.out.println(myarray.toString());
		System.out.println(myarray.size());
		
		//测试删除数组中的一个下标为n的数据
		/*myarray.cutData(1);
		System.out.println(myarray.size());
		System.out.println(myarray.toString());
		//查找一个下标为N的元素
		System.out.println(myarray.get(0));
		//插入一个指定位置的数据
		try {
			myarray.insert(1, 6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myarray.size());
		System.out.println(myarray.toString());
		//替换一个指定位置的元素
		myarray.recoverData(1, "hello");
		System.out.println(myarray.toString());
		*/
		
		int index=myarray.searchLine(6);
		System.out.println("所查找的元素下标为"+index);
		System.out.println(myarray.toString());
		int result=myarray.searchTwoDivide(7);
		if(result>=0) {
			System.out.println("所查找的元素下标为"+result);
		}else {
			System.out.print("查询无果");
		}
		
	}

}
