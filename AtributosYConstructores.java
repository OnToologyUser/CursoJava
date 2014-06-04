package atributosYConstructores;

/**
 * 
 * @author JESUS
 *
 */

public class AtributosYConstructores {
	
	//---------------------------------------------------------------------------
	
	public class Numero {
		private int numero; //Atributo de la clase Numero
		
		public Numero (int n) { //Constructor de Numero. Recibe como parametro un entero "n"
			this.numero = n; //Asignamos al atributo de Numero, el valor del int que pasamos como parametro anteriormente
		}
		
		//¿QUE ES THIS?
		/*
		 this es una llamada al propio objeto, es decir, una forma de "autollamarse". 
		 cuando decimos this.numero = n, queremos decir:
		 
		 el atributo numero de este objeto Numero es igual a este valor que paso como parametro
		 */
	}
	
	//Ahora vamos a crear objetos Numero
	
	Numero n1 = new Numero (7); 
	/*
	 * TIPO DE DATO: Numero (tipo complejo)
	 * NOMBRE DE LA VARIABLE: n1
	 * SENTENCIA PARA CREAR EL OBJETO: new Numero
	 * PARÁMETRO: 7 . Este 7, será el valor que tendra el atributo numero de n1
	 */
	
	//Como el constructor de Numero solo permite crear numeros pasando un entero como parametro, dara error si metemos 
	//Otra cosa como parametro, o si no metemos nada.
	
	Numero n2 = new Numero (7.5); //Nos da error, diciendo que el constructor para Numero con un parametro double no esta definido
	Numero n3 = new Numero(); //Si no ponemos parametro, tambien da error, ya que el constructor vacio no esta definido.
	
	//EJEMPLO ALGO MAS PRACTICO -----------------------------------------------------------------------
	
	/*
	 * Se desea crear un programa que atomatice la creacion de DNI's
	 */
	
	public class CreaDnis {
		private String nombre;
		private String fechaNacimiento;
		private int edad;
		
		public CreaDnis (String nombre, String fechaNacimiento, int edad) {
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
			this.edad = edad;
		}
	}
	
	
	

}
