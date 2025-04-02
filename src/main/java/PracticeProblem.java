public class PracticeProblem {

	public static void main(String args[]) {}

	public static int towerOfHanoi(int num) {
		
		int ber = num;
		if (ber < 3) {
			return -1;
		}

		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		if (num == 2) {
			return 3;
		}
		if (num == 3) {
			return 7;
		}

		return (towerOfHanoi(num-1)+1) + towerOfHanoi(num-1);
	}
}
