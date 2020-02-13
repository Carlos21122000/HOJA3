package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class radix {

	@Test
	void test() {
		JUnit test = new JUnit();
		int[] actual = {6,3,5,2,9,3,4,5,6,4,3,35,3,53,54,36,35,65,6,5,3,5,3,4,63,65,6,64,3,45,6,4,3,5,6,7,5};
	    int[] expected = {1,2,2,3,3,3,3,4,4,5,5,6,6,7,7,7,8,8,8,9,24,26,34,36,43,45,52,56,60,64,86,68,94};
		int[] num_list = test.radixSort(actual, actual.length);
		assertArrayEquals(expected, actual);
	}
}
