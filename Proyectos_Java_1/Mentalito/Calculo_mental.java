
            }
        }
        }
        //Dificultad 5
        else if (Dificultad==5) {
            for(int i=0; i<=limite-1; i++){
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
