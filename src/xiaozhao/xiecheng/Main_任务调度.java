package xiaozhao.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main_任务调度 {

	/*
	 * 请完成下面这个函数，实现题目要求的功能 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 开始写代码
	 ******************************/

	static int schedule(int m, int[] array) {
		if (array.length == 0 || m < 1 || array == null) {
			return 0;
		}
		int len = array.length;
		if (len < m) {
			// 节点数大于任务数时,只需要返回耗时最长的任务时间即可
			Arrays.sort(array);
			return array[len - 1];
		} else {
			int minTime = 0;
			int maxTime = 0;
			for (int i = 0; i < len; i++) {
				maxTime += array[i];
			}
			while (minTime + 1 < maxTime) {
				int mid = (minTime + maxTime) / 2;
				if (getNumber(array, mid) > m) {
					minTime = mid;
				} else {
					maxTime = mid;
				}
			}
			if (getNumber(array, minTime) == m) {
				return minTime;
			}
			return maxTime;
		}

	}

	static int getNumber(int[] arr, int lim) {
		int res = 1;
		int stepSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > lim) {
				return Integer.MAX_VALUE;
			}
			stepSum += arr[i];
			if (stepSum > lim) {
				res++;
				stepSum = arr[i];
			}
		}
		return res;
	}

	/****************************** 结束写代码 ******************************/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int size = in.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		int res = schedule(m, array);
		System.out.println(String.valueOf(res));
	}
}
