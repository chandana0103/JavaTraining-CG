package com.lambda;

public class Exercise2 {

		public static void main(String[] args) {

			StringBuffer sb = new StringBuffer();
			space obj = (str) -> {
				for (int i = 0; i < str.length(); i++) {
					sb.append(str.charAt(i) + " ");
				}
				return sb;
			};
			StringBuffer str2 = obj.Space("CG");
			System.out.println(str2);
		}

	}
	
interface space {
	public StringBuffer Space(String str);
}

