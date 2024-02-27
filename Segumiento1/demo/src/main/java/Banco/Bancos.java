package Banco;

import java.util.ArrayList;
import java.util.HashMap;

public class Bancos {
  
     private ArrayList<String> listaBancos;

    public Bancos() {
        this.listaBancos = new ArrayList<String>();
    }

    public void agregarBanco(String nombreBanco) {
        listaBancos.add(nombreBanco);
    }

    public void mostrarBancos() {
        for (String banco : listaBancos) {
            System.out.println(banco);
        }
    }

    public ArrayList<String> getListaBancos() {
        return listaBancos;
    }

    public void setListaBancos(ArrayList<String> listaBancos) {
        this.listaBancos = listaBancos;
    }

    public void registrarUsuario() {
        for (String banco : listaBancos) {
            System.out.println(banco);
        }

    }

    public void actualizarUsuario(Object cliente1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarUsuario'");
    }

    public void eliminarUsuario(Object cliente2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarUsuario'");
    }

    public void crearCuentaAhorro(Object cliente1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCuentaAhorro'");
    }

    public void realizarTransacciones(CuentaAhorro cuentaAhorro, String salida, int i, String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarTransacciones'");
    }

    public void consultarSaldo(Object numeroIdentificacion, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarSaldo'");
    }

    public void consultarTransacciones(Object numeroIdentificacion, String string, String string2, String string3) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarTransacciones'");
    }

    public HashMap<String, Double> obtenerPorcentajeGastosIngresos(Object numeroIdentificacion, String string, int i,
            int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPorcentajeGastosIngresos'");
    }

}

