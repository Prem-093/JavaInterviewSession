package JavaPractise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 4, 4, 5, 6 };

		Set<Integer> set = new HashSet<Integer>();

		for (int e : arr) {

			if (!set.contains(e)) {
				set.add(e);
			}
		}

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			int value = it.next();
			System.out.println(value);
		}

	}

}
