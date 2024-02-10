package cuentas;

/**
 * Esta clase continen el método principal para manjar el funcionamiento de la clase cuenta
 * @author Emilio Garruta
 */


public class Main {
	/**
	 * Método principal del programa
	 * @param args los argumentos pasados al programa, no se usan en este programa
	 */

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(0);
    }

	/**
	 * @deprecated Usar {@link #operativa_cuenta(double)} 
	 * 
	 */
	public static void operativa_cuenta() {
		operativa_cuenta(0);
	}

	/**
	 * 
	 * El método operativa_cuenta crea un objeto tipo CCuenta dotándolo de un número de cuenta
	 * un titular, una cantidad inicial en cuenta y un tipo de inteŕes
	 * 
	 * realiza un ingreso, capturando la excepción en el caso de que la cantidad ingresada no sea compatible 
	 * con el método .retirar y maneja la retirada de fondos con el mismo concepto sobre el método .retirar 
	 * @param cantidad No se usa, por desarrollar en el método
	 * 
	 */
	public static void operativa_cuenta(double cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
