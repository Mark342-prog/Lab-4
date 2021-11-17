import java.util.Scanner;
import java.util.InputMismatchException;

public class MainStage {
    public static void main(String[] args) throws InputMismatchException, Exception {
        Vista v = new Vista();
        Scanner sc = new Scanner(System.in);
        carC c = new carC();
        carA a = new carA();
        carS s = new carS();
        v.inicio();
        Integer carro = v.Tipo_Carro();        
        
        Integer sl = 0;
        
            while (sl != 6){ 
                sl = v.Menu_I();
                if (sl == 1){
                    System.out.println("Elija una opcion:");
                    System.out.println("El volumen actual es" + c.volume);
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
                if (sl == 2){
                    Integer sl2 = 0;
                    while (sl2 != 5){
                        sl2 = v.Menu_R();
                        if (sl2 == 1){
                            c.estaciones();
                        }
                        if (sl2 == 2){
                            c.emisoras();

                        }
                        if (sl2 == 3){

                        }
                        if(sl2 == 4){

                        }
                        if(sl2 == 5){
                            System.out.println("Regresando al menu principal");

                        }
                    }
                }
                if (sl == 3){
                    Integer sl3 = 0; 
                    while (sl3 != 4){
                        sl3 = v.Menu_Re();
                        if (sl3 == 1){
                            c.select();
                        } 
                        if (sl3 == 2){
                            c.change();
                        }
                        if (sl3 == 3){
                            c.now();
                        }
                        if (sl3 == 4){
                            System.out.println("Regresando al menu principal");
                        }
                    }
                }
                if (sl == 4){
                    Integer sl4 = 0;
                    while (sl4 !=8){
                        sl4 = v.Menu_T();
                            if (sl4 == 1){
                                s.conect_disconect();
                            }
                            if (sl4 == 2){
                                s.show();
                            }
                            if (sl4 == 3){
                                s.call();
                            }
                            if (sl4 == 4){
                                s.colgar();
                            }
                            if (sl4 == 5){
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
                            if (sl4 == 6){
                                if (carro == 2){
                                    s.call_last();
                                }
                                else{
                                    c.changeS();
                                }
                            
                            }
                            if (sl4 == 7){
                                if (carro == 3){
                                    s.change_last();
                                }
                                else{
                                    c.changeS();
                                }
                            }
                            if (sl4 == 8){
                                System.out.println("Regresando al menu principal");
                            }
                    }
                    
                }
                if (sl == 5){
                    Integer sl5 = 0;
                    while (sl5 != 4){
                        sl5 = v.Menu_P();
                        if (sl5 == 1){
                            if (carro == 1){
                                s.plan();
                            }
                            else{
                                c.changeS();
                            }
                        }
                        if (sl5 == 2){
                            if(carro == 2){
                                s.targets();
                            }
                            else{
                                c.changeS();
                            }
                        }
                        if (sl5 == 3){
                            if (carro == 3){
                                s.weather();
                            }
                            else{
                                c.changeS();
                            }
                        }
                        if (sl5 == 4){
                            System.out.println("Regresando al menu principal");
                        }
                    }
                    
                }
                if (sl == 6){
                    v.Fin();
                }    


            }
        
        

    }
}
