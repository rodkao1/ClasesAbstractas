package py.com.uaa.pooj.util.tiposclases;

import java.util.Date;

public class TestOperadores {
	
	public void metodo1(){
		
	}
	
	public void metodo2() {
		
	}
	
public void metodo3() {
		
	}

public void pruebaLlamadaMetodosDeLMismaClase() {
	metodo1();
	metodo2();
	metodo3();
	
	//  print();
}
	public static void imprimirFecha() {
		Date date = new Date();
		System.out.println("Fecha actual: " + date.getYear() + date.getMonth() + date.getDay() );
	}
		
	
}

