package Banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Bancos banco = new Bancos();
        String clientes1;
        
        // Registro de clientes
         Clientes usuario1 = new Clientes("Juan", "123456", "Calle 123", "juan@gmail.com", "1234");
         Clientes usuario2 = new Clientes("Maria", "789101", "Calle 456", "maria@gmail.com", "5678");
 
        //Registrar usuarios
        Object cliente1;
        banco.registrarUsuario();
        Object cliente2;
        banco.registrarUsuario();

        // Actualización de datos del usuario
        ((Clientes) cliente1).setDireccion("Calle 789");
        banco.actualizarUsuario(cliente1);

        // Eliminación de usuarios
        banco.eliminarUsuario(cliente2);

        // Creación de cuentas de ahorro
        banco.crearCuentaAhorro(cliente1);

        // Realización de transacciones
        final CuentaAhorro cuentaAhorro = (CuentaAhorro) ((Object) cliente1)CuentaAhorro();
        banco.realizarTransacciones(cuentaAhorro, Transacciones.SALIDA, 500, "Maria", "viajes");

        // Consulta de saldo de la cuenta
        banco.consultarSaldo(usuario1.getNumeroIdentificacion(), "1234");

        // Consultar las transacciones en un periodo determinado
        banco.consultarTransacciones(((Clientes) cliente1).getNumeroIdentificacion(), "1234", "01/01/2022", "31/01/2022");

        // Obtener un porcentaje de gastos e ingresos dado el mes
        HashMap<String, Double> porcentajes = banco.obtenerPorcentajeGastosIngresos(((Clientes) cliente1).getNumeroIdentificacion(), "1234", 1, 2022);
        for (String categoria : porcentajes.keySet()){
            System.out.println("Categoria: " + categoria + ", Porcentaje: " + porcentajes.get(categoria) + "%");
        }
    }

    private static void CuentaAhorro() {}
    
}