public class SortDemo {

    //1冒泡排序
    public void bubbleSort(int[] a, int n){
        if(n <= 1) return;
        for (int i = 0; i < n; i++){
            //提前退出循环
            Boolean flag = false;
            for (int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;//表示有数据交换
                }
            }
            if(!flag) break;//表示没有数据交换，停止
        }
    }


    //2.插入排序
    public void insertSort(int[] a,int n){
        if (n <= 1) return;
        for (int i = 0 ; i < n; i++){
            int  j = i - 1;
            //查找插入的位置
            for (;j >= 0; j--){
                if(a[j] > a[i]){
                    a[j+1] = a[j];//移动数据
                }else {
                    break;
                }
            }
            a[j+1] = a[i];
        }
    }

    //3.选择排序
    public void selectionSort(int[] a, int n){
        if (n <= 1) return;

        for (int i = 0 ; i < n ; i++){
            int min = i;
            for (int j = i+1 ; j < n ; j++){
                if (a[min] > a[j]){
                    min = j;
                }
                int temp = a[min];
                a[min] = a[j];
                a[i] = temp;
            }

        }
    }


}
