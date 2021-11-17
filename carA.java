import java.util.ArrayList;
import java.util.Scanner;

public class carA  implements productividad,radio,reproductor,telefono {
    boolean on = false;
    int volume = 0;
    boolean tfc = false;
    int sl = 0;
    boolean AM = false;
    Scanner Sc = new Scanner(System.in);
    Vista v = new Vista();
    ArrayList<String> estacionesArrayList = new ArrayList<String>(); 
    ArrayList<String> musica = new ArrayList<String>(); 
    @Override
    public void apagar_ecender() {
        if (on == false ) {
            on = true;
        }
        else{
            on = false;
        }
    }
    @Override
    public void volumenM() {
        if (volume > -1 ) {
            volume -= 1;
        } else {
            System.out.println("-----No Es posible-----");
        }
        
    }

    @Override
    public void volumenP() {
        if (volume > -1 ) {
            volume += +1;
        } else {
            System.out.println("-----No es Posible-----");
        }
        
    }


    @Override
    public boolean conect_disconect() {
        if (tfc == false) {
            tfc = true;
        } else {
            tfc = false;
        }
        return tfc;
        
    }

    @Override
    public void show() {
        System.out.println("-----------Sin base de datos linkeado-----------");
    }

    @Override
    public void call() {

     System.out.println("Llamar : ......");
        
    }

    @Override
    public void colgar() {
         System.out.println("A finalizado la llamada ...");
        
    }

    @Override
    public void changeS() {
        v.error_C();
        
    }

    @Override
    public void call_last() {
        System.out.println("Marcando al utimo contacto llamado......");
        
    }

    @Override
    public void change_last() {
        System.out.println("Sin llamada en cola");
        
    }

    @Override
    public void select() {
        musica.add("1.Live me alone");
        musica.add("2.Forgoten");
        musica.add("3.Flow");
        musica.add("4.Hunted VIP");
        System.out.println("Las canciones de prieba son:");
        for (int i = 0; i < musica.size(); i++) {
            System.out.println(musica.get(i) + " ");
        }
        System.out.println("Diga que es lo que quiere escuchar"); 
            try {
                sl = Sc.nextInt();
            } catch (Exception InputMismatchException) {
                System.out.println("hay un error:    porfavor ingrese un numero valido");
            }
        if (sl == 1) {
            System.out.println("Se esta reproduciendo Live me alone de Michael Jackson");
        }
        if (sl == 2) {
            System.out.println("Se esta reproduciendo Forgotten de Linkin Park");
        }
        if (sl == 3) {
            System.out.println("Se esta reproduciendo Flow de Slippy");
        }
        if (sl == 4) {
            System.out.println("Se esta reproduciendo Hunted VIP de Slippy");
        }
        
            
        
    }

    @Override
    public void change() {
        System.out.println("Las canciones de prueba son:");
        for (int i = 0; i < musica.size(); i++) {
            System.out.println(musica.get(i) + " ");}
            System.out.println("Diga que es lo que quiere escuchar"); 
            try {
                sl = Sc.nextInt();
            } catch (Exception InputMismatchException) {
                System.out.println("hay un error:    porfavor ingrese un numero valido");
            }
        if (sl == 1) {
            System.out.println("Se esta reproduciendo Live me alone de Michael Jackson");
        }
        if (sl == 2) {
            System.out.println("Se esta reproduciendo Forgotten de Linkin Park");
        }
        if (sl == 3) {
            System.out.println("Se esta reproduciendo Flow de Slippy");
        }
        if (sl == 4) {
            System.out.println("Se esta reproduciendo Hunted VIP de Slippy");
        }
        
    }

    @Override
    public void now() {
        if (sl == 1) {
            System.out.println("Se esta reproduciendo Live me alone de Michael Jackson");
            System.out.println("--------------------4:29------------------------");
        }
        if (sl == 2) {
            System.out.println("Se esta reproduciendo Forgotten de Linkin Park");
            System.out.println("--------------------3:15------------------------");
        }
        if (sl == 3) {
            System.out.println("Se esta reproduciendo Flow de Slippy");
            System.out.println("--------------------5:30------------------------");
        }
        if (sl == 4) {
            System.out.println("Se esta reproduciendo Forgotten de Linkin Park");
            System.out.println("--------------------3:45------------------------");
        }
        
    }

    @Override
    public void frecuencia() {
        if (AM == false) {
            AM = true;
        }
        else{
            AM = false;
        }
        
    }

    @Override
    public void estaciones() {
        ArrayList<String> emisoras = new ArrayList<String>();
        for (double i=0.5; i<=10; i++){
           emisoras.add("Emisora "+i); 
        }
        
        
    }

    @Override
    public void emisoras() {
        System.out.println("-----No hay emisoras aguardas-----");
        
    }

    @Override
    public void plan() {
        v.error_C();
        
    }

    @Override
    public void targets() {
        System.out.println("-----Sacando tarjetas de presentaición-----");
        
    }

    @Override
    public void weather() {
        System.out.println("-----No hay pronostico actual-----");
        
    }

}
