/**
 * 缁欏畾涓�涓笁瑙掑舰锛屾壘鍑鸿嚜椤跺悜涓嬬殑鏈�灏忚矾寰勫拰銆傛瘡涓�姝ュ彧鑳界Щ鍔ㄥ埌涓嬩竴琛屼腑鐩搁偦鐨勭粨鐐逛笂銆�

渚嬪锛岀粰瀹氫笁瑙掑舰锛�

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
鑷《鍚戜笅鐨勬渶灏忚矾寰勫拰涓郝�11锛堝嵆锛�2聽+聽3聽+聽5聽+聽1聽= 11锛夈��

鏉ユ簮锛氬姏鎵ｏ紙LeetCode锛�
閾炬帴锛歨ttps://leetcode-cn.com/problems/triangle
钁椾綔鏉冨綊棰嗘墸缃戠粶鎵�鏈夈�傚晢涓氳浆杞借鑱旂郴瀹樻柟鎺堟潈锛岄潪鍟嗕笟杞浇璇锋敞鏄庡嚭澶勩��
 */
package leetcode.no101_200;

import java.util.ArrayList;
import java.util.List;

public class No120_Solution_三角形最小路径和 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int x = triangle.size();
		int[][] dp = new int[x][];
		for (int i = 1; i <= x; i++) {
			dp[i-1] = new int[i];
		}
		dp[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < x; i++) {
			dp[i][i] = triangle.get(i).get(i) + dp[i - 1][i - 1];
		}
		for (int i = 2; i < x; i++) {
			for (int j = 1; j < dp[i].length-1; j++) {
				dp[i][j] = Math.min(dp[i - 1][j] + triangle.get(i).get(j), dp[i][j - 1] + triangle.get(i).get(j));
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < x; i++) {
			if (dp[x - 1][i] < min) {
				min = dp[x - 1][i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		No120_Solution_三角形最小路径和  n = new No120_Solution_三角形最小路径和 ();
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);list2.add(4);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(6);list3.add(5);list3.add(7);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(4);list4.add(1);list4.add(8);list4.add(3);
		triangle.add(list1);triangle.add(list2);triangle.add(list3);triangle.add(list4);
		System.out.println(n.minimumTotal(triangle));
	}
}
