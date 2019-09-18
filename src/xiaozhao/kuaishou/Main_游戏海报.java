package xiaozhao.kuaishou;

import java.util.HashSet;
import java.util.Scanner;

public class Main_”Œœ∑∫£±® {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String haibao = in.next();
		HashSet<String> set = new HashSet<String>();
		HashSet<String> resSet = findTotal(set, haibao);
		System.out.println(resSet.size());
		for (String s : resSet) {
			System.out.println(s);
		}
		in.close();
	}

	private static HashSet<String> findTotal(HashSet<String> set, String haibao) {
		StringBuffer buf = new StringBuffer(haibao);
		HashSet<String> resSet = new HashSet<String>();
		if (haibao.length() == 0) {
			return resSet;
		}
		for (int j = 0; j < 26; j++) {
			char insert = (char) ('a' + j);
			resSet.add(insert + haibao);
		}
		for (int j = 0; j < 26; j++) {
			char insert = (char) ('a' + j);
			resSet.add(haibao + insert);
		}
		for (int i = 0; i < haibao.length(); i++) {
			for (int j = 0; j < 26; j++) {
				char insert = (char) ('a' + j);
				buf.insert(i, insert);
				resSet.add(buf.toString());
				buf = new StringBuffer(haibao);
			}
		}

		return resSet;
	}
}
