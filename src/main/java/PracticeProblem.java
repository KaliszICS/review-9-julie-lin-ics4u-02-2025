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
		int sum = 0;
		if (num1 < num2){
			if (num1 %2 != 0){
				while (num1 < num2 ){
					sum = num1 += 2; 
				}
			}
			else {
				num1++;
				while (num1 <= num2){
					sum = num1 += 2; 
				}
			}
		}
		else{
			if (num2 %2 != 0){
				while (num2 < num1 ){
					sum = num2 += 2; 
				}
			}
			else {
				while (num2 <= num1){
					sum = num2 + 2; 
				}
			}
		}
		return sum;
		}

		//for (int i = 0; i < num1 || i < num2; i++) {

	}


