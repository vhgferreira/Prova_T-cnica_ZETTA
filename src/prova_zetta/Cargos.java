/*
 * @author Victor
 */
package prova_zetta;

/**
 * Classe feita para dar atributos aos cargos, métodos de edição do mesmo.
 * 
 */
public class Cargos {
    
    private String nome;

    /**
     *
     * @param nome
     */
    public void setNOME(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getNOME() {
        return this.nome;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString () {
        return this.nome;
    }
}
