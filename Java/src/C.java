public class C extends A{
	public C(int x) {
		super(x,2*x);
	}

	@Override
	public int metodo2() {
		return super.metodo2()*2;
	}
}
