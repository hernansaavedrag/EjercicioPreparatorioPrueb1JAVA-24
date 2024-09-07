
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class SistemaInventario {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Validaciones val = new Validaciones();
        int opc,precio,stock;
        String codigoCat,nomCat,descCat,codProv,nomProv,contactoProv,codProd,nomProd;
        Proveedor prov = null;
        Categoria cat = null;
        Producto prod = null;
        prod.setCantidadEnStock(10);
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Ingresar Categoria");
            System.out.println("2. Ingresar Proveedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Mostrar Producto");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                       
                case 1:
                    System.out.print("Ingrese codigo Categoria: ");
                    codigoCat = leer.next();
                    
                    System.out.print("Ingrese Nombre categoria: ");
                    nomCat = leer.next();
                    leer.nextLine();
                    System.out.print("Ingrese descripcion de categoria: ");
                    descCat = leer.nextLine();
                    cat = new Categoria(codigoCat, nomCat, descCat);
                    break;
                case 2:
                    System.out.print("Ingrese codigo Proveedor: ");
                    codProv = leer.next();
                    System.out.print("Ingrese Nombre Proveedor: ");
                    nomProv = leer.next();
                    leer.nextLine();
                    System.out.print("Ingrese contacto Proveedor: ");
                    contactoProv = leer.nextLine();
                    prov = new Proveedor(codProv, nomProv, contactoProv);
                    break;
                case 3:
                    System.out.print("Ingrese codigo Producto: ");
                    codProd = leer.next();
                    leer.nextLine();
                    System.out.print("Ingrese Nombre Prodcuto: ");
                    nomProd = leer.nextLine();
                    if (val.esNombreValido(nomProd)== false) {
                                               
                        System.out.print("Error, Ingrese Nombre nuevamente: ");
                        nomProd = leer.next();
                       
                    }
                    System.out.print("Ingrese precio Producto: ");
                    precio = leer.nextInt();
                    if (val.esPrecioValido(precio)== false) {
                     do {                            
                        System.out.print("Error, Ingrese Precio nuevamente: ");
                        precio = leer.nextInt();
                        
                        }while (val.esPrecioValido(precio)== false);
                    }
                    System.out.print("Ingrese Stock: ");
                    stock = leer.nextInt();
                    if (prod.getCantidadEnStock()>0) {
                        prod.setCantidadEnStock(prod.getCantidadEnStock()+stock);
                    }else{
                        System.out.println("Stock en cero, se agregara " + stock + " de prodcutos");
                    }
                    prod = new Producto(codProd, nomProd, precio, stock, cat, prov);
                    break;
                case 4:
                    prod.mostrarInformacionProducto();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
         
            
                
            
        } while (opc != 5);

//        if (!esNombreValido(nombre)) throw new IllegalArgumentException("Nombre del producto inválido.");
//        if (!esPrecioValido(precio)) throw new IllegalArgumentException("Precio del producto inválido.");
//        if (!esCantidadValida(cantidadEnStock)) throw new IllegalArgumentException("Cantidad en stock inválida.");
//        if (categoria == null) throw new IllegalArgumentException("Categoría no puede ser null.");
//        if (proveedor == null) throw new IllegalArgumentException("Proveedor no puede ser null.");
    }

     
}

