import java.util.Scanner;
import java.util.InputMismatchException;

public class MainStage {
    public static void main(String[] args) throws InputMismatchException, Exception {
        Vista v = new Vista();
        Scanner sc = new Scanner(System.in);
        car c = new car();
        v.inicio();
        Integer carro = v.Tipo_Carro();        
        Integer tipo = v.Menu_I();
        if (tipo == 1){
            System.out.println("Elija una opcion:");
            System.out.println("");
            System.out.println("1. Subir Volumen");
            System.out.println("2. Bajar Volumen");
            int vol = sc.nextInt();
            if (vol == 1 ){
                c.volumenP();
            }
            if (vol == 2 ){
                c.volumenM();
            }

        }
        if (tipo == 2){
            Integer tipo2 = v.Menu_R();
            if (tipo2 == 1){
                c.estaciones();
            }
            if (tipo2 == 2){
                c.emisoras();

            }
            if (tipo2 == 3){
                
            }
        }
        if (tipo == 3){
            v.Menu_Re();
        }
        if (tipo == 4){
            v.Menu_T();
        }
        if (tipo == 5){
            v.Menu_P();
        }
    


    }
}