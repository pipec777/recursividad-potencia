public class Recursividad{

     public int potencia(int base, int exponente ){
        if (exponente == 0) {
        return 1;
    } else if (exponente!=1) {
        return base * potencia(base,exponente-1);
    } else {
        return base;
    }
}
}
