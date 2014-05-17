package visitor;

public class SampleMatrix implements Visitable {
	protected int[][] matrix = {{1, 2, 3, 4},
					   {8, 7, 4, 4},
					   {8, 2, 1, 7}};

	public int[][] getMatrix() {
		return this.matrix;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}