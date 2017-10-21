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
	 * ��ʮ������numת��Ϊ����������������Ӧ�Ķ����������ַ����ķ�ʽ����
	 * 
	 * @param num
	 * @return
	 */
	public static String toBinary(int num) {
		Stack strStack=new ArrayStack();
		String result="";
		for (; num >= 1; num /= 2) {
			strStack.push(num % 2);// ѹջ
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();//��ջ�����ַ���
		}
		return result;
	}

	/**
	 * ��ʮ������numת��Ϊ�˽�������������Ӧ�İ˽��������ַ����ķ�ʽ����
	 * 
	 * @param num
	 * @return
	 */
	public static String toOctal(int num) {
		Stack strStack=new ArrayStack();
		String result = "";
		for (; num >= 1; num /= 8) {
			strStack.push(num % 8);// ѹջ
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();//��ջ�����ַ���
		}
		return result;

	}
	/**
	 * ��ʮ������numת��Ϊʮ����������������Ӧ��ʮ�����������ַ����ķ�ʽ����
	 * 
	 * @param num
	 * @return
	 */
	public static String toHexadecimal(int num) {
		Stack strStack=new ArrayStack();
		String result = "";
		for (; num >= 1; num /= 16) {
			strStack.push(toChar(num % 16));// ѹջ
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();//��ջ�����ַ���
		}
		return result;

	}
	/**
	 * ����ջ��10����������numת��Ϊd���ƣ�dΪ2��8����16
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
				strStack.push(toChar(num % d));// ѹջ
			} else
				strStack.push(num % d);// ѹջ
		}
	while (!strStack.isEmpty()) {
		result += strStack.pop().toString();//��ջ�����ַ���
	}
	return result;
	}
	/**
	 * ��0-15ת��Ϊ��Ӧ���ַ�'0'--'9'��'A'--'E'
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
	 * ������ʽ�з���'[]'��'()'�Ƿ�ƥ��
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
