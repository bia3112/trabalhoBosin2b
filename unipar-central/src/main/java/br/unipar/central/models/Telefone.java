
package br.unipar.central.models;

/**
 *
 * @author Beatr
 */
public class Telefone {
    
    private int id;
    private String numero;

    public Telefone() {
    }

    public Telefone(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", numero=" + numero + '}';
    }

}