package ����;

public class Search2 {

	public static void main(String[] args) {//���ַ����ң���һ�������г����룬�ж��м��Ԫ���Ƿ�С��Ҫ���ҵ�Ԫ�أ����ڵĻ�������ߵ������У��ٽ��ж��֣��Ƚϣ�ֱ�����ҳɹ���
		//���ַ�����Ҫ��Ŀ����������������
        int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
        //Ŀ��Ԫ��
        int target=8;
        
        //��¼��ʼλ��
        int begin=0;
        //��¼����λ��
        int end=arr.length-1;
        //��¼�м��λ��
        int mid=(begin+end)/2;
        //��¼��Ԫ��ƥ����±�
        int index=0;
        
        //ѭ������
        while(begin<=end) {
        	if(arr[mid]==target) {
        		index=mid;
        		break;
        	}//�м��Ԫ�ز���Ҫ���ҵ�Ԫ��
        	else {//�ж�Ŀ��Ԫ�غ��м�Ԫ�صĴ�С��ϵ
        		if(arr[mid]>target) {
        			//������λ�õ�����ǰһ���±�
        			end=mid-1;
        		}else {//�м�Ԫ�ر�Ŀ��Ԫ��С,��ʼλ�þͼ�1
        			begin=mid+1;
        		}
        	}
        	mid=(begin+end)/2;//ȡ���µ��м�λ
        }
        
        System.out.println("Ҫ���ҵ�Ԫ���±�Ϊ"+index);
	}

}
