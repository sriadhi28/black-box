import java.util.Arrays;
import java.util.Scanner;

public class Med {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, median;
		System.out.println("Enter the first array size:");
		n = in.nextInt();
		System.out.println("Enter the second array size:");
		m = in.nextInt();
		float[] nums1 = new float[n];
		float[] nums2 = new float[m + n];
		System.out.println("Enter the first array:");
		for (int i = 0; i < n; i++) {
			nums1[i] = in.nextFloat();
		}
		System.out.println("Enter the Second array:");
		for (int i = 0; i < m; i++) {
			nums2[i] = in.nextFloat();
		}
		System.arraycopy(nums1, 0, nums2, m, n);
		Arrays.sort(nums2);
		System.out.println("The given numbers:" + Arrays.toString(nums2));
		if ((m + n) % 2 == 1) {
			median = (m + n) / 2;
			System.out.println("The median is:" + nums2[median]);
		} else if ((m + n) % 2 == 0) {
			median = (m + n) / 2;
			float med = (nums2[median - 1] + nums2[median]) / 2;
			System.out.println("The median is:" + med);
		}
	}

}
