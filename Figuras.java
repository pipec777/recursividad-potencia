public class Figuras{
public static void main (String[] args){

 Circulo hilo1 = new Circulo();
 Rectangulo hilo2 = new Rectangulo();
 Triangulo hilo3 = new Triangulo();
 Areas ar =new Areas();
 System.out.println("LA POTENCIA ES : ");
 Recursividad mt = new Recursividad();
 System.out.println(mt.potencia(2,5));
 hilo1.valorescirculo(23);
 hilo1.start();
 hilo2.valoresrectangulo(60,45);
 hilo2.start();
 hilo3.valorestriangulo(5,10);
 hilo3.start();
      

}
}