import java.util.HashSet;

public class Recursionclass1 {
	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	/*
	 * public static boolean[] map = new boolean[26];
	 * static String dupli(String str ,int indx,String newS ){
	 * if(indx == str.length()-1){
	 * return newS;
	 * }
	 * char currchar = str.charAt(indx);
	 * int i = currchar -'a';
	 * if(!map[i]){
	 * map[i] = true;
	 * newS = newS+ currchar;
	 * }
	 * return dupli(str, indx+1, newS);
	 * }
	 * -> subsequence of String
	 * static void subseq(String str, int indx, String newString){
	 * if(indx == str.length()){
	 * System.out.println(newString);
	 * return;
	 * }
	 * char currchar = str.charAt(indx);
	 * subseq(str, indx+1, newString+currchar);
	 * 
	 * subseq(str, indx +1,newString);
	 * }
	 * --> unique
	 * static void subseq(String str, int indx,String newString, HashSet<String>
	 * set){
	 * 
	 * if(indx == str.length()){
	 * if(set.contains(newString))
	 * return;
	 * else{System.out.println(newString);
	 * set.add(newString);
	 * return;
	 * }
	 * }
	 * char currchar = str.charAt(indx);
	 * subseq(str, indx+1, newString+currchar,set);
	 * 
	 * subseq(str, indx +1,newString,set);
	 * 
	 * }
	 */
	public static void printComb(String str, int indx, String combination) {
		if (indx == str.length()) {
			System.out.println(combination);
			return;
		}
		char currchar = str.charAt(indx);
		String mapping = keypad[currchar - '0'];
		for (int i = 0; i < mapping.length(); i++) {
			printComb(str, indx + 1, combination + mapping.charAt(i));
		}
	}

	public static void main(String[] args) {
		// String str = "aaa";
		// HashSet<String> set = new HashSet<>();
		// System.out.println(dupli(str,0,""));
		// subseq(str, 0,"");
		// subseq(str, 0, "",set);
		String str = "2333";
		printComb(str, 0, "");
	}
}