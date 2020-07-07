import java.util.Scanner;

public class EscaleraDeNumeros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuantas peldaños quieres en tu escalera?");
        int peldaños=entrada.nextInt();


        for (int i=1;i<=peldaños;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
