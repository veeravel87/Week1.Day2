package Week1.day2;

import java.util.Iterator;

public class MissingNumbersInArray {

	int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

	public int getMissingNo() {
		int length = arr.length;
		int total = (length + 1) * (length + 2) / 2;
		for (int i = 0; i < length; i++) {
			total = total - arr[i];
			}
		return total;
	}

	public static void main(String args[]) {
		// int c,d;
		MissingNumbersInArray miss = new MissingNumbersInArray();
		int Result = miss.getMissingNo();
		System.out.println(Result);

	}
}