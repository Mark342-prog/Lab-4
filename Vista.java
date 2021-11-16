import java.util.Scanner;
import java.util.InputMismatchException;

public class Vista {
    private Scanner scan;

    public Vista(){
        scan = new Scanner(System.in);
    }

    public void inicio(){
        System.out.println("Inicio...........");
        System.out.println("");
        System.out.println("--------- Mercedes ------------");
        System.out.println("  ");
    }

    public int Menu_I() throws Exception, InputMismatchException{  //Menu de incio
        int tipo = -1;
        boolean a = false;

        try{
            System.out.println("---------  Menu -------------");
            System.out.println("Acciones a realizar:");
            System.out.println("");
            System.out.println("1. Cambiar el volumen");
            System.out.println("2. Modo Radio");
            System.out.println("3. Modo Reproduccion");
            System.out.println("4. Modo Telefono");
            System.out.println("5. Modo Productividad");
            System.out.println("6. Salir");
            System.out.println("");

            while (!a){ 
                tipo = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (tipo > 0 && tipo <= 6)
                    a = true;
                else{ 
                    System.out.println("hay un error:    porfavor ingrese un numero valido"); 
                }
            }
        } catch (InputMismatchException e){ 
            String s = "Error cuando se realizo la conversion con scan.nextInt() " + tipo + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){
            String s = "El error ocurrio en scan.nextInt() " +  tipo + ": " + e.toString();
            throw new Exception(s);
        }
        return tipo;
    }

    public int Menu_R() throws Exception, InputMismatchException{  //Menu de modo radio 
        int tipo = -1;
        boolean a = false;

        try{
            System.out.println("---------  Modo Radio -------------");
            System.out.println("Acciones a realizar:");
            System.out.println("");
            System.out.println("1. Cambiar de FM a AM");
            System.out.println("2. Cambiar emisoras      (se cambiará en intervalos de 0.5)");
            System.out.println("3. Guardar Emisora ");
            System.out.println("4. Cargar Emisora");
            System.out.println("5. Regresar al menu principal");
            System.out.println("");

            while (!a){ 
                tipo = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (tipo > 0 && tipo <= 5)
                    a = true;
                else{ 
                    System.out.println("hay un error:    porfavor ingrese un numero valido"); 
                }
            }
        } catch (InputMismatchException e){ 
            String s = "Error cuando se realizo la conversion con scan.nextInt() " + tipo + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){
            String s = "El error ocurrio en scan.nextInt() " +  tipo + ": " + e.toString();
            throw new Exception(s);
        }
        return tipo;
    }

    public int Menu_Re() throws Exception, InputMismatchException{  //Menu de modo reproduccion 
        int tipo = -1;
        boolean a = false;

        try{
            System.out.println("---------  Modo Reproduccion -------------");
            System.out.println("Acciones a realizar:");
            System.out.println("");
            System.out.println("1. Seleccione lista de reproduccion");
            System.out.println("2. Cambiar cancion  -->");
            System.out.println("3. Escuchar Cancion ");
            System.out.println("4. Regresar al menu principal");
            System.out.println("");

            while (!a){ 
                tipo = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (tipo > 0 && tipo <= 4)
                    a = true;
                else{ 
                    System.out.println("hay un error:    porfavor ingrese un numero valido"); 
                }
            }
        } catch (InputMismatchException e){ 
            String s = "Error cuando se realizo la conversion con scan.nextInt() " + tipo + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){
            String s = "El error ocurrio en scan.nextInt() " +  tipo + ": " + e.toString();
            throw new Exception(s);
        }
        return tipo;
    }

    public int Menu_T() throws Exception, InputMismatchException{  //Menu de modo telefono
        int tipo = -1;
        boolean a = false;

        try{
            System.out.println("---------  Modo Telefono -------------");
            System.out.println("Acciones a realizar:");
            System.out.println("");
            System.out.println("1. Conectar telefono");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Llamar a contactos");
            System.out.println("4. Finalizar llamada");
            System.out.println("5. Cambiar a bocinas o auriculares");
            System.out.println("6. Llamar al ultimo contacto con el que se hablo");
            System.out.println("7. Cambiar a llamada en espera");
            System.out.println("8. Regresar a menu principal");

            while (!a){ 
                tipo = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (tipo > 0 && tipo <= 8)
                    a = true;
                else{ 
                    System.out.println("hay un error:    porfavor ingrese un numero valido"); 
                }
            }
        } catch (InputMismatchException e){ 
            String s = "Error cuando se realizo la conversion con scan.nextInt() " + tipo + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){
            String s = "El error ocurrio en scan.nextInt() " +  tipo + ": " + e.toString();
            throw new Exception(s);
        }
        return tipo;
    }

    public int Menu_P() throws Exception, InputMismatchException{  //Menu de modo productividad
        int tipo = -1;
        boolean a = false;

        try{
            System.out.println("---------  Modo Productividad -------------");
            System.out.println("Acciones a realizar:");
            System.out.println("");
            System.out.println("1. Planificar Viajes");
            System.out.println("2. Ver tarjetas de presentacion");
            System.out.println("3. Ver pronostico del tiempo ");
            System.out.println("4. Regresar");
            System.out.println("");

            while (!a){ 
                tipo = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (tipo > 0 && tipo <= 4)
                    a = true;
                else{ 
                    System.out.println("hay un error:    porfavor ingrese un numero valido"); 
                }
            }
        } catch (InputMismatchException e){ 
            String s = "Error cuando se realizo la conversion con scan.nextInt() " + tipo + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){
            String s = "El error ocurrio en scan.nextInt() " +  tipo + ": " + e.toString();
            throw new Exception(s);
        }
        return tipo;
    }



    public int Tipo_Carro() throws Exception, InputMismatchException{  //seleccion de tipo de carro 
        int carro = -1;
        boolean a = false;

        try{
            System.out.println("    ");
            System.out.println("Porfavor, ingrese el tipo de carro que utiliza: ");
            System.out.println("");
            System.out.println("1. Carro Clase S");
            System.out.println("2. Carro Clase A ");
            System.out.println("3. Carro Clase C ");
            System.out.println("");

            while (!a){ 
                carro = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (carro > 0 && carro <= 3)
                    a = true;
                else{ 
                    System.out.println("hay un error:    porfavor ingrese un numero valido"); 
                }
            }
        } catch (InputMismatchException e){ 
            String s = "Error cuando se realizo la conversion con scan.nextInt() " + carro + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){
            String s = "El error ocurrio en scan.nextInt() " +  carro + ": " + e.toString();
            throw new Exception(s);
        }
        return carro;
    }


    public void error_C(){  //erro al uso de carro
        System.out.println("El carro que usted posee no puede realizar esta accion");
    }

    public void Fin(){
        System.out.println("Gracias...........");
        System.out.println("");
        System.out.println("--------- Mercedes ------------");
        System.out.println(" OFF ");
    }

}
