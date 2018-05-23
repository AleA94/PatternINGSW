package abstractFactory;

public class TreeOfAsterisks implements Tree {

	public void print(int n) {
		int i, j;

		i = 1;
		while (i <= n) {
			j = 1;
			while (j <= n - i) {
				System.out.print(" ");
				j++;
			}
			j = 0;
			while (j < 2 * i - 1) {
				System.out.print("*");
				j++;
			}
			j = 1;
			while (j <= n - i) {
				System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}
		j = 1;
		while (j < n) {
			System.out.print(" ");
			j++;
		}
		System.out.println("*");
		j = 1;
		while (j < n) {
			System.out.print(" ");
			j++;
		}
		System.out.println("*");
	}
}
