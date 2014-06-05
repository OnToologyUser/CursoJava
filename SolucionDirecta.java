package solucionDirecta;

/**
 * 
 * @author JESUS
 *
 */

public class SolucionDirecta {
	
	//Los metodos de solucion directa son metodos que realizan una operacion en base unicamente a los parametros que reciben
	
	public int suma (int a, int b) { //El tipo de datos del nombre del metodo ha de ser el tipo de datos resultante del metodo
		
		return a+b;
	}
	
	public double areaTriangulo (double base, double altura) { //Los parametros pueden ser de cualquier tipo, ya sean basicos o complejos
		
		return (base * altura) / 2;
	}
	
	public boolean conjuncion (boolean a, boolean arg2) { //No son necesarios nombres distintos en los parametros, pueden ser iguales
		
		return a && arg2;
	}
	
	public int operacion (int a, int b, int c) {
		
		return (a+b) * (c / b) - (a-c);
	}

	
	/*
	 * Una de las cosas importantes a la hora de realizar un metodo es saber elegir bien que tipo de datos tendra el resultado, y que
	 * tipo de datos deben tener los parametros.
	 * Por ejemplo, para calcular un area, un volumen, etc, es logico pensar que el tipo de datos optimo sean los double, ya que
	 * lo mas seguro es que trabajemos con decimales.
	 * 
	 * Si queremos contar manzanas, lo logico seria usar datos de tipo int, ya que no necesitaremos decimales para contar manzanas
	 * 
	 * De igual forma, si queremos usar condiciones logicas, deberemos usar datos de tipo boolean
	 * 
	 * Los parametros de los metodos pueden tener el mismo nombre que parametros de otros metodos.
	 */
}
