package Strings;

class Sample{
	
}
class Demo{
	Demo(){
		System.out.println("In Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}


public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		d = null;
		System.gc();
		

	}

}
