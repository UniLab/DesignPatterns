package visitor;

import java.util.Arrays;

public class Client {
	public static void main(String[] args) {
		SampleMatrix matrix = new SampleMatrix();
		System.out.println(Arrays.deepToString(matrix.getMatrix()));
		matrix.accept(new PrintAsList());
		matrix.accept(new Transpose());
	}
}