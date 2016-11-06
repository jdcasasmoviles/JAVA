package Procesos;
import Clases.Ecuacion;
public class Operaciones {
    
  public Ecuacion datos[];
  public int cuenta;
  public Operaciones(){
    datos=new Ecuacion[5];
    cuenta=0;
  }
  
  public void registrar(Ecuacion e){
    datos[cuenta]=new Ecuacion();
    datos[cuenta].setA(e.getA());
    datos[cuenta].setB(e.getB());
    datos[cuenta].setC(e.getC());
    cuenta++;
  }
  
  public String leer(){
    String texto="";
    double x1=0.0;
    double x2=0.0;
    for(int i=0;i<cuenta;i++){
        if(discriminante(datos[i].getA(),datos[i].getB(),datos[i].getC()) < 0.0)
        {
        texto=texto+"\n"+ datos[i].getA()+
                   "\t"+datos[i].getB()+
                   "\t"+datos[i].getC()+
                    "\t Tiene raiz imaginaria"+
                    "\t Tiene raiz imaginaria";
        }
        else{
         texto=texto+"\n"+ datos[i].getA()+
                   "\t"+datos[i].getB()+
                   "\t"+datos[i].getC()+
                   "\t"+sol1(datos[i].getA(),datos[i].getB(),datos[i].getC())+
                   "\t"+sol2(datos[i].getA(),datos[i].getB(),datos[i].getC()); 
        }
    }
    return texto;
  }
  
  public double discriminante(double a,double b,double c){
  double dis=b*b-4*a*c;
      return dis;
  }
  
  public double sol1(double a,double b,double c){
  double x1;
  x1=(-b+Math.sqrt(discriminante(a,b,c)))/(2*a);
  return x1;
  }
  
  public double sol2(double a,double b,double c){
  double x1;
  x1=(-b-Math.sqrt(discriminante(a,b,c)))/(2*a);
  return x1;
  }
  
  public Ecuacion[] obtenerEcuacion(){
    return datos;
  }
  
  public int obtenerContador(){
    return cuenta;
  }
}