/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 31
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 05 de septiembre del 2016
 * Descripción: esta clase se hará cargo de dar forma a cada uno de los desarrolladores que pueden haber, en el se indicaran las habilidades y su nombre
 */

public class Developer {
    
    /**
     * atributo para indicar si es un Desarrollador Java
     */
    protected boolean javaDeveloper;

    /**
     * atributo para indicar si es un Desarrollador Web
     */
    protected boolean webDeveloper;

    /**
     * atributo para indicar si es un Desarrollador de Telefono
     */
    protected boolean phoneDeveloper;

    /**
     * atributo para indicar el nombre del Desarrollador
     */
    protected String name;
    
    /**
     * Constructor simple, inicialmente solo se sabe el nombre, sus habilidades se conocen como nulas = falsas
     * @param name el nombre del desarrollador
     */
    public Developer(String name){
        this.name = name;
        javaDeveloper = false;
        webDeveloper = false;
        phoneDeveloper = false;
    }
    
    /**
     * Constructor completo, se conoce todo del Desarrollador, se determinan cuales son sus habilidades
     * @param name el nombre del desarrollador
     * @param javaDeveloper si es desarrollador java
     * @param webDeveloper si es desarrollador web
     * @param phoneDeveloper si es desarrollador de teléfonos
     */
    public Developer(String name, boolean javaDeveloper, boolean webDeveloper, boolean phoneDeveloper){
        this.name = name;
        this.javaDeveloper = javaDeveloper;
        this.webDeveloper = webDeveloper;
        this.phoneDeveloper = phoneDeveloper;
    }
    
    /*
    * SETTER Y GETTER para cada uno de los atributos
    * Los setter seran utilizados unicamente al implementar el constructor simple, no es necesario usar todos, ya que por default no tiene todas las habilidades
    */
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setWebDeveloper(boolean webDeveloper){
        this.webDeveloper = webDeveloper;
    }
    
    public boolean getWebDeveloper(){
        return webDeveloper;
    }
    
    public void setJavaDeveloper(boolean javaDeveloper){
        this.javaDeveloper = javaDeveloper;
    }
    
    public boolean getJavaDeveloper(){
        return javaDeveloper;
    }
    
    public void setPhoneDeveloper(boolean phoneDeveloper){
        this.phoneDeveloper = phoneDeveloper;
    }
    
    public boolean getPhoneDeveloper(){
        return phoneDeveloper;
    }
}
