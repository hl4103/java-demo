package com.hlql.sort;

import java.util.Arrays;

public class Bullet {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 12, 4, 6 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
