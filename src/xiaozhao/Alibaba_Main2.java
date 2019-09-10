package xiaozhao;

import java.util.Scanner;

public class Alibaba_Main2 {

	/** 请完成下面这个函数，实现题目要求的功能 **/
	/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^ **/
	static String getIndexAndLongest(String users) {
		boolean a = false;
		boolean b = false;
		int boy = 0;
		int girl = 0;
		int maxboy = 0;
		int maxgirl = 0;
		while (a && b) {
			for (int i = 0; i < users.length(); i++) {
				if (users.charAt(i) != 'b') {
					maxboy = Math.max(boy, maxboy);
				}
				if (users.charAt(i) != 'g') {
					maxboy = Math.max(girl, maxgirl);
				}
				if (users.charAt(i) == 'b') {
					boy++;
				}
				if (users.charAt(i) == 'g') {
					girl++;
				}
				
			}
		}
		return "b b";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String res;

		String _users;
		try {
			_users = in.nextLine();
		} catch (Exception e) {
			_users = null;
		}

		res = getIndexAndLongest(_users);
		System.out.println(res);
		in.close();
	}
}