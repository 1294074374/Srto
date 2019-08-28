package xiaozhao;

public class Ìæ»»×Ö·û {
	// String xml;

	public String replace(String xml) {
		// this.xml = xml;
		StringBuffer strBuffer = new StringBuffer();
		char[] c = xml.toCharArray();
		for (int i = 0; i < c.length-1; i++) {
			strBuffer.append(c[i] + "");
			for (int j = i+1; j < c.length; j++) {
				if (c[i] == 34 && c[j] == 34) {
					((String) xml.subSequence(i, j+1)).replaceFirst(">", "&lt;");
					((String) xml.subSequence(i, j+1)).replaceFirst("<", "&gt;");
					break;
				}
			}
		}
		return strBuffer.toString();
	}
	public static void main(String[] args) {
		Ìæ»»×Ö·û a = new Ìæ»»×Ö·û();
		String xml = "<xml><if test=\"flag>=1\">aaa&gt;&lt;bbb</if></xml>";
		System.out.println(a.replace(xml));
	}
}
