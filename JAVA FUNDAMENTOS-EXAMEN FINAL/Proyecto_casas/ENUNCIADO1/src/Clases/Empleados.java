package Clases;
public class Empleados {
  private int codigo;
  private String apellido;
  private String nombre;
  private String ocupacion;
  private double sueldo;
  private double descuento;
  private double neto;
  private String afp;

    public Empleados() {
    }

    public Empleados(int codigo, String apellido, String nombre, String ocupacion, double sueldo, double descuento, String afp) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.afp = afp;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getAfp() {
        return afp;
    }
    
}
