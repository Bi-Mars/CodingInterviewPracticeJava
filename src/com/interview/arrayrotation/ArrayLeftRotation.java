package com.interview.arrayrotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLeftRotation {

	public static void ps(int[] in) {
	System.out.println(Arrays.toString(in));
	}
	
	public static int[] arrayLeftRotation(int[] a, int d) {
		int begin = 0;
		int end = 0;
		for(int i = 0; i < d; i++) {
			begin = a[0];
			end = a[a.length-1];
			for(int j = 1; j < a.length-1; j++) {
				a[j-1] = a[j];
			}
			a[a.length - 1] = begin;
			a[a.length - 2] = end;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		int d = 4;
		int[] a = {1,2,3,4,5,6};
		int[] output = {5,6,1,2,3,4};
		int[] res = arrayLeftRotation(a,d);
		
		if ( Arrays.equals(output, res))
			System.out.println("Pass");
		else
			System.out.println("Failed");
	}
}
