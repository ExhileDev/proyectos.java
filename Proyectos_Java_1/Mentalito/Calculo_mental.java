import java.util.Random;
import java.util.Scanner;
//Factorizacion por agrupacion
public class Calculo_mental {
    public static void main(String[] args) {
        int numero_op,limite=0,Dificultad,Resultado,Resultado_operador,puntaje=0;
        Scanner entrada = new Scanner(System.in);
        Random R = new Random();
        Random P = new Random();
        Random T = new Random();
        System.out.println("Cuantas operaciones vas a realizar? ");
        limite = entrada.nextInt();
        //System.out.println(limite);
        System.out.println("Del 1 al 5, que tan dificil quieres tus operaciones");
        Dificultad = entrada.nextInt();
        long startTime = System.currentTimeMillis();
        //Dificultad 1
        if (Dificultad==1) {
            
             
            int i=1;    
            do{
            int RP= R.nextInt(10)+2;
            int RQ= P.nextInt(10)+2;
            int A1= T.nextInt(4);
            System.out.println("Operacion: "+i);
            switch (A1) {
                case 1:
                Resultado = RQ + RP;
                System.out.println("Cual es el resultado de " + RQ + " + " + RP);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }i++;
                    break;
                case 2:
                Resultado = RQ - RP;
                System.out.println("Cual es el resultado de " + RQ + " - " + RP);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }i++;
                break;

                case 3:
                Resultado = RQ * RP;
                System.out.println("Cual es el resultado de " + RQ + " * " + RP);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }i++;
                break;
                case 4:
                Resultado = RQ / RP;
                System.out.println("Cual es el resultado de " + RQ + " / " + RP);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                i++;
                break;
            }
        } while (i<=limite); 
            
        }
        //Dificultad 2
        else if (Dificultad==2) {
            int i=1;
            do{
            
            int A2= T.nextInt(4);
            switch (A2) {
                case 1:
                int R1= R.nextInt(70)+8;
                int R2= P.nextInt(90)+8;
                Resultado = R2 + R1;
                System.out.println("Cual es el resultado de " + R1 + " + " + R2);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                    break;
                case 2:
                int R3= R.nextInt(50)+8;
                int R4= P.nextInt(18)+8;
                Resultado = R4 - R3;
                System.out.println("Cual es el resultado de " + R4 + " - " + R3);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;

                case 3:
                int R5= R.nextInt(14)+5;
                int R6= P.nextInt(10)+5;
                Resultado = R6 * R5;
                System.out.println("Cual es el resultado de " + R6 + " * " + R5);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
                case 4:
                int R7= R.nextInt(14)+3;
                int R8= P.nextInt(10)+3;
                Resultado = R7 / R8;
                System.out.println("Cual es el resultado de " + R7 + " / " + R8);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
            }
        }while (i<=limite); 
            
        }
        //Dificultad 3
        else if (Dificultad==3) {
            int i=1;
            do{
            int A3= T.nextInt(4);
            switch (A3) {
                case 1:
                int R9= R.nextInt(17)+4;
                int R10= P.nextInt(13)+4;
                Resultado = R10 + R9;
                System.out.println("Cual es el resultado de " + R10 + " + " + R9);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                    break;
                case 2:
                int R11= R.nextInt(17)+4;
                int R12= P.nextInt(13)+4;
                Resultado = R11 - R12;
                System.out.println("Cual es el resultado de " + R11 + " - " + R12);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;

                case 3:
                int R13= R.nextInt(17)+4;
                int R14= P.nextInt(13)+4;
                Resultado = R14 * R13;
                System.out.println("Cual es el resultado de " + R14 + " * " + R13);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
                case 4:
                int R15= R.nextInt(17)+4;
                int R16= P.nextInt(13)+4;
                Resultado = R15 / R16;
                System.out.println("Cual es el resultado de " + R15 + " / " + R16);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
            }
        }while (i<=limite); 
        }
        //Dificultad 4
        else if (Dificultad==4) {
            int i=1;
            do{
            int A4= T.nextInt(4);
            switch (A4) {
                case 1:
                int R16= R.nextInt(19)+5;
                int R17= P.nextInt(15)+5;
                Resultado = R16 + R17;
                System.out.println("Cual es el resultado de " + R16 + " + " + R17);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                    break;
                case 2:
                int R18= R.nextInt(19)+5;
                int R19= P.nextInt(15)+5;
                Resultado = R18 - R19;
                System.out.println("Cual es el resultado de " + R18 + " - " + R19);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;

                case 3:
                int R20= R.nextInt(19)+5;
                int R21= P.nextInt(15)+5;
                Resultado = R20 * R21;
                System.out.println("Cual es el resultado de " + R20 + " * " + R21);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
                case 4:
                int R22= R.nextInt(19)+5;
                int R23= P.nextInt(15)+5;
                Resultado = R22 / R23;
                System.out.println("Cual es el resultado de " + R22 + " / " + R23);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
            }
        }while (i<=limite); 
        }
        //Dificultad 5
        else if (Dificultad==5) {
            int i=1;
            do{
            int A4= T.nextInt(4);
            switch (A4) {
                case 1:
                int R24= R.nextInt(22)+6;
                int R25= P.nextInt(18)+6;
                Resultado = R24 + R25;
                System.out.println("Cual es el resultado de " + R24 + " + " + R25);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                    break;
                case 2:
                int R26= R.nextInt(22)+6;
                int R27= P.nextInt(18)+6;
                Resultado = R26 - R27;
                System.out.println("Cual es el resultado de " + R26 + " - " + R27);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;

                case 3:
                int R28= R.nextInt(22)+6;
                int R29= P.nextInt(18)+6;
                Resultado = R28 * R29;
                System.out.println("Cual es el resultado de " + R28 + " * " + R29);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
                case 4:
                int R30= R.nextInt(22)+6;
                int R31= P.nextInt(18)+6;
                Resultado = R30 / R31;
                System.out.println("Cual es el resultado de " + R30 + " / " + R31);
                Resultado_operador = entrada.nextInt();
                if (Resultado==Resultado_operador) {
                System.out.println("Correcto");
                puntaje++;
                }else{
                System.out.println("El resultado correcto es: "+Resultado);
                }
                break;
            }
        }while (i<=limite);
        }else{
            System.out.println("Esa dificultad no existe");
        }
        long endTime = System.currentTimeMillis();
        long elapsedTimeMillis = endTime - startTime;
        System.out.println("Tu puntaje final es: "+puntaje+"/"+limite);
        System.out.println("Nivel de Dificultad: "+Dificultad);
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
