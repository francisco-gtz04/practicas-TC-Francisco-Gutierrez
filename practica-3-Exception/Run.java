import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int enteroN = 0;
		
		try {
			System.out.println("Ingresa un numero entero: ");
			enteroN=number.nextInt();
			EdadException oEdadEx = new EdadException();
			oEdadEx.validarEdad(enteroN);
			} catch(EdadException ex){
				ex.printStackTrace();
				System.out.println("Entro al catch");
				System.out.println(ex.getMessage());
			} finally {
		
			}
		
		
		}
		
	
	}


