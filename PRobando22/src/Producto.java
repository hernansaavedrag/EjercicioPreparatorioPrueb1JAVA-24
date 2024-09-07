/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hernan
 */
// Clase que representa un Producto
class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private Categoria categoria;
    private Proveedor proveedor;

    // Constructor
    public Producto(String idProducto, String nombre, double precio, int cantidadEnStock, Categoria categoria, Proveedor proveedor) {
        
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    // Métodos getter y setter
    public String getIdProducto() { return idProducto; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidadEnStock() { return cantidadEnStock; }
    public Categoria getCategoria() { return categoria; }
    public Proveedor getProveedor() { return proveedor; }

    public void setIdProducto(String idProducto) { this.idProducto = idProducto; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidadEnStock(int cantidadEnStock) { this.cantidadEnStock = cantidadEnStock; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }
    
    
    public void mostrarInformacionProducto() {
        System.out.println("Producto: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Cantidad en Stock: " + getCantidadEnStock());
        System.out.println("Categoría: " + getCategoria().getNombre());
        System.out.println("Proveedor: " + getProveedor().getNombre());
        System.out.println();
    }
}
