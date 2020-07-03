package java0703;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-03
 * Time: 18:15
 */

    public class Test1 {//升序排序
        public static void insertSort (int [] arr) {
            for (int bound = 1;bound<arr.length;bound++) {//0--bound是有序区间 bound到size是待排区间
                int  tmp = arr[bound];//创建临时变量保存bound位置元素
                int cur = bound-1;//定义一个cur在bound前面
                for (;cur>=0;cur--) {//从后往前找到合适位置插入
                    if(arr[cur]>tmp) {//如果是大于等于就是不稳定排序
                        arr[cur+1] = arr[cur];//cur需要和tmp交换 cur+1就是tmp
                    }else {
                        break;
                    }
                }
                arr[cur+1]=tmp;//tmp往后走
            }
        }
        public static void main(String[] args) {
            int [] arr = {5,6,7,2,3,1,9};
            insertSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

