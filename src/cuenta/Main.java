package cuenta;

public class Main {

    /**
     * Funcion main principal
     */
    public static void main(String[] args) {
        CuentaGarciaGarciaJose2324T4 miCuentaGarciaGarciaJose2324T4;
        double saldoActual;
        int x;

        miCuentaGarciaGarciaJose2324T4 = new CuentaGarciaGarciaJose2324T4("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500, 0);
        System.out.println("Saldo inicial de la cuenta: " + miCuentaGarciaGarciaJose2324T4.estado() + "€");

        retiraDineroGarciaGarciaJose(miCuentaGarciaGarciaJose2324T4);

        ingresaDineroGarciaGarciaJose(miCuentaGarciaGarciaJose2324T4);

        saldoActual = miCuentaGarciaGarciaJose2324T4.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Metodo para ingresar dinero en la cuenta de Garcia Gacia Jose
     *
     * @param CuentaGarciaGarciaJose2324T4 Objeto de la cuenta
     */
    private static void ingresaDineroGarciaGarciaJose(CuentaGarciaGarciaJose2324T4 miCuentaGarciaGarciaJose2324T4) {
        int x;
        try {
            x = 100;
            System.out.println("Ingreso en cuenta de " + x + "€");
            miCuentaGarciaGarciaJose2324T4.ingresar(x, "Ingreso en Cuenta");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * Metodo para retirar dinero en la cuenta de Garcia Gacia Jose
     *
     * @param CuentaGarciaGarciaJose2324T4 Objeto de la cuenta
     */
    private static void retiraDineroGarciaGarciaJose(CuentaGarciaGarciaJose2324T4 miCuentaGarciaGarciaJose2324T4) {
        int x;
        try {
            x = 1500;
            System.out.println("Retirada en cuenta de " + x + "€");
            miCuentaGarciaGarciaJose2324T4.retirar(x);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }

}
