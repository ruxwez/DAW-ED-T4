package cuenta;

public class CuentaGarciaGarciaJose2324T4 {

    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    
    /**
     * IBAN de la cuenta
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tpo de interes de la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor sin parametros
     */
    public CuentaGarciaGarciaJose2324T4() {
    }

    /**
     * Constructor de 4 valores para inicializar la clase
     *
     * @param nom El nombre que queremos asignar
     * @param cue El IBAN de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interes de la cuenta
     */
    public CuentaGarciaGarciaJose2324T4(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Nos permite añadir un nombre a la cuenta
     *
     * @param nom El nombre que queremos asignar
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Nos permite obtener el nombre del titular de la cuenta
     *
     * @return Nombre del titular de la cuenta
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Retornamos el saldo de la cuenta
     *
     * @return Retorna el saldo de la cuetna
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Nos permite ingresar dinero a la cuenta bancaria
     *
     * @param cantidad Cantidad a ingresar
     * @param nombreConcepto El nombre del concepto
     *
     * @throws Exception si la cantidad es menor que 0
     */
    public void ingresar(double cantidad, String nombreConcepto) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Nos permite retirar una cantidad de dinero de la cuenta bancaria
     *
     * @param cantidad Cantidad de dinero a retirar
     * @throws Exception si la cantidad es menor o igual a 0, o si el estado de
     * la cuenta es menor o igual al la cantidad que se quiere retirar
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() <= cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    
    /**
     * Obtenemos el IBAN de la cuenta
     * 
     * @return El IBAN de la cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Getter para el nombre
     * 
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el nombre
     * 
     * @param nombre El nombre del dueño de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para la cuenta
     * 
     * @return El IBAN
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter para la cuenta
     * 
     * @param cuenta El IBAN que quieres asociar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter para el saldo
     * 
     * @return El saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter para el saldo
     * 
     * @param saldo El saldo que quieres establecerle
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter para el tipo de interes
     * 
     * @return El tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Setter para el tipo de interes
     * 
     * @param tipoInteres El tipo de interes que quieres poner
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
