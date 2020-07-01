package �ݹ�;

public class Recursive {//�ݹ���ָ����/����/�ӳ��������й�������ֱ�ӻ��ӵ���������������������󣬴�ǰ����ɽ��ɽ������������������Ҫ�Եݹ����������������м��ξ�ͣ�����������ջ������洢�ռ䲻���ã�

    public static void main(String[] args) {
        print(10);
    }
	
	/*public static void print(int i) {
		System.out.println(i-1);
		print(i-1);����ǵݹ飬������Եݹ����������������ͻ����-9844Exception in thread "main" java.lang.StackOverflowError ����ջ�������
	}*/

    //�����������ĵݹ�
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i - 1);
            print(i - 1);//��ͷ�ֹ��ջ�����
        }
    }
}
