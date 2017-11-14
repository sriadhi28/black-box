import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Deep Copy Example");
		int age[] = { 1, 2, 3, 4, 5 };
		System.out.println("Original array");
		System.out.println("Age:" + Arrays.toString(age));
		int[] ageCopy = new int[5];
		System.arraycopy(age, 0, ageCopy, 0, 5);
		age[0] = 6;
		System.out.println("Modified and Copied Array");
		System.out.println("Age:" + Arrays.toString(age));
		System.out.println("AgeCopy:" + Arrays.toString(ageCopy));
	}

}
