package string.sols;

import java.util.stream.IntStream;

public class AlternateMergingOfstr {

	public static String alternateMergingOfstr(String str1, String str2) {
		// TODO Auto-generated constructor stub
		StringBuilder res = new StringBuilder();
		int maxLength = Math.max(str1.length(), str2.length());
		for (int i = 0; i < maxLength; i++) {
			if (i < str1.length())
				res.append(str1.charAt(i));
			if (i < str2.length())
				res.append(str2.charAt(i));
		}
		System.out.println(res.toString());
		return res.toString();
	}

	public static String alternateMergingOfstrByLambda(String str1, String str2) {
		int maxLen = Math.max(str1.length(), str2.length());
		StringBuilder res = new StringBuilder();

		IntStream.range(0, maxLen).forEach(i -> {
			System.out.println("Entered in lambda");
			if (i < str1.length())
				System.out.println((res.append(str1.charAt(i))));
			if (i < str2.length())
				System.out.println((res.append(str2.charAt(i))));
		});
		return res.toString();

	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "HACKERRANK";
		String str2 = "LEETCODE";
		System.out.println(alternateMergingOfstrByLambda(str1, str2));
	}
}
