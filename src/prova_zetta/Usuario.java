package prova_zetta;

import java.util.ArrayList;

/**
 *
 * @author DESKTOP-Victor
 */
public class Usuario extends Pessoa {
    
    private String cargo;

    /**
     *
     */
    public static ArrayList<Usuario> usuarios = new ArrayList();
    private boolean add;
    
    /**
     *
     * @param cargo
     */
    public void setCargo (String cargo){
        this.cargo = cargo;
    }
    
    /**
     *
     * @return
     */
    public String getCargo (){
        return this.cargo;
    }
    
    /**
     *
     * @param usuario
     * @return
     */
    public boolean addUsuario(Usuario usuario) {
        boolean add = usuarios.add(usuario);
        return add;
    }
    
    
    /**
     *
     * @return
     */
    public ArrayList get (){
        return usuarios;
    }
        
    /**
     *
     * @return
     */
    public boolean confirmaADD (){
        return this.add;
    }

    /**
     *
     * @return
     */

}
