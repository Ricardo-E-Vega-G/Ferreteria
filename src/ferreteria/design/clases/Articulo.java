/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferreteria.design.clases;

/**
 *
 * @author Richi
 */
public class Articulo {
    
    private int codigo_Articulo;
    private String nombre;
    private String descripcion;
    private double precio;

    /**
     * @return the codigo_Articulo
     */
    public int getCodigo_Articulo() {
        return codigo_Articulo;
    }

    /**
     * @param codigo_Articulo the codigo_Articulo to set
     */
    public void setCodigo_Articulo(int codigo_Articulo) {
        this.codigo_Articulo = codigo_Articulo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
