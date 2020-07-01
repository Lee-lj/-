package 递归;

public class TestHanoiti {

    public static void main(String[] args) {

        hannoti(1, 'A', 'B', 'C');//得到第一个盘子从A移动至C
        hannoti(2, 'A', 'B', 'C');//第一个盘子从A移动至B,第2个盘子从A移动到C,第一个盘子从B移动至C
        hannoti(3, 'A', 'B', 'C');
    }

    /**
     * @param n    共有N个套在柱子上的圈
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标柱子
     */
    //递归实现汉诺塔问题:大小⚪，三个柱子
    public static void hannoti(int n, char from, char in, char to) {
        if (n == 1) {//如果只有一个盘子
            System.out.println("第一个盘子从" + from + "移动至" + to);
        } else {// 无论有多少个盘子，一致认为都只有两个盘子，上面的整体为一个盘子，最下面为一个盘子

            //移动上面的所有盘子到中间位置
            hannoti(n - 1, from, to, in);
            //移动最下面的盘子到目标位置
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            //最后将上面的盘子整体从中间位置移动到目标盘子上
            hannoti(n - 1, in, from, to);

        }
    }
}
