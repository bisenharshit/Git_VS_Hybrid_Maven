package String_Logical_Questions;

public class Test {

	public static void main(String[] args) {
		
		String str = "india";
		
		int[] arr = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)]+1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+" : --> "+arr[str.charAt(i)]);
		}
	}
}
