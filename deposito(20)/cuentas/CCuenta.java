package cuentas;

/**
 * Esta clase representa una cuenta bancaria que permite realizar ingresos y retiradas.
 *
 * @author Emilio Garruta
 * @version 2.0
 */


public class CCuenta {
	//Atributos
	 /**
     * Nombre del titular
     */

    private String nombre;
    
    /**
     * Numeración de la cuenta
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado
     */
    private double tipoInteres;

	/**
	 * Constructor por defecto.
	*/
    
    public CCuenta()
    {
    }
    
    /**
     * Constructor con los parámetros definidos de la cuenta
     * @param nom nombre del titular
     * @param cue numeración de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés no está siendo usado
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    //Metodos públicos
    /**
     * Devuelve al valor actual del saldo
     * @return saldo devuelve el saldo actual de la cuenta
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método público sin retorno que fija un nuevo valor al saldo
     * en función de la cantidad ingresada
     * @param cantidad La cantidad ingresada
     * @throws Exception Si la cantidad ingresada es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método público sin retorno que fija un nuevo valor al saldo
     * en función de la cantidad retirada
     * @param cantidad la cantidad a retirar de la cuenta
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return nombre Obtiene el nombre del titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Establece el nombre del titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return cuenta Devuelve el número de cuentqa
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta Fijael número de cuentqa
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return saldo Devuelve el saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo fija el saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return tipoInteres Devuelve el  tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres fija el tipo de interés
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
