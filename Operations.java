/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 31
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 05 de septiembre del 2016
 * Descripción: esta clase sera la encargada de realizar todas las operaciones requeridas
 */

// Se importa la librería util, que incluye a: Set, HashSet, TreeSet y LinkedHashSet
import java.util.*;

public class Operations<E> {
    
    /**
     * atributo tipo Factory, para determinar que tipo de implementacion Set se utilizara
     */
    protected Factory factory;

    /**
     * atributo tipo Set<E>, el cual se usara para obtener sus datos
     */
    protected Set<E> setter;
    
    /**
     * Constructor, inicializa un objeto factory para determinar el tipo de set a utilizar
     * @param value
     */
    public Operations(int value){
        factory = new Factory();
        setter = factory.settingTable(value);
    }
    
    /**
     * metodo que devuelve el tamano de el Set indicado
     * @param s1
     * @return int con el tamano
     */
    public int size(Set<E> s1){
        return s1.size();
    }
    
    /**
     * metodo que agrega un elemento a un set determinado
     * @param element
     * @param s1
     */
    public void addElement(E element, Set<E> s1){
        s1.add(element);
    }
    
    /**
     * Funcion que determina el conjunto de los tres tipos de desarrolladores (o solo dos, si el ultimo parametro es null)
     * @param s1 
     * @param s2
     * @param s3
     * @return devuelve un Set que contiene la union de los conjuntos ingresados
     */
    public Set<E> tripleDevelopers(Set<E> s1, Set<E> s2, Set<E> s3){
        setter.clear();
        setter.addAll(s1);
        setter.addAll(s2);
        setter.addAll(s3);
        return setter;
    }
    
    /**
     * metodo que devuelve la interseccion entre dos sets indicados
     * @param s1
     * @param s2
     * @return interseccion
     */
    public Set<E> intersection(Set<E> s1, Set<E> s2){
        setter = s1;
        setter.retainAll(s2);
        return setter;
    }
    
    /**
     * metodo que determina la diferencia entre dos sets indicados (lo que esta en una pero no en la otra)
     * @param s1
     * @param s2
     * @return diferencia
     */
    public Set<E> difference(Set<E> s1, Set<E> s2){
        setter = s1;
        setter.removeAll(s2);
        return setter;
    }
    
    /**
     * metodo determina si s2 es subconjunto de s2
     * @param s1
     * @param s2
     * @return devuelve true o false si se cumple la prueba
     */
    public boolean isSubset(Set<E> s1, Set<E> s2){
        return s1.containsAll(s2);
    }
    
}
