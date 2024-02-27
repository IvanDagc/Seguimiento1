package Banco;

public class CuentaAhorro {
private String numeroCuenta;
private double saldo;
private double tasaInteres;

public CuentaAhorro(String numeroCuenta, double saldo, double tasaInteres) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.tasaInteres = tasaInteres;
}

public String getNumeroCuenta() {
    return numeroCuenta;
}

public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}

public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public double getTasaInteres() {
    return tasaInteres;
}

public void setTasaInteres(double tasaInteres) {
    this.tasaInteres = tasaInteres;
}

public void depositar(double monto) {
    saldo += monto;
}

public void retirar(double monto) {
    if (saldo - monto >= 0) {
        saldo -= monto;
    } else {
        System.out.println("Saldo insuficiente");
    }
}

public void aplicarInteres() {
    saldo += saldo * tasaInteres;
}

@Override
public String toString() {
    return "CuentaAhorro{" +
            "numeroCuenta='" + numeroCuenta + '\'' +
            ", saldo=" + saldo +
            ", tasaInteres=" + tasaInteres +
            '}';
}

}