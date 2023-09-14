package Principal;

public class ElementList {
    
    private String texto;
    private int numero;

    public ElementList(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Elemento [texto=" + texto + ", numero=" + numero + "]";
    }

}
