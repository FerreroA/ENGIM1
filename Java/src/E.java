public class E implements D{
	private int x;

	public E(int x) {
		this.x = x;
	}

	@Override
	public boolean metodo1() {
		return x % 2 == 0;
	}
}
