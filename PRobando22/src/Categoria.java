/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hernan
 */
// Clase que representa una Categoría
class Categoria {
    private String idCategoria;
    private String nombre;
    private String descripcion;

    // Constructor
    public Categoria(String idCategoria, String nombre, String descripcion) {
//        if (!esIdValido(idCategoria)) throw new IllegalArgumentException("ID de la categoría inválido.");
//        if (!esNombreValido(nombre)) throw new IllegalArgumentException("Nombre de la categoría inválido.");
//        if (!esDescripcionValida(descripcion)) throw new IllegalArgumentException("Descripción de la categoría inválida.");

        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Métodos getter y setter
    public String getIdCategoria() { return idCategoria; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    public void setIdCategoria(String idCategoria) { this.idCategoria = idCategoria; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}

