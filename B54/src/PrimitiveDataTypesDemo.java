// Primitive DataTypes Demo
public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytemax = 127;
		byte bytemin = -128;
		System.out.println("Min range of byte is: "+ bytemin+
				"\nMax range of byte is: "+bytemax);
		
		//short - 2 bytes
		short shortMax =32767;
		short shortMin = -32768;
		System.out.println("Minshort range of byte is" + shortMin
				+"Maxshort range of byte is "+shortMax);
		//_int 4bytes
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Min int range of byte is" + minInt+
				"Maxint range of byte is "+maxInt);
		//long 8bytes
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("Minlong range of byte is" + minLong+
				"Maxlong range of byte is "+maxLong);
		float f=3234.141243278345f;
		double d= 3456.141245123456789023456789140f;
		System.out.println("float value is "+f+" double value is "+d);
		
		//boolean 
		boolean flag=false; 
		System.out.println("boolean value in "+flag);
	}

}
