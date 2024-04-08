
public class EdadException extends Exception {
	public static final long serialVersionUID = 121897812870865L;

	public EdadException() {
		
	}
	public EdadException (String mensaje) {
		super(mensaje);
	}
	
	public EdadException(int edad) throws EdadException {
		this.validarEdad(edad);
	}

	public void validarEdad(int edad) throws EdadException {
		if(!(edad>=18 && edad<=45)) {
			System.out.println("La edad capturada no pertenece al numero permitido (18 a 45), Favor de capturar nuevamente");
			throw new EdadException("Error de edad");
		}
		
	}

}
