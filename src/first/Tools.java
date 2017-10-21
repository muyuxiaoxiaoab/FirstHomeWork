/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Tools {
	/**
	 * 将十进制数num转化为二进制数，并将对应的二进制数以字符串的方式返回
	 * 
	 * @param num
	 * @return
	 */
	public static String toBinary(int num) {
		Stack strStack=new ArrayStack();
		String result="";
		for (; num >= 1; num /= 2) {
			strStack.push(num % 2);// 压栈
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();//出栈存入字符串
		}
		return result;
	}

	/**
	 * 将十进制数num转化为八进制数，并将对应的八进制数以字符串的方式返回
	 * 
	 * @param num
	 * @return
	 */
	public static String toOctal(int num) {
		Stack strStack=new ArrayStack();
		String result = "";
		for (; num >= 1; num /= 8) {
			strStack.push(num % 8);// 压栈
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();//出栈存入字符串
		}
		return result;

	}
	/**
	 * 将十进制数num转化为十六进制数，并将对应的十六进制数以字符串的方式返回
	 * 
	 * @param num
	 * @return
	 */
	public static String toHexadecimal(int num) {
		Stack strStack=new ArrayStack();
		String result = "";
		for (; num >= 1; num /= 16) {
			strStack.push(toChar(num % 16));// 压栈
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();//出栈存入字符串
		}
		return result;

	}
	/**
	 * 利用栈将10进制正整数num转换为d进制，d为2、8或者16
	 * 
	 * @param num
	 * @param d
	 * @return
	 */
	public static String toOther(int num, int d) {
		Stack strStack = new ArrayStack();
		String result = "";
		for (; num >= 1; num /= d) {
			if (d == 16) {
				strStack.push(toChar(num % d));// 压栈
			} else
				strStack.push(num % d);// 压栈
		}
	while (!strStack.isEmpty()) {
		result += strStack.pop().toString();//出栈存入字符串
	}
	return result;
	}
	/**
	 * 将0-15转化为相应的字符'0'--'9'和'A'--'E'
	 * 
	 * @param n
	 * @return
	 */
	public static char toChar(int n) {
		if (n >= 0 && n <= 9) {
			return (char) ('0' + n);
		} else if (n >= 10 && n <= 15) {
			return (char) ('A' + n - 10);
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * 检验表达式中符号'[]'及'()'是否匹配
	 * 
	 * @param exp
	 * @return
	 */
	public static boolean isMatch(String exp) {
		Stack s = new ArrayStack();
		for (char c : exp.toCharArray()) {
			if (c == '[' || c == '(') {
				s.push(c);
			} else if (c == ']' || c == ')') {
				if (s.isEmpty()) {
					return false;
				}
				char str = (Character) s.pop();
				if (c == ']' && str != '[') {
					return false;
				} else if (c == ')' && str != '(') {
					return false;
				}
			}
		}
		return s.isEmpty();
	}

}
