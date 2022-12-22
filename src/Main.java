public class Main {
    public static void main(String[] args) {
        int numeroIf = -45;
        if (numeroIf < 0) {
            System.out.println("es negativo");
        } else if (numeroIf > 0) {
            System.out.println("es positivo");
        } else {
            System.out.println("es igual a 0");
        }
        System.out.println("---");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("---");

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        } while (numeroWhile < 3);
        System.out.println("---");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }
        System.out.println("---");

        var estacion = "Otoño";
        switch (estacion) {
            case "Verano":
                System.out.println("estamos en verano");
                break;
            case "Invierno":
                System.out.println("estamos en invierno");
                break;
            case "Otoño":
                System.out.println("estamos en otoño");
                break;
            case "Primavera":
                System.out.println("estamos en primavera");
                break;
            default:
                System.out.println("eso no es una estación");

        }






    }
}