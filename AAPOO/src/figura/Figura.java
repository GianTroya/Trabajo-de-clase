package figura;

abstract class Figura implements Movible {
	public int x;
	public int y;
	public Figura(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	abstract double area();
	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
