package first;

public class ToolsL {
	/**
	 * 利用LinkStack将十进制数num转化为二进制数，并将对应的二进制数以字符串的方式返回
	 * 
	 * @param num
	 * @return
	 */
	public static String toBinary(int num) {
		Stack strStack = new LinkStack();
		String result = "";
		for (; num >= 1; num /= 2) {
			strStack.push(num % 2);// 压栈
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();// 出栈存入字符串
		}
		return result;
	}

	/**
	 * 利用LinkStack将十进制数num转化为八进制数，并将对应的八进制数以字符串的方式返回
	 * 
	 * @param num
	 * @return
	 */
	public static String toOctal(int num) {
		Stack strStack = new LinkStack();
		String result = "";
		for (; num >= 1; num /= 8) {
			strStack.push(num % 8);// 压栈
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();// 出栈存入字符串
		}
		return result;
	}

	/**
	 * 利用LinkStack将十进制数num转化为十六进制数，并将对应的十六进制数以字符串的方式返回
	 * 
	 * @param num
	 * @return
	 */
	public static String toHexadecimal(int num) {
		Stack strStack = new LinkStack();
		String result = "";
		for (; num >= 1; num /= 16) {
			strStack.push(toChar(num % 16));// 压栈
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();// 出栈存入字符串
		}
		return result;
	}

	/**
	 * 利用LinkStack将10进制正整数num转换为d进制，d为2、8或者16
	 * 
	 * @param num
	 * @param d
	 * @return
	 */
	public static String toOther(int num, int d) {
		Stack strStack = new LinkStack();
		String result = "";
		if (d != 2 && d != 8 && d != 16) {
			String error = "转换的进制数有错";
			return error;
		} else {
			for (; num >= 1; num /= d) {
				if (d == 16) {
					strStack.push(toChar(num % d));// 压栈
				} else
					strStack.push(num % d);// 压栈
			}
			while (!strStack.isEmpty()) {
				result += strStack.pop().toString();// 出栈存入字符串
			}
		}
		return result;
	}

	public static char toChar(int n) {
		if (n >= 0 && n <= 9) {
			return (char) ('0' + n);
		} else if (n >= 10 && n <= 15) {
			return (char) ('A' + n - 10);
		} else {
			throw new IllegalArgumentException();
		}
	}

}
