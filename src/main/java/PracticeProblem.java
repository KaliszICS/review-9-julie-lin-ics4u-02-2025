public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int lettersToFive(String str, char ch){
		int occur =0;
		int i = 0; 
	   	while (str.length() > i) {
			if (str.charAt(i) == ch) {
				occur++;
				if (occur == 5) {
					return i+1;
				}
			}
			i++;
		}
		return -1;
	}
	public static int countLetter(String str, char letter){
		int occur = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == letter) {
				occur++;
			}
		}
		return occur;
		
	}
	public static int oddSum(int num1, int num2) {
		int min = Math.min(num1,num2);
		int max = Math.max(num1,num2);
		int sum = 0;
		for (int i = min; i <= max; i++){
			if (i % 2 != 0){
				sum += i;
			}
		}
		return sum;


	}
}


