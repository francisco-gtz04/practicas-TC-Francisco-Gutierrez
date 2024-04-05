
public class Run {

	public static void main(String[] args) {
		
		//Obtenemos el dato del numero base
		int base = 5;
		
		//Obtenemos el dato del exponente
		int exp = 3;
		
		//inicializamos un numero que nos servira como resultado de la operacion
		long numero = 1;
		
		//Se crea un ciclo for para iterar las veces que se tienen que multiplicar, 
		// el limite lo da el exponente

		for (int i = 0; i < exp ; i++) {
			
		/* Se hace la operacion de la base X el numero 
		  la variable numero se le asigna el valor del multiplicacion
		esta variable hace que al volver a iterar me guarde el resultado que sera igual multiplicado*/
			numero *= base;
			
		}
		
		System.out.println("el numero " +base+ " elevado al exponente " +exp+ " = " + numero);
		

	}

}
