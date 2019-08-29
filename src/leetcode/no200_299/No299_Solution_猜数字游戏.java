package leetcode.no200_299;

import java.util.HashMap;
import java.util.Map;

public class No299_Solution_猜数字游戏 {
	public String getHint(String secret, String guess) {
		Map<Character, Integer> secretMap = new HashMap<Character, Integer>();
		Map<Character, Integer> guessMap = new HashMap<Character, Integer>();
		int A = 0;
		int B = 0;
		for (int i = 0; i < secret.length(); i++) {
			if (secretMap.get(secret.charAt(i)) == null) {
				secretMap.put(secret.charAt(i), 1);
			} else {
				secretMap.put(secret.charAt(i), secretMap.get(secret.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < guess.length(); i++) {
			if (guessMap.get(guess.charAt(i)) == null) {
				guessMap.put(guess.charAt(i), 1);
			} else {
				guessMap.put(guess.charAt(i), guessMap.get(guess.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < guess.length(); i++) {
			if (guess.charAt(i) == secret.charAt(i)) {
				// 捕获一个公牛
				A++;
				guessMap.put(guess.charAt(i), guessMap.get(guess.charAt(i)) - 1);
				secretMap.put(secret.charAt(i), secretMap.get(secret.charAt(i)) - 1);
			}
		}
		for (int i = 0; i < secret.length(); i++) {
			int checkSeret = secretMap.get(secret.charAt(i));
			int checkGuess = 0;
			if (guessMap.get(secret.charAt(i)) == null) {
				checkGuess = 0;
			} else {
				checkGuess = guessMap.get(secret.charAt(i));
			}
			B = B + Math.min(checkGuess, checkSeret);
			secretMap.put(secret.charAt(i), 0);
			if (guessMap.get(secret.charAt(i)) != null) {
				guessMap.put(secret.charAt(i), 0);
			}
		}
		String res = A+"A"+B+"B";
		return res;
	}

	public static void main(String[] args) {
		No299_Solution_猜数字游戏 n = new No299_Solution_猜数字游戏();
		String secret = "1807";
		String guess =  "7810";
		System.out.println(n.getHint(secret, guess));
	}
}
