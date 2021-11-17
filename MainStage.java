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
        Integer tipo = 0;
        Integer sl = 0;
        v.Tipo_Carro();
        if (tipo == 0) {
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
                            c.conect_disconect();
                        }
                        if (sl4 == 2){
                            c.show();
                        }
                        if (sl4 == 3){
                            c.call();
                        }
                        if (sl4 == 4){
                            c.colgar();
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
                                c.call_last();
                            }
                            else{
                                c.changeS();
                            }
                        
                        }
                        if (sl4 == 7){
                            if (carro == 3){
                                c.change_last();
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
                                c.plan();
                            }
                            else{
                                c.changeS();
                            }
                        }
                        if (sl5 == 2){
                            if(carro == 2){
                                c.targets();
                            }
                            else{
                                c.changeS();
                            }
                        }
                        if (sl5 == 3){
                            if (carro == 3){
                                c.weather();
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
        if (tipo == 1) {
            while (sl != 6){ 
                sl = v.Menu_I();
                if (sl == 1){
                    System.out.println("Elija una opcion:");
                    System.out.println("El volumen actual es" + c.volume);
                    System.out.println("1. Subir Volumen");
                    System.out.println("2. Bajar Volumen");
                    int vol = sc.nextInt();
                    if (vol == 1 ){
                        a.volumenP();
                    }
                    if (vol == 2 ){
                        a.volumenM();
                    }

                }
                if (sl == 2){
                    Integer sl2 = 0;
                    while (sl2 != 5){
                        sl2 = v.Menu_R();
                        if (sl2 == 1){
                            a.estaciones();
                        }
                        if (sl2 == 2){
                            a.emisoras();

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
                            a.select();
                        } 
                        if (sl3 == 2){
                            a.change();
                        }
                        if (sl3 == 3){
                            a.now();
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
                            a.conect_disconect();
                        }
                        if (sl4 == 2){
                            a.show();
                        }
                        if (sl4 == 3){
                            a.call();
                        }
                        if (sl4 == 4){
                            a.colgar();
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
                                a.changeS();
                            }
                        }
                        if (sl4 == 6){
                            if (carro == 2){
                                a.call_last();
                            }
                            else{
                                a.changeS();
                            }
                        
                        }
                        if (sl4 == 7){
                            if (carro == 3){
                                a.change_last();
                            }
                            else{
                                a.changeS();
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
                                a.plan();
                            }
                            else{
                                a.changeS();
                            }
                        }
                        if (sl5 == 2){
                            if(carro == 2){
                                a.targets();
                            }
                            else{
                                a.changeS();
                            }
                        }
                        if (sl5 == 3){
                            if (carro == 3){
                                a.weather();
                            }
                            else{
                                a.changeS();
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
            if (tipo == 2) {
                while (sl != 6){ 
                    sl = v.Menu_I();
                    if (sl == 1){
                        System.out.println("Elija una opcion:");
                        System.out.println("El volumen actual es" + c.volume);
                        System.out.println("1. Subir Volumen");
                        System.out.println("2. Bajar Volumen");
                        int vol = sc.nextInt();
                        if (vol == 1 ){
                            s.volumenP();
                        }
                        if (vol == 2 ){
                            s.volumenM();
                        }
    
                    }
                    if (sl == 2){
                        Integer sl2 = 0;
                        while (sl2 != 5){
                            sl2 = v.Menu_R();
                            if (sl2 == 1){
                                s.estaciones();
                            }
                            if (sl2 == 2){
                                s.emisoras();
    
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
                                s.select();
                            } 
                            if (sl3 == 2){
                                s.change();
                            }
                            if (sl3 == 3){
                                s.now();
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
                                    s.changeS();
                                }
                            }
                            if (sl4 == 6){
                                if (carro == 2){
                                    s.call_last();
                                }
                                else{
                                    s.changeS();
                                }
                            
                            }
                            if (sl4 == 7){
                                if (carro == 3){
                                    s.change_last();
                                }
                                else{
                                    s.changeS();
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
                                    s.changeS();
                                }
                            }
                            if (sl5 == 2){
                                if(carro == 2){
                                    s.targets();
                                }
                                else{
                                    s.changeS();
                                }
                            }
                            if (sl5 == 3){
                                if (carro == 3){
                                    s.weather();
                                }
                                else{
                                    s.changeS();
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
}
}
