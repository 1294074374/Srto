package leetcode.no001_099;

public class No29_Solution_两数相除 {
	/**
	 * 给定两个整数，被除数 dividend 和除数 divisor。 将两数相除，要求不使用乘法、除法和 mod 运算符。
	 * 返回被除数 dividend 除以除数 divisor 得到的商 除数倍增+迭代
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public int divide(int dividend, int divisor) {
		// 排除特殊情况
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;
		// 计数器
		int count = 0;
		// 记录加倍前的doubledivisor
		int tmpdivisor = divisor;
		// 记录加倍后的doubledivisor
		int doubledivisor = tmpdivisor;
		// 记录加倍前的counttime
		int counttime = 1;
		// 记录加倍前的counttime
		int doublecounttime = counttime;
		while (dividend != 0) {
			// 恢复初始情况
			tmpdivisor = divisor;
			doubledivisor = tmpdivisor;
			counttime = 1;
			doublecounttime = counttime;
			// 这样判断可以避免溢出,不要用abs()
			if ((dividend <= 0 && divisor < 0 && dividend <= divisor)
					|| (dividend >= 0 && divisor > 0 && dividend >= divisor)
					|| (dividend <= 0 && divisor > 0 && dividend <= 0 - divisor)
					|| (dividend >= 0 && divisor < 0 && 0 - dividend <= divisor)) {
				// 除数和被除数同号的情况,防止溢出
				while ((dividend <= 0 && divisor < 0 && dividend <= doubledivisor
						&& (Integer.MIN_VALUE - doubledivisor) <= doubledivisor)
						|| (dividend >= 0 && divisor > 0 && dividend >= doubledivisor
								&& (Integer.MAX_VALUE - doubledivisor) >= doubledivisor)
						|| (dividend <= 0 && divisor > 0 && dividend <= 0 - doubledivisor
								&& (Integer.MIN_VALUE + doubledivisor) <= 0 - doubledivisor)
						|| (dividend >= 0 && divisor < 0 && 0 - dividend <= doubledivisor)
								&& (Integer.MAX_VALUE + doubledivisor) >= 0 - doubledivisor) {
					// 记录加倍前的doubledivisor,counttime
					tmpdivisor = doubledivisor;
					counttime = doublecounttime;
					// 加倍,注意不能超过范围
					doubledivisor += doubledivisor;
					doublecounttime += doublecounttime;
				}
				// 更新数值
				count += (dividend <= 0 && divisor < 0) || (dividend >= 0 && divisor > 0) ? counttime : 0 - counttime;
				dividend -= (dividend <= 0 && divisor < 0) || (dividend >= 0 && divisor > 0) ? tmpdivisor
						: 0 - tmpdivisor;

			} else {
				return count;
			}
		}
		return count;
	}
}
