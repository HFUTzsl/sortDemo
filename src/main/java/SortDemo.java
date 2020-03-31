import java.util.Arrays;

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

    //4.归并排序
        public static void sort(int []arr){
            int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
            sort(arr,0,arr.length-1,temp);
        }
        private static void sort(int[] arr,int left,int right,int []temp){
            if(left<right){
                int mid = (left+right)/2;
                sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
                sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
                merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
            }
        }
        private static void merge(int[] arr,int left,int mid,int right,int[] temp){
            int i = left;//左序列指针
            int j = mid+1;//右序列指针
            int t = 0;//临时数组指针
            while (i<=mid && j<=right){
                if(arr[i]<=arr[j]){
                    temp[t++] = arr[i++];
                }else {
                    temp[t++] = arr[j++];
                }
            }
            while(i<=mid){//将左边剩余元素填充进temp中
                temp[t++] = arr[i++];
            }
            while(j<=right){//将右序列剩余元素填充进temp中
                temp[t++] = arr[j++];
            }
            t = 0;
            //将temp中的元素全部拷贝到原数组中
            while(left <= right){
                arr[left++] = temp[t++];
            }
        }

        //4.快速排序
        void quick_sort(int s[], int l, int r)
        {
            if (l < r)
            {
                //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
                int i = l, j = r, x = s[l];
                while (i < j)
                {
                    while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                        j--;
                    if(i < j)
                        s[i++] = s[j];

                    while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                        i++;
                    if(i < j)
                        s[j--] = s[i];
                }
                s[i] = x;
                quick_sort(s, l, i - 1); // 递归调用
                quick_sort(s, i + 1, r);
            }
        }
    }

