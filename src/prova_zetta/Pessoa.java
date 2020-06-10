package prova_zetta;

/**
 *
 * @author DESKTOP-Victor
 */
public abstract class Pessoa {
    
private String nome;
private String cpf;
private String dataNascimento;
private String sexo;

    /**
     *
     * @param nome
     */
    public void setNOME (String nome) {
    this.nome = nome;
}

    /**
     *
     * @return
     */
    public String getNome () {
    return this.nome;
}

    /**
     *
     * @param cpf
     */
    public void setCPF (String cpf){
    this.cpf = cpf;
}

    /**
     *
     * @return
     */
    public String getCPF (){
    return this.cpf;
}

    /**
     *
     * @param dataNascimento
     */
    public void setNascimento (String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

    /**
     *
     * @return
     */
    public String getNascimento () {
    return this.dataNascimento;
}
    
    public String getSexo () {
        return this.sexo;
    }

    /**
     *
     * @param sexo
     */
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
}


