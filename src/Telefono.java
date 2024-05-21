public class Telefono extends Persona {
    private String numero;
    private String tipo;

    public Telefono(String numero, String tipo) {
        super(null, null, null, null, null, null);
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
