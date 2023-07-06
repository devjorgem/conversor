package conversor;

import javax.swing.JOptionPane;

public class Aplicacion {
	public static void main(String[] args) {
		
	String[] listamonedas={"dolar","euro","libra","peso","yen","won"};
	double dolar=1;
	double euro	=0.92;
	double libra = 0.79;
	double peso=4167.21;
	double yen=144.68;
	double won=1304.65;
	String[] opciones= {"conversor monedas","conversor temperatura"};
	String opcion;
	String eleccion1;
	String eleccion2;
	double cantidad;
	double dmoneda1=0;
	double dmoneda2=0;
	String[] listatemp= {"Kelvin","Centígrado","Fahrenheit"};
	// use TRY para contener el error al darle cancelar 
	try {
		//  bucle while true para que se repita incluso cuando terminamos de usar el programa
		while(true) {
			opcion= (String) JOptionPane.showInputDialog(null, "que programa usaras",
					"bienvenido usuario", JOptionPane.OK_CANCEL_OPTION,null, opciones, peso);
//en la variable opcion se guarda la lista de opciones de programa (
//conversor moneda,conversor temperatura)

//ya como tenemos el valor de opcion procedi a usar swich saber cual de los dos programas quiere usar
	
			switch(opcion) {
				case "conversor monedas":
					
	//3 opciones para saber cual es la moneda de la que se convierte 
	//la moneda en la que se  va a convertir y la cantidad a convertir
					eleccion1= (String)JOptionPane.showInputDialog(null, "convertir DE ",
							"conversor", JOptionPane.OK_CANCEL_OPTION,null, listamonedas, peso);
					eleccion2=(String) JOptionPane.showInputDialog(null, "convertir PARA",
							"conversor", JOptionPane.OK_CANCEL_OPTION,null, listamonedas, peso);
					cantidad=  Double.parseDouble(JOptionPane.showInputDialog("cantidad a convertir"));
	//como la variable eleccion1 guardo el valor seleccionado en string tuve que usar un if 
	//agregando el valor de la moneda a la que representa 
	
	
					if (eleccion1 == "dolar"){
						dmoneda1 = dolar;
						}
					else if(eleccion1=="euro") {
						dmoneda1=euro;
						}
					else if(eleccion1=="libra") {
						dmoneda1=libra;
						}
					else if(eleccion1=="peso") {
						dmoneda1=peso;
						}
					else if(eleccion1=="yen") {
						dmoneda1=yen;
						}
					else{
						dmoneda1=won;
						}
					if (eleccion2 == "dolar"){
						dmoneda2 = dolar;
						}
					else if(eleccion2=="euro") {
						dmoneda2=euro;
						}
					else if(eleccion2=="libra") {
						dmoneda2=libra;
						}
					else if(eleccion2=="peso") {
						dmoneda2=peso;
						}
					else if(eleccion2=="yen") {
						dmoneda2=yen;
						}
					else if(eleccion2=="won") {
						dmoneda2=won;
						}
		//si escoges ejemplo la opcion peso va  darle a una variable lo que equivale el peso 
		//para poder hacer operaciones matematicas
				JOptionPane.showMessageDialog(null, (cantidad/dmoneda1)*dmoneda2);
		//formulas 
		break;
		
				case "conversor temperatura":
		eleccion1= (String)JOptionPane.showInputDialog(null, "convertir DE ",
	            "conversor temperatura", JOptionPane.OK_CANCEL_OPTION,
	             null, listatemp, peso );
		eleccion2= (String)JOptionPane.showInputDialog(null, "convertir PARA ",
	            "conversor temperatura", JOptionPane.OK_CANCEL_OPTION,
	             null, listatemp, peso );
		cantidad=  Double.parseDouble(JOptionPane.showInputDialog("cantidad a convertir"));
		
		//Kelvin","Centígrado","Fahrenheit"
		if (eleccion1=="Kelvin" && eleccion2=="Centígrado"){
			dmoneda2 = cantidad-273.15;
		}
		else if(eleccion1=="Kelvin" && eleccion2=="Fahrenheit") {
			dmoneda2= 1.8*(cantidad - 273.15) + 32;
		}
		else if(eleccion1=="Centígrado" && eleccion2=="Kelvin") {
			dmoneda2 =cantidad + 273.15;
		}
		else if(eleccion1=="Centígrado" && eleccion2=="Fahrenheit") {
			dmoneda2= cantidad * 1.8 + 32;
			
		}
		else if(eleccion1=="Fahrenheit" && eleccion2=="Kelvin") {
			dmoneda2= 5/9 *(cantidad- 32) + 273.15;

		}
		else if(eleccion1=="Fahrenheit" && eleccion2=="Centígrado") {
			dmoneda2= (cantidad-32) / 1.8;
		}
		else{
			JOptionPane.showMessageDialog(null,"elegiste la misma opcion");
			break;
			}
		JOptionPane.showMessageDialog(null, dmoneda2);
		
		
		break;
		
	default:
		System.out.println("no es una opcion valida");
	}
	}
}
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, "saliste del programa");}
	}
}