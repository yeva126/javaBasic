package com.company.Sort;

import java.util.Arrays;
import java.util.Stack;

public class SortMain {
    static int[] array = {1,4,3,6,5,7,2,8};
    //quick sort
    //递归1
    public static void quickSortRecursive1(int[] arr, int start, int end){
        if (end < start){
            return;
        }
        //把第一个作为标志位
        int flag = arr[start];
        int low = start, high = end;
        while(low < high){
            while (low < high && arr[high] > flag){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] < flag){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = flag;
        quickSortRecursive1(arr, start, high-1);
        quickSortRecursive1(arr, high+1, end);
    }
    //递归2
    public static void quickSortRecursive2(int arr[], int low, int high){
        int left;
        if (low < high){
            left = partition(arr, low, high);
            quickSortRecursive2(arr, low, left-1);
            quickSortRecursive2(arr, left+1, high);
        }
    }
    public static int partition(int[] arr, int left, int right){
        int flag = arr[left];
        while (left < right){
            while (left < right && arr[right] >= flag){
                right--;
            }
            if (left < right){
                arr[left++] = arr[right];
            }
            while (left < right && arr[left] <= flag){
                left++;
            }
            if (left < right){
                arr[right--] = arr[left];
            }
        }
        arr[left] = flag;
        return left;
    }

    //quickSort 非递归 用栈实现
    public static void stack(int[] arr, int left, int right) {
        int top = 0;
        int last = 0;
        Stack<Integer> s = new Stack<>();
        int p =quickSortStack(arr, left, right);
        if (p > left + 1){
            s.push(left);
            s.push(p - 1);
        }
        if (p < right - 1){
            s.push(p + 1);
            s.push(right);
        }
        while (!s.isEmpty()){
            top = s.pop();
            last = s.pop();
            p = quickSortStack(arr, last, top);
            if (p > last+1){
                s.push(last);
                s.push(p-1);
            }
            if (p < top-1){
                s.push(p+1);
                s.push(top);
            }
        }
    }
    public static int quickSortStack(int[] arr, int left, int right){
        int p = left;
        while (left < right){
            while (left < right && arr[p] < arr[right]){
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            p = right;
            while (left < right && arr[p] > arr[left]){
                left++;
            }
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            p = left;
        }
        return p;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr, int low, int high){
        int temp = 0;
        boolean flag = false;
        for (int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            //如果没有发生交换说明排序完成
            if (!flag) {
                break;
            }
        }
    }

    //堆排序
    public static void heapSort(int[] arr){
        for (int i = arr.length-1; i>0; --i){
            max_heapify(arr,i);

            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
        }
    }
    private static void max_heapify(int[] arr, int limit) {
        if (arr.length < limit || arr.length <= 0){
            return;
        }
        int parentId = limit/2;
        for (;parentId >= 0; parentId--){
            int left = parentId * 2;
            int right = (left + 1) > limit? left: (left + 1);
            int maxChild = arr[left] > arr[right]? left: right;
            if (arr[maxChild] > arr[parentId]){
                //堆中数据排序
                int temp = arr[maxChild];
                arr[maxChild] = arr[parentId];
                arr[parentId] = temp;
            }
        }
    }



    public static void main(String[] args) {
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
