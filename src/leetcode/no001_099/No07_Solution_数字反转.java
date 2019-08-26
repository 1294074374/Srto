/**
 * 给出�?�? 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转�??

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
 */
package leetcode.no001_099;

public class No07_Solution_数字反转 {
	public static void main(String[] args) {
		No07_Solution_数字反转  s = new No07_Solution_数字反转 ();
		System.out.println(s.reverse(-123));
	}
	public int reverse(int x) {
        boolean flag = false;
        if(x==-0){
            return 0;
        }
        if(x<0){
            flag=true;
        }
        String origin = x+"";
        String reverse = new StringBuffer(origin).reverse().toString();
        if(flag) {
        	reverse ="-"+reverse.substring(0,reverse.length()-1);
        
        }
        int res = 0;
        try {
        	res = Integer.valueOf(reverse);
        }catch(Exception e) {
        	return 0;
        }
		return res;
    }
}
