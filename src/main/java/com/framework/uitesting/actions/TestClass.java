package com.framework.uitesting.actions;

import java.lang.reflect.Array;

public class TestClass {
	public static void main(String args[]) {
		char[] input = "Phalguna@#Bammidi".toCharArray();
		int atLoc=0;
		int hashLoc=0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == '@')
				atLoc = i;
			if (input[i] == '#')
				hashLoc = i;
		}
		char[] output = new char[100];
		int j = 0;
		for (int i = input.length-1; i >= 0; i--) {
			if (atLoc == j || hashLoc == j) {
				if (atLoc == j)
					output[j] = '@';
				else
					output[j] = '#';
				j++;
			} else {
				output[j] = input[i];
				j++;
			}

		}
		for (char c : output) {
			System.out.print(c);
		}
	}
}
