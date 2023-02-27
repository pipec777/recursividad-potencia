public class Circulo extends Thread{

double PI = 3.1416; 
double area;
double radio;

@Override
public void run(){

area = PI * radio * radio;
System.out.println("El área del circulo es: " + area ); 
}
public void valorescirculo(double valor1){
this.radio = valor1;
}
}

