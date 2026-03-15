package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Findduplicates {


	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1} ;
		Set<Integer> duplicates = new HashSet<>();
		Arrays.stream(a).filter(arr -> !duplicates.add(arr)).boxed().collect(Collectors.toList());
	}
}
