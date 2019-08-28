package leetcode.no400_499;

import java.util.HashMap;
import java.util.Map;

public class No468_Solution_检验IP地址 {
	Map<Character, Integer> map = new HashMap<Character, Integer>();

	public void init() {
		map.put('0', 0);
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);
		map.put('A', 10);
		map.put('B', 11);
		map.put('C', 12);
		map.put('D', 13);
		map.put('E', 14);
		map.put('F', 15);
		map.put('a', 10);
		map.put('b', 11);
		map.put('c', 12);
		map.put('d', 13);
		map.put('e', 14);
		map.put('f', 15);
	}

	public String validIPAddress(String IP) {
		init();
		if (IP.length() > 40 || IP.length() == 0) {
			return "Neither";
		}
		if (checkIPv4(IP)) {
			return "IPv4";
		}
		if (checkIPv6(IP)) {
			return "IPv6";
		}
		return "Neither";
	}

	private boolean checkIPv6(String ip) {

		String[] str = ip.split("\\:");
		if (str.length != 8) {
			return false;
		}
		if (ip.charAt(ip.length() - 1) == ':') {
			return false;
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() == 0) {
				return false;
			}
			if (str[i].length() > 4) {
				return false;
			}
			int num = str16to10(str[i]);
			if (num == -1) {
				return false;
			}
			if ((i == 0 && num == 0) || num > 65536 || num < 0) {
				return false;
			}
		}
		return true;
	}

	private int str16to10(String str) {
		int len = str.length();
		StringBuffer s = new StringBuffer(str);
		String string = s.reverse().toString();
		if (len == 0) {
			return 0;
		}
		int res = 0;
		for (int i = 0; i < len; i++) {
			if (map.get(string.charAt(i)) == null) {
				return -1;
			}
			int a = map.get(string.charAt(i));
			int b = (int) Math.pow(16, i);
			res = res + a * b;
		}
		return res;
	}

	private boolean checkIPv4(String ip) {
		String[] str = ip.split("\\.");
		if (str.length != 4) {
			return false;
		}
		if (ip.charAt(ip.length() - 1) == '.') {
			return false;
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("")) {
				return false;
			}
			if (str[i].charAt(0) == '0' && str[i].length() > 1) {
				return false;
			}
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) < '0' || str[i].charAt(j) > '9') {
					return false;
				}
			}
			int num = Integer.valueOf(str[i]);
			if ((i == 0 && num == 0) || num > 255 || num < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		No468_Solution_检验IP地址 n = new No468_Solution_检验IP地址();
		String IP = "197.0.0.1";
		System.out.println(n.validIPAddress(IP));
	}
}
