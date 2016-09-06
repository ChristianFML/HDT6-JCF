/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 31
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 05 de septiembre del 2016
 * Descripción: esta clase sera la encargada de determinar que implementacion de set se va a utilizar (indicada por el usuario)
 */

// Se importa la librería util, que incluye a: Set, HashSet, TreeSet y LinkedHashSet
import java.util.*;

public class Factory<E> {
    
    /**
     * atributo para alojar el tipo de implementacion  de Set a utilizar
     */
    protected Set<E> tableType;
    
    /**
     * Constructor que por default inicializa al tipo de set como null
     */
    public Factory(){
        this.tableType = null;
    }

    /**
     * Metodo factory, va a determinar la implementacion requerida
     * @param selection indicador del usuario para elegir el tipo de implementacion de Set
     * @return devuelve el tipo de implementacion de Set solicitada
     */
    public Set<E> settingTable(int selection){
        
        if(selection == 1)
            this.tableType = new HashSet<E>();
        else if(selection == 1)
            this.tableType = new TreeSet<E>();
        else if(selection == 3)
            this.tableType = new LinkedHashSet<E>();
        
        return this.tableType;
    }
    
}
