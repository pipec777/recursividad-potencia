public class Triangulo extends Thread{
 
double alturatri; 
double areatri;
double basetri;

@Override
public void run(){

areatri = ((basetri*alturatri)/2);;
System.out.println("  El área del triangulo es: " + areatri); 
}
public void valorestriangulo(double valor6,double valor7){
this.alturatri =valor6;
this.basetri =valor7;
}
}
