
public class Flecha {

	int longitud;
	String color;
	
	/*La clase Flecha simboliza una flecha y posee dos atributos internos: longitud (que indica la longitud de la flecha) y color (que denota el color de la flecha).*/
	
	
	public Flecha() {
		longitud=18;
		color="negro";
	}
	
	/*
El constructor sin argumentos de Flecha() es utilizado para crear una flecha con valores predefinidos. En esta instancia, la longitud se fija en 18 y el color se asigna como "negro".*/
	
	public Flecha(int longitud, String color) {
		this.longitud=longitud;
		this.color=color;
	}
	
	/*El constructor con parámetros Flecha(int longitud, String color) se utiliza para instanciar una flecha con valores personalizados proporcionados por el usuario. Los valores de longitud y color se asignan a las variables de instancia respectivas utilizando la referencia "this".*/
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	/*El metodo imprimirEspacio() lo que hace es imprimir una linea en blanco en la consola.*/
	
	public void construirFlecha() {
		for(int index = 0; index < longitud; index += 1) {
			imprime("-");
		}
		imprime(">");
	}
	
	/*El método construirFlecha() crea la representación visual de la flecha mediante la impresión de una serie de guiones ("-"), seguidos del símbolo de flecha (">"). La cantidad de guiones se determina según el valor de longitud proporcionado.*/
	
	private void imprime(String simbolo) {
		if(color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.out.print(simbolo);
		}
	}
	
	/*El método privado imprime(String simbolo) se emplea internamente para mostrar un símbolo en la consola. Independientemente del color de la flecha, el símbolo se imprime sin realizar ningún cambio. En resumen, este método no realiza ninguna distinción basada en el color de la flecha en la implementación actual.*/

}
