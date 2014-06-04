package tiposBasicos;

/**
 * 
 * @author JESUS
 *
 */

public class TiposBasicos {
	
	//Ejemplos e Informacion acerca de los tipos basicos de Java mas usados.
	
	// ----------------------------------------- I  N  T ---------------------------------------------------------
	// Valor por defecto: 0
	
	int a = 7;
	int b = 12;
	
	//Como vemos, para crear una variable basica de tipo int, es necesario poner "int" seguido del nombre de la variable
	// que debe ser en minuscula, seguido de un '=' y el valor que deseamos darle.
	// int se usa para datos ENTEROS, por lo tanto un valor real para un dato de tipo int producirá un error de compilacion
	
	int c = 12.3; //Error de compilacion. Este tipo de datos deberia ser DOUBLE no INT.
	
	//Operaciones basicas con datos de tipo int
	
	int suma = a+b; //Suma
	int resta = a-b; //Resta
	int multiplicacion = a*b; //Multiplicacion
	int division = a/b; //Division
	
	//Es importante matizar que la division entre datos INT es una division entera. Es decir, que si 
	//quisieramos divir 5 entre 2, el resultado seria 2.
	//De igual forma, no se puede divir entre 0, si ocurre, se producira un error de ejecucion / compilacion
	
	int resto = a%b; //Resto (Modulo) de la division entera.
	// Esta operacion nos devuelve el resto, es decir, si hacemos 5%2, el resultado seria 1, ya que es el 
	//resto de dividir 5 entre 2, como division entera.
	
	int g = a++; //Incremento en 1 de a
	int h = a--; //Decremento en 1 de a
	
	//--------------------------------------- D  O  U  B  L  E ---------------------------------------------------------------------
	// Valor por defecto: 0.0
	
	double a1 = 13.45324;
	double a2 = 5453.23423;
	
	//Permiten trabajar con numeros reales, es decir, numeros con coma flotante.	
	//Las operaciones basicas son las mismas que las del tipo Int
	
	//-------------------------------------- B  O  O  L  E  A  N --------------------------------------------------------------------
	//Valor por defecto: false
	
	//Este tipo de datos se usa para evaluar condiciones
	//Los unicos valores posibles son true y false
	
	boolean esCierto = true; //Booleano verdadero
	boolean esFalso = false; //Booleano falso
	
	//Operaciones permitidas
	
	boolean conjuncion = esCierto && esFalso; // una conjuncion (&&) sera true sii todo lo que se une mediante ella es true.
	//En este caso seria false
	
	boolean disyuncion = esCierto || esFalso; // Una disyuncion (||) sera true si una de las condiciones que se unen mediente ella es true
	//En este caso seria true
	
	boolean negacion = !esCierto; //Una negacion es obtener el valor contrario al que se tenia. Si se tenia true, se tendra false, y viceversa
	//En este caso, negacion seria false.
	

}
