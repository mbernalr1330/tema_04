public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;
        ejercicio_01( numeroIf );

        int numeroWhile = 1;
        ejercicio_02( numeroWhile );

        int numeroDoWhile = 3;
        ejercicio_03(numeroDoWhile);

        ejercicio_04();

        String estacion ="VERANO";
        ejercicio_05(estacion);

    }

    public static void ejercicio_01(int numeroIf) {
        System.out.println("---------------------Ejercicio 01---------------------");
        System.out.println("---------------------Estructura de control IF---------------------");
        if (numeroIf == 0 ){
            System.out.println("numeroIf -> cero");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf -> negativo");
        } else if (numeroIf > 0) {
            System.out.println("numeroIf -> positivo");
        }
    }

    public static void ejercicio_02(int numeroWhile ) {
        System.out.println("---------------------Ejercicio 02---------------------");
        System.out.println("---------------------Estructura de control WHILE---------------------");
        while ( numeroWhile < 3 ) {
            System.out.println("numeroWhile: "+numeroWhile);
            numeroWhile ++;
        }
    }

    public static void ejercicio_03( int numeroDoWhile) {
        System.out.println("---------------------Ejercicio 03---------------------");
        System.out.println("---------------------Estructura de control DO WHILE---------------------");
        do {
            System.out.println("numeroDoWhile: "+numeroDoWhile);
            numeroDoWhile ++;
        }
        while ( numeroDoWhile < 3 );
    }

    public static void ejercicio_04() {
        System.out.println("---------------------Ejercicio 04---------------------");
        System.out.println("---------------------Estructura de control FOR---------------------");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++ ){
            System.out.println("numeroFor: "+numeroFor);
        }
    }

    public static void ejercicio_05( String estacion){
        System.out.println("---------------------Ejercicio 05---------------------");
        System.out.println("---------------------Estructura de control SWITCH---------------------");
        switch ( estacion ) {
            case "PRIMAVERA":
                System.out.println("Estamos en la estacion de primavera");
                break;
            case "VERANO":
                System.out.println("Estamos en la estacion de verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en la estacion de otoño");
                break;
            case "INVIERNO":
                System.out.println("Estamos en la estacion de invierno");
                break;
            default: System.out.println("No es una estación del año");
        }
    }
}