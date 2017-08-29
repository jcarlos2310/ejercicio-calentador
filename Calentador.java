public class Calentador
{
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    public Calentador(){
        temperatura = 15;
        incremento = 3;
        min = -10;
        max = 30;
    }
    public void calentar()
    { //Aumenta temperatura 5° en 5°//
        if(temperatura <= max){
            temperatura = temperatura + incremento;
            if(temperatura > max){
                System.out.print("La Temperatura No Puede Ser Mayor a: " + max + "°\n");
            }
        }
    }
    public void enfriar()
    { // Disminuye temperatura 5° en 5°//
        if(temperatura >= min){
            temperatura = temperatura - incremento;
            if(temperatura < min){
                System.out.print("La Temperatura No Puede Ser Menor a: " + min + "°\n");
            }
        }
    }
    public int muestraTemperatura()
    { 
        System.out.println(+temperatura);
        return temperatura;
    }
    public void modificarIncremento(int incrementoModificado)
    {
        incremento = incrementoModificado;
        if(incremento == 0 || incremento <= -1 ){
            incremento = 3;
        }
    }
}