package sajat_beolvasas;

public class IntegerNotPrimeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public IntegerNotPrimeException() {
		super("Integer is not a prime!");
	}
	
	public IntegerNotPrimeException(String message) {
		super(message);
		
	}

}
