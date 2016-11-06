package Procesos;
import Clases.Empleados;
public class Operaciones{
  public Empleados datos[];
  double sueldo;
  public int cuenta;
  public Operaciones(){
    datos=new Empleados[5];
    cuenta=0;
  }
  public void registrar(Empleados e){
    datos[cuenta]=new Empleados();
    datos[cuenta].setCodigo(e.getCodigo());
    datos[cuenta].setApellido(e.getApellido());
    datos[cuenta].setNombre(e.getNombre());
    datos[cuenta].setOcupacion(e.getOcupacion());
    datos[cuenta].setSueldo(e.getSueldo());
    datos[cuenta].setAfp(e.getAfp());
    datos[cuenta].setDescuento(e.getDescuento());
    datos[cuenta].setNeto(e.getNeto()); 
    cuenta++;
  }
  public String leer(){
    String texto="";
    double net;
    for(int i=0;i<cuenta;i++){
      net=datos[i].getSueldo()-datos[i].getDescuento();
      texto=texto+"\n"+
              datos[i].getCodigo()+"\t"+
              datos[i].getApellido()+"\t"+
              datos[i].getNombre()+"\t"+
              datos[i].getOcupacion()+"\t"+
              datos[i].getSueldo()+"\t"+
              datos[i].getAfp()+"\t"+
              datos[i].getDescuento()+"\t"+
              net;
    }
    return texto;
  }
  
  public double calcular_Sueldo(int ocup){
      
        if(ocup==0){
            sueldo=3500;
        }else if(ocup==1){
            sueldo=3200;
        }else if(ocup==2){
            sueldo=2542;
        }else if(ocup==3){
            sueldo=1500;
        }
        return sueldo;
    }
    
    public double calcular_Descuento(int afp){
        double descuento=0.0;
        switch(afp){
            case 0:
                descuento=sueldo*0.05;
                break;
            case 1:
                descuento=sueldo*0.07;
                break;
            case 2:
                descuento=sueldo*0.06;
                break;
        }
        return descuento;
    }
  
  public Empleados[] obtenerEmpleados(){
    return datos;
  }
  public int obtenerContador(){
    return cuenta;
  }
}

