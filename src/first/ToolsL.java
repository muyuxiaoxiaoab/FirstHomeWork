package first;

public class ToolsL {
	/**
	 * ����LinkStack��ʮ������numת��Ϊ����������������Ӧ�Ķ����������ַ����ķ�ʽ����
	 * 
	 * @param num
	 * @return
	 */
	public static String toBinary(int num) {
		Stack strStack = new LinkStack();
		String result = "";
		for (; num >= 1; num /= 2) {
			strStack.push(num % 2);// ѹջ
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();// ��ջ�����ַ���
		}
		return result;
	}

	/**
	 * ����LinkStack��ʮ������numת��Ϊ�˽�������������Ӧ�İ˽��������ַ����ķ�ʽ����
	 * 
	 * @param num
	 * @return
	 */
	public static String toOctal(int num) {
		Stack strStack = new LinkStack();
		String result = "";
		for (; num >= 1; num /= 8) {
			strStack.push(num % 8);// ѹջ
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();// ��ջ�����ַ���
		}
		return result;
	}

	/**
	 * ����LinkStack��ʮ������numת��Ϊʮ����������������Ӧ��ʮ�����������ַ����ķ�ʽ����
	 * 
	 * @param num
	 * @return
	 */
	public static String toHexadecimal(int num) {
		Stack strStack = new LinkStack();
		String result = "";
		for (; num >= 1; num /= 16) {
			strStack.push(toChar(num % 16));// ѹջ
		}
		while (!strStack.isEmpty()) {
			result += strStack.pop().toString();// ��ջ�����ַ���
		}
		return result;
	}

	/**
	 * ����LinkStack��10����������numת��Ϊd���ƣ�dΪ2��8����16
	 * 
	 * @param num
	 * @param d
	 * @return
	 */
	public static String toOther(int num, int d) {
		Stack strStack = new LinkStack();
		String result = "";
		if (d != 2 && d != 8 && d != 16) {
			String error = "ת���Ľ������д�";
			return error;
		} else {
			for (; num >= 1; num /= d) {
				if (d == 16) {
					strStack.push(toChar(num % d));// ѹջ
				} else
					strStack.push(num % d);// ѹջ
			}
			while (!strStack.isEmpty()) {
				result += strStack.pop().toString();// ��ջ�����ַ���
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
