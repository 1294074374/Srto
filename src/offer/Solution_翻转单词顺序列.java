/**
 * ��Ŀ����
ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У�
���ܰ�����ô��
 */
package offer;

public class Solution_��ת����˳���� {
	public static void main(String[] args) {
		Solution_��ת����˳���� s = new Solution_��ת����˳����();
		String str = " ";
		System.out.println(str.length());
		System.out.println(s.ReverseSentence(str));
	}

	public String ReverseSentence(String str) {
		if (str == null) {
			return null;
		}
		if (str.trim().equals("")) {
			return str;
		}
		String[] strArray = str.split(" ");
		String s = "";
		for (int i = strArray.length - 1; i > -1; i--) {
			if (i == 0) {
				s = s + strArray[i];
			} else {
				s = s + strArray[i] + " ";
			}
		}
		return s;
	}
}
