/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С ��
 * ���Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
 * ��So Lucky!����LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ�
 *  ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 */
package offer;

import java.util.Arrays;

public class Solution_�˿�˳�� {
	public static void main(String[] args) {
		Solution_�˿�˳�� s = new Solution_�˿�˳��();
		int []numbers = {0,5,6,8,9};
		System.out.println(s.isContinuous(numbers));
	}
	public boolean isContinuous(int[] numbers) {
		// ����
		Arrays.sort(numbers);
		int zero = 0, i = 0;
		for (; i < numbers.length && numbers[i] == 0; i++) {
			zero++; // ͳ��0�ĸ���
		}
		for (; i < numbers.length - 1 && zero >= 0; i++) {
			if (numbers[i] == numbers[i + 1]) // �ж��ӣ��򷵻�false
				return false;
			if (numbers[i] + 1 + zero >= numbers[i + 1]) { // ���Լ���ƥ��
				zero = zero - (numbers[i + 1] - numbers[i] - 1); //0��
				//zero--;
			} else
				return false;
		}
		if (i == numbers.length - 1)
			return true;
		else
			return false;
	}

}
