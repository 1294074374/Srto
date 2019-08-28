package leetcode.no900_999;

public class No983_Solution_���Ʊ�� {
	public int mincostTickets(int[] days, int[] costs) {
		int[] dp = new int[365];
		// ��0�컨��Ϊ0
		dp[0] = 0;
		// �� �� ��Ļ���
		int dayTicker = costs[0];
		int weekTicker = costs[1];
		int monthTicker = costs[2];
		// days���±꣬ȷ������365��ʱ���Ա���֪���´����ε����ڡ�
		int dayIdx = 0;
		for (int today = 1; today <= 365; today++) {
			if (dayIdx > days.length) {
				break;
			}
			// ���첻�������� �������������ķ���
			if (today != days[dayIdx]) {
				dp[today] = dp[today - 1];
				continue;
			}
			// �ȴ���һ��������
			dayIdx++;
			// ����������
			// ������Ʊ�Ƿ����
			// ���߿���Ʊ
			// ���ڲ��о�������Ʊ��
			dp[today] = Math.min(
					Math.min(dp[Math.max(0, today - 1)] + dayTicker, dp[Math.max(0, today - 7)] + weekTicker),
					dp[Math.max(0, today - 30)] + monthTicker);
		}
		return dp[days[days.length-1]];
	}
}
