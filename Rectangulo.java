public class Rectangulo extends Thread{

double altura; 
double arearec;
double base;
@Override
public void run(){
arearec=(base*altura);
System.out.println("El área del rectangulo es: " + arearec ); 
}
public void valoresrectangulo(double valor2,double valor3){
this.altura =valor2;
this.base =valor3;
}
}
