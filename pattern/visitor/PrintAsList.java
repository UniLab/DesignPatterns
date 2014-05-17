package visitor;

public class PrintAsList implements Visitor {
	public void visit(SampleMatrix instance) {
		int [][] matrix = instance.getMatrix();
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
		System.out.println();
	}
}