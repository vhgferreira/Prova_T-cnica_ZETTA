/*
 * @author Victor
 */
package prova_zetta;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para desenvolvimento dos cargos, contém métodos para adição e remoção de cargos.
 * 
 */
public class Dados {

    /**
     *
     */
    public static ArrayList<Cargos> cargos = new ArrayList();

    /**
     *
     * @param cargo
     * @return
     */
    public boolean cadastrarCargo(Cargos cargo) {
        return cargos.add(cargo);
    }

    /**
     *
     * @param nome
     * @return
     */
    public boolean removerCargo(String nome) { //classe para remover o cargo da lista
        boolean aux = false;
        for (int i = 0; i<= cargos.size(); ++i) {
            String aux1 = cargos.get(i).getNOME();
            if (aux1.equals(nome)){
                cargos.remove(i);
                aux = true;
            } else {
                aux = false;
            }
            
        }
        return aux;
    }

    /**
     *
     * @return
     */
    public String getSIZE() { // método para saber qnts objetos na lista de Cargos
            return cargos.size() + "";
    }

    /**
     *
     * @return
     */
    public List pegarLista() {
        return cargos;          
    }
    

}
