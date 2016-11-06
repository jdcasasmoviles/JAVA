package Procesos;
import Clases.Circulo;
public class Operaciones {
    
  public Circulo datos[];
  public int cuenta;
  public Operaciones(){
    datos=new Circulo[5];
    cuenta=0;
  }
  
  public void registrar(Circulo e){
    datos[cuenta]=new Circulo();
    datos[cuenta].setRadio(e.getRadio());
    cuenta++;
  }
  
  public String leer(){
    String texto="";
    double area=0.0;
    for(int i=0;i<cuenta;i++){
      area=datos[i].getPi()*datos[i].getRadio()*datos[i].getRadio();
      texto=texto+"\n"+ datos[i].getRadio()+"\t"+area;
    }
    return texto;
  }
    
  public Circulo[] obtenerCirculos(){
    return datos;
  }
  
  public int obtenerContador(){
    return cuenta;
  }
}
