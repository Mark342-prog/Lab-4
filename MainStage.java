import java.util.Scanner;
import java.util.InputMismatchException;

public class MainStage {
    public static void main(String[] args) throws InputMismatchException, Exception {
        Vista v = new Vista();
        Scanner sc = new Scanner(System.in);
        car c = new car();
        v.inicio();
        Integer carro = v.Tipo_Carro();        
        Integer tipo = 0;
        while (tipo != 6){ 
            tipo = v.Menu_I();
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
                Integer tipo2 = 0;
                while (tipo2 != 5){
                    tipo2 = v.Menu_R();
                    if (tipo2 == 1){
                        c.estaciones();
                    }
                    if (tipo2 == 2){
                        c.emisoras();

                    }
                    if (tipo2 == 3){

                    }
                    if(tipo2 == 4){

                    }
                    if(tipo2 == 5){
                        System.out.println("Regresando al menu principal");

                    }
                }
            }
            if (tipo == 3){
                Integer tipo3 = 0; 
                while (tipo3 != 4){
                    tipo3 = v.Menu_Re();
                    if (tipo3 == 1){
                        c.select();
                    } 
                    if (tipo3 == 2){
                        c.change();
                    }
                    if (tipo3 == 3){
                        c.now();
                    }
                    if (tipo3 == 4){
                        System.out.println("Regresando al menu principal");
                    }
                }
            }
            if (tipo == 4){
                Integer tipo4 = 0;
                while (tipo4 !=8){
                    tipo4 = v.Menu_T();
                    if (tipo4 == 1){
                        c.conect_disconect();
                    }
                    if (tipo4 == 2){
                        c.show();
                    }
                    if (tipo4 == 3){
                        c.call();
                    }
                    if (tipo4 == 4){
                        c.colgar();
                    }
                    if (tipo4 == 5){
                        if (carro == 1){
                            System.out.println("Elija una opcion:");
                            System.out.println("");
                            System.out.println("1. Bocinas");
                            System.out.println("2. Auriculares");
                            int elec = sc.nextInt();
                            if (elec == 1){
                                System.out.println("Actualmente se reproduce en bocinas");
                            }
                            if (elec == 2){
                                System.out.println("Actualmente se reproduce en Auriculares");
                            }
                        }
                        else{
                            c.changeS();
                        }
                    }
                    if (tipo4 == 6){
                        if (carro == 2){
                            c.call_last();
                        }
                        else{
                            c.changeS();
                        }
                    
                    }
                    if (tipo4 == 7){
                        if (carro == 3){
                            c.change_last();
                        }
                        else{
                            c.changeS();
                        }
                    }
                    if (tipo4 == 8){
                        System.out.println("Regresando al menu principal");
                    }
                }
                
            }
            if (tipo == 5){
                Integer tipo5 = 0;
                while (tipo5 != 4){
                    tipo5 = v.Menu_P();
                    if (tipo5 == 1){
                        if (carro == 1){
                            c.plan();
                        }
                        else{
                            c.changeS();
                        }
                    }
                    if (tipo5 == 2){
                        if(carro == 2){
                            c.targets();
                        }
                        else{
                            c.changeS();
                        }
                    }
                    if (tipo5 == 3){
                        if (carro == 3){
                            c.weather();
                        }
                        else{
                            c.changeS();
                        }
                    }
                    if (tipo5 == 4){
                        System.out.println("Regresando al menu principal");
                    }
                }
                
            }
            if (tipo == 6){
                v.Fin();
            }    


        }
    }
}
