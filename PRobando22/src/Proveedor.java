/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hernan
 */
// Clase que representa un Proveedor
class Proveedor {
    private String idProveedor;
    private String nombre;
    private String contacto;

    // Constructor
    public Proveedor(String idProveedor, String nombre, String contacto) {
//        if (!esIdValido(idProveedor)) throw new IllegalArgumentException("ID del proveedor inválido.");
//        if (!esNombreValido(nombre)) throw new IllegalArgumentException("Nombre del proveedor inválido.");
//        if (!esContactoValido(contacto)) throw new IllegalArgumentException("Contacto del proveedor inválido.");

        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
    }

   
    // Métodos getter y setter
    public String getIdProveedor() { return idProveedor; }
    public String getNombre() { return nombre; }
    public String getContacto() { return contacto; }

    public void setIdProveedor(String idProveedor) { this.idProveedor = idProveedor; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setContacto(String contacto) { this.contacto = contacto; }
}
