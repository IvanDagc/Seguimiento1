package Banco;

import java.time.LocalDate;

public class Transacciones {
    public static final String SALIDA = null;
	String valor;
    LocalDate fecha;
    String categoria;
    String remitente;
    String destinatario;

    //Constructor
    public Transacciones (String valor, LocalDate fecha, String categoria, String remitente, String destinatario){
        this.valor = valor;
        this.fecha = fecha;
        this.categoria = categoria;
        this.remitente = remitente;
        this.destinatario = destinatario;
        }   

        public String getValor(){
            return valor;
        }
        public void setValor(String valor){
            this.valor = valor;
        }
        public LocalDate getFecha(){
            return fecha;
        }
        public void setFecha(LocalDate fecha){
            this.fecha = fecha;
        }
        public String getCategoria(){ 
            return categoria;
        }
        public void setCategoria(String categoria){
            this.categoria = categoria;
        }
        public String getRemitente(){
            return remitente;
        }
        public void setRemitente(String remitente){
            this.remitente = remitente;
        }
        public String getDestinatario(){
            return destinatario;
        }
        public void setDestinatario(String destinatario){
            this.destinatario = destinatario;
        }
     @Override
        public String toString() {
            return "Transaccion [valor=" + valor + ", categoria=" + categoria + "]";
        }

}
