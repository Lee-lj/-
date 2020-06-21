package 数组;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {//面向对象的数组，将数组封装成为一个类，然后这个类包含了对这个已经声明的数组进行增加，修改，删除等等的属性

	private Object[] myarray;//声明这个数组，可以存放任何类型的数据
	
	public MyArray(){//构造方法
		myarray=new Object[0];
	}//相当于创建的时候将数组定义为了Object类的长度为0的数组
	
	public int size() {//获取数组长度的方法
		return myarray.length;
	}
	
	public void addData(int data) {//添加数据的方法
		//创建一个新数组，长度为原来的长度加1
		Object[] newarray=new Object[myarray.length+1];
		//将原来的数组数据复制到新数组中
		for(int i=0;i<myarray.length;i++) {
			newarray[i]=myarray[i];
		}
		//将新加入的数据放入新数组中
		newarray[myarray.length]=data;
		//使用新数组覆盖旧的数组
		myarray=newarray;
	}
	
	public void cutData(int id) {
		//判断下标是否越界
		if(id<0||id>myarray.length-1) {
			System.out.println("下标越界");
		}else {
			Object[] newarray=new Object[myarray.length-1];
			//for循环将原数组中的信息全部复制到新数组中
			for(int i=0;i<newarray.length;i++) {
				if(i<id) {//小于输入的ID，原样进行复制
					newarray[i]=myarray[i];
				}else {//大于或等于输入的ID，原数组的长度，下标均减一进行赋值
					newarray[i]=myarray[i+1];
				}
			}
			myarray=newarray;	
		}
	}
	
	//获取某个位置的元素
	public Object get(int number) {
		return myarray[number];
	}
	
	// 插入某一条数据到指定的位置
	public void insert(int index, Object data) throws Exception {
		Object[] newarray = new Object[myarray.length + 1];
		if (index < 0 || index > myarray.length) {
			throw new Exception("插入位置超出范围");
		} else {// i<位置信息，原样输入，i=位置信息，数据插入；i大于位置信息，下标加1接收数据
			for (int i = 0; i < myarray.length; i++) {
				if (i < index) {
					newarray[i] = myarray[i];
				} /*else{ 
					     if (i == index) {
					    	 newarray[i] = data;
					     }else {
								newarray[i + 1] = myarray[i];
							}有疑问，为什么不能这么写，或者if (i < index) {
					                                  newarray[i] = myarray[i];
				                                                } else  if (i == index) {
					    	                                         newarray[i] = data;
					                                                }else {
							                                        	newarray[i + 1] = myarray[i];）*/
				else {
					newarray[1+1]=myarray[i];
				}
			  newarray[index]=data;
			}
			myarray = newarray;
		}
	}
	
	//替换指定位置的元素
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
	
	//线性查找一个元素所在的下标
	public int searchLine(Object target) {//线性查找元素下标
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]==target) {
				return i;
			}
		}
		return -1;
 	}
	
	//二分法查找一个元素的下标
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
