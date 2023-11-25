import java.util.Random;
import java.util.Scanner;
//Factorizacion por agrupacion
public class Calculo_mental {
    public static void main(String[] args) {
        int numero_op,limite,Dificultad,Resultado,Resultado_operador,puntaje=0;
        Scanner entrada = new Scanner(System.in);
        Random R = new Random();
        Random P = new Random();
        System.out.println("Cuantas operaciones vas a realizar? ");
        limite = entrada.nextInt();
        System.out.println("Del 1 al 5, que tan dificil quieres tus operaciones");
        Dificultad = entrada.nextInt();
        long startTime = System.currentTimeMillis();
        if (Dificultad==1) {
            
            for(int i=0; i<=limite-1; i++){
            int R2= R.nextInt(10);
            int R3= P.nextInt(10);
            Resultado = R2 * R3;
            System.out.println("Cual es el resultado de " + R2 + " * " + R3);
            Resultado_operador = entrada.nextInt();
            if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
            }else{
                System.out.println("El resultado correcto es: "+Resultado);
            }
        }   
            
        }

        else if (Dificultad==2) {
            for(int i=0; i<=limite-1; i++){
            int R2= R.nextInt(14);
            int R3= P.nextInt(10);
            Resultado = R2 * R3;
            System.out.println("Cual es el resultado de " + R2 + " * " + R3);
            Resultado_operador = entrada.nextInt();
            if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
            }else{
                System.out.println("El resultado correcto es: "+Resultado);
            }
        }
            
        }
        else if (Dificultad==3) {
            for(int i=0; i<=limite-1; i++){
            int R2= R.nextInt(17);
            int R3= P.nextInt(13);
            Resultado = R2 * R3;
            System.out.println("Cual es el resultado de " + R2 + " * " + R3);
            Resultado_operador = entrada.nextInt();
            if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
            }else{
                System.out.println("El resultado correcto es: "+Resultado);
            }
        }
        }
        else if (Dificultad==4) {
            for(int i=0; i<=limite-1; i++){
            int R2= R.nextInt(19);
            int R3= P.nextInt(15);
            Resultado = R2 * R3;
            System.out.println("Cual es el resultado de " + R2 + " * " + R3);
            Resultado_operador = entrada.nextInt();
            if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
            }else{
                System.out.println("El resultado correcto es: "+Resultado);
            }
        }
        }
        else if (Dificultad==5) {
            for(int i=0; i<=limite-1; i++){
            int R2= R.nextInt(22);
            int R3= P.nextInt(18);
            Resultado = R2 * R3;
            System.out.println("Cual es el resultado de " + R2 + " * " + R3);
            Resultado_operador = entrada.nextInt();
            if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
            }else{
                System.out.println("El resultado correcto es: "+Resultado);
            }
        }
        }else{
            System.out.println("Esa dificultad no existe");
        }
        long endTime = System.currentTimeMillis();
        long elapsedTimeMillis = endTime - startTime;
        System.out.println("Tu puntaje final es: "+puntaje+"/"+limite);
        System.out.println("Tiempo transcurrido: " + convertirMillisAHHMMSS(elapsedTimeMillis));
        
    }
    private static String convertirMillisAHHMMSS(long millis) {
        long segundos = millis / 1000;
        long horas = segundos / 3600;
        long minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
