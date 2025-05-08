package src.com.kroool.modelo;

import java.util.Objects;

public class Libro{

    private String titulo;
    private String autor;
    private String ISBN;
    private int ejemplaresDisponibles;

    /**
     * Constructor completo para crear un libro con todos sus atributos.
     *
     * @param titulo El título del libro (no puede ser vacío)
     * @param autor El autor del libro (no puede ser vacío)
     * @param ISBN Código ISBN del libro (formato válido)
     * @param ejemplares Número de ejemplares del libro (debe ser mayor que 0)
     */

    // Constructor
    public Libro(String titulo, String autor, String ISBN, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ejemplaresDisponibles = ejemplares;
    }

    // Métodos
    public boolean prestarEjemplar() {
        if (ejemplaresDisponibles > 0) {
            ejemplaresDisponibles--;
            return true;
        }
        return false;
    }

    public void devolverEjemplar() {
        ejemplaresDisponibles++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    // Getters

    /**
     * Compara este libro con otro objeto para determinar igualdad.
     * Dos libros se consideran iguales si tienen el mismo ISBN.
     *
     * @param obj El objeto a comparar
     * @return true si son iguales, false en caso contrario
     */
    /**
    * Devuelve una representación en cadena del libro.
    *
    * @return Cadena con la información del libro formateada
    */

    /**
     * Clase que representa un libro con sus características básicas.
     * Permite almacenar información sobre título, autor y páginas.
     *
     * @author Krool
     * @version 1.0
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return ejemplaresDisponibles == libro.ejemplaresDisponibles && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(ISBN, libro.ISBN);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", ejemplaresDisponibles=" + ejemplaresDisponibles +
                '}';
    }
}