
public class TesteWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29); //Autoboxing
		System.out.println(idadeRef.intValue()); //Unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number numero = Float.valueOf(29.9f);

	}

}
