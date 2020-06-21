package 数组;

public class Search2 {

	public static void main(String[] args) {//二分法查找，将一个数组切成两半，判断中间的元素是否小于要查找的元素，大于的话就在左边的数组中，再进行二分，比较，直到查找成功。
		//二分法查找要求目标数组必须是有序的
        int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
        //目标元素
        int target=8;
        
        //记录开始位置
        int begin=0;
        //记录结束位置
        int end=arr.length-1;
        //记录中间的位置
        int mid=(begin+end)/2;
        //记录和元素匹配的下标
        int index=0;
        
        //循环查找
        while(begin<=end) {
        	if(arr[mid]==target) {
        		index=mid;
        		break;
        	}//中间的元素不是要查找的元素
        	else {//判断目标元素和中间元素的大小关系
        		if(arr[mid]>target) {
        			//将结束位置调整到前一个下标
        			end=mid-1;
        		}else {//中间元素比目标元素小,开始位置就加1
        			begin=mid+1;
        		}
        	}
        	mid=(begin+end)/2;//取出新的中间位
        }
        
        System.out.println("要查找的元素下标为"+index);
	}

}
