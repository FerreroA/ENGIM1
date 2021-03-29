public class B extends A implements D{
	public B(int x){
		super(x,x);
	}

	@Override
	public boolean metodo1() {
		return metodo2() > 0;
	}

	public int metodo2(int num){
		return num+metodo2();
	}

}
