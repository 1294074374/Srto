package leetcode.no400_499;

import java.util.HashMap;
import java.util.Map;

public class No405_Solution_数字转换为十六进制数 {
	public String toHex(int num) {
		if (num == -1) {
			return "ffffffff";
		}
		if (num == 0) {
			return "0";
		}
		StringBuffer strBuffer = new StringBuffer();
		Map<Integer, String> map = init();
		while (num > 0) {
			strBuffer.append(map.get(num % 16));
			num = num / 16;
		}
		return strBuffer.reverse().toString();
	}

	private Map<Integer, String> init() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "0");
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		map.put(6, "6");
		map.put(7, "7");
		map.put(8, "8");
		map.put(9, "9");
		map.put(10, "a");
		map.put(11, "b");
		map.put(12, "c");
		map.put(13, "d");
		map.put(14, "e");
		map.put(15, "f");
		return map;
	}

	public static void main(String[] args) {
		No405_Solution_数字转换为十六进制数 n = new No405_Solution_数字转换为十六进制数();
		System.out.println(n.toHex(0));
	}
}
