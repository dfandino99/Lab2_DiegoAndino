//Laboratorio 2 de Programacion 2 

package lab2_diegoandino;

import java.util.*;

/**
 *
 * @author diegoandino
 */

public class Lab2_DiegoAndino {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList detec = new ArrayList();
        ArrayList hom = new ArrayList();
        ArrayList sec = new ArrayList();
        ArrayList robo = new ArrayList();
        ArrayList <Integer> rango = new ArrayList();
       
        char resp = 's';
            while (resp == 's') {
                System.out.print("\n\n**********MENU**********\n"
                        + "1). Agregar detectives\n"
                        + "2). Eliminar detectives\n"
                        + "3). Modificar detectives\n"
                        + "4). Listar detectives\n"
                        + "5). Registrar casos\n"
                        + "6). Modificar casos\n"
                        + "7). Listar casos\n"
                        + "8). Listar casos resuletos\n"
                        + "9). Listar casos pendientes\n"
                        + "10). Salir\n"
                        + "Escoja la opcion a realizar: ");
                int opc = leer.nextInt();
                
                    switch (opc) {
                        
                        case 1: {
                            System.out.print("\n\nIngrese el nombre del detective: ");
                            String n = leer.next();
                            System.out.print("\nIngrese la edad del detective: ");
                            int edad = leer.nextInt();
                            System.out.print("\nIngrese la nacionalidad del detective: ");
                            String na = leer.next();
                            System.out.print("\nIngrese los años laborales del detective: ");
                            int lab = leer.nextInt();
                            System.out.print("\nRango\n"
                                    + "1). Deberian despedirlo\n"
                                    + "2). Demasiado Bajo\n"
                                    + "3). Muy Bajo\n"
                                    + "4). Bajo\n"
                                    + "5). Normal\n"
                                    + "6). Bueno\n"
                                    + "7). Muy Bueno\n"
                                    + "8). Excelente\n"
                                    + "9). De los mejores detectives que hay\n"
                                    + "10). El mejor detective\n"
                                    + "Ingrese el rango: ");
                            int ran = leer.nextInt();
                            detec.add(new Detectives(n, edad, na, lab, ran));
                            
                        break; }//fin del caso 1
                        
                        case 2: {                       
                            if (detec.size() >= 1) {
                                String n = "";
                                int cont = 0;
                                for (Object d : detec) {
                                    n+= detec.indexOf(d)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                    n+="\n";
                                    cont++;
                                }
                                System.out.print("\n"+n); //muestro que detctives hay y sus nombres                            
                                System.out.print("\nQue detective deseas eliminar: ");                               
                                int d = leer.nextInt();
                                for (int j = 0; j < detec.size(); j++) {
                                    int ni = ((Detectives)detec.get(j)).getNivel();
                                    rango.add(ni);
                                }
                                Collections.sort(rango);
                                int min = rango.get(0); int max = rango.get(rango.size()-1); int max2 = rango.get(rango.size()-2);
                                    if(d >= 0 && d < detec.size()) {
                                        String s = ((Detectives)detec.get(d)).getNombre();
                                            for (int i = 0; i < hom.size(); i++) {
                                                if (((Detectives)detec.get(cont)).getNombre().equals(s)) {
                                                   //no pude hacer esta validacion 
                                                }
                                            }
                                        detec.remove(d);
                                        
                                    } else {
                                        System.out.println("\nEse numero esta fuera de rango");
                                    }
                            } else {
                                System.out.println("\nNo existe ningun detective laborando");
                            }//fin del if else
                        break; }//fin del caso 2
                        
                        case 3: {
                            if (detec.size() >= 1 ) {
                                String n = "";
                                int cont = 0;
                                for (Object d : detec) {
                                    n+= detec.indexOf(d)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                    n+="\n";//salto 
                                    cont++;
                                }
                                System.out.print("\n"+n); //muestro que detectives hay y sus nombres                            
                                System.out.print("\nQue detective deseas editas: ");
                                int d = leer.nextInt();
                                
                                    if (d >= 0 && d < detec.size()) {
                                        System.out.print("\n\nOpciones que puedes editar\n"
                                                + "1). Nombre\n"
                                                + "2). Edad\n"
                                                + "3). Nacionalidad\n"
                                                + "4). Años laborales'n"
                                                + "5). Nivel\n"
                                                + "Ingrese la opcion: ");
                                        int op = leer.nextInt();
                                            switch (op) {
                                                
                                                case 1: {
                                                    System.out.print("\nIngrese el nuevo nombre: ");
                                                    String nom = leer.next();
                                                    ((Detectives)detec.get(0)).setNombre(nom);
                                                break; }
                                                
                                                case 2: {
                                                    System.out.print("\nIngrese la nueva edad: ");
                                                    int ed = leer.nextInt();
                                                    ((Detectives)detec.get(1)).setEdad(ed);
                                                }
                                                
                                                case 3: {
                                                    System.out.print("\nIngrese la nueva nacionalidad: ");
                                                    String na = leer.next();
                                                    ((Detectives)detec.get(2)).setNacionalidad(na);
                                                }
                                                
                                                case 4: {
                                                    System.out.print("\nIngrese los nuevos años laborales: ");
                                                    int nom = leer.nextInt();
                                                    ((Detectives)detec.get(3)).setAnlaborales(nom);
                                                }
                                                
                                                case 5: {
                                                    System.out.print("\nRango\n"
                                                        + "1). Deberian despedirlo\n"
                                                        + "2). Demasiado Bajo\n"
                                                        + "3). Muy Bajo\n"
                                                        + "4). Bajo\n"
                                                        + "5). Normal\n"
                                                        + "6). Bueno\n"
                                                        + "7). Muy Bueno\n"
                                                        + "8). Excelente\n"
                                                        + "9). De los mejores detectives que hay\n"
                                                        + "10). El mejor detective\n"
                                                        + "Ingrese el rango: ");
                                                    System.out.print("\nIngrese el nuevo nivel: ");
                                                    int ni = leer.nextInt();
                                                    ((Detectives)detec.get(4)).setNivel(ni);
                                                }
                                                
                                                default : {
                                                    System.out.print("\nNo es una opcion valida\n");
                                                }
                                            }
                                    } else {
                                        System.out.println("\nNumero esta fuera de rango");
                                    }
                                
                            } else { 
                                System.out.println("\nNo puedes editar por que no existe ningun detective");
                            }
                        break; }//fin del caso 3
                        
                        case 4: {
                            String n = "";
                                for (Object d : detec) {
                                    n+= detec.indexOf(d)+" -> "+d;
                                    n+="\n";//salto 
                                }
                                System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                        break; }//fin del caso 4
                        
                        case 5: {
                            System.out.print("\nIngrese el lugar: ");
                            String l = leer.next();
                            System.out.print("\nIngrese la descripcion del caso: ");
                            String d = leer.next();
                              System.out.print("\nTipo de caso\n"
                                    + "1). Homicidio\n"
                                    + "2). Secuestro\n"
                                    + "3). Robo\n"
                                    + "Escoja la opcion: ");
                                int op = leer.nextInt();
                                
                                    if (op == 1) {
                                        String tipo = "Homicidio";
                                        String n = "";
                                        int cont = 0;
                                            for (Object o : detec) {
                                                n+= detec.indexOf(o)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                                n+="\n";//salto 
                                                cont++;
                                            }
                                            System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                                            System.out.print("\nIngrese el detective a cargo: ");
                                            int de = leer.nextInt();
                                            String detective = ((Detectives)detec.get(de)).getNombre();
                                            System.out.print("\nEstado del caso\n"
                                                    + "1). En proceso\n"
                                                    + "2). Resuelto\n"
                                                    + "Opcion: ");
                                            int est = leer.nextInt();
                                            String estado = "";
                                                if (est == 1) {
                                                    estado = "En Proceso";
                                                } else if (est == 2) {
                                                     estado = "Resuelto";
                                                } else {
                                                    System.out.println("No es valido");
                                                }
                                                hom.add(new Casos(l, d, tipo, detective, estado));
                                            
                                    } else if (op == 2) {
                                        String tipo = "Secuestro";
                                        String n = "";
                                        int cont = 0;
                                            for (Object o : detec) {
                                                n+= detec.indexOf(o)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                                n+="\n";//salto 
                                                cont++;
                                            }
                                            System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                                            System.out.print("\nIngrese el detective a cargo: ");
                                            int de = leer.nextInt();
                                            String dete = ((Detectives)detec.get(de)).getNombre();
                                            System.out.print("\nEstado del caso\n"
                                                    + "1). En proceso\n"
                                                    + "2). Resuelto\n"
                                                    + "Opcion: ");
                                            String estado = "";
                                            int est = leer.nextInt();
                                                if (est == 1) {
                                                    estado = "En Proceso";
                                                } else if (est == 2) {
                                                     estado = "Resuelto";
                                                } else {
                                                    System.out.println("No es valido");
                                                }
                                                sec.add(new Casos(l, d, tipo, dete, estado));
                                    } else if (op == 3) {
                                        String tipo = "Robo";
                                        String n = "";
                                        int cont = 0;
                                            for (Object o : detec) {
                                                n+= detec.indexOf(o)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                                n+="\n";//salto 
                                                cont++;
                                            }
                                            System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                                            System.out.print("\nIngrese el detective a cargo: ");
                                            int de = leer.nextInt();
                                            String dete = ((Detectives)detec.get(de)).getNombre();
                                            System.out.print("\nEstado del caso\n"
                                                    + "1). En proceso\n"
                                                    + "2). Resuelto\n"
                                                    + "Opcion: ");
                                            String estado = "";
                                            int est = leer.nextInt();
                                                if (est == 1) {
                                                    estado = "En Proceso";
                                                } else if (est == 2) {
                                                     estado = "Resuelto";
                                                } else {
                                                    System.out.println("No es valido");
                                                }
                                                robo.add(new Casos(l, d, tipo, dete, estado));
                                                
                                    } else {
                                        System.out.println("\nEsa opcion no es valida\n");
                                    }
                            
                        break; }//fin del caso 5
                        
                        case 6: {
                            if (hom.size() >= 1 || sec.size() >= 1 || robo.size() >= 1) {
                                System.out.print("Que tipo de caso modificaras?"
                                        + "1). Homicidio\n"
                                        + "2). Secuestro\n"
                                        + "3). Robo\n"
                                        + "Escoge la opcion");
                                int opci = leer.nextInt();
                                System.out.print("Ingrese la posicion a modificar: ");
                                int pos = leer.nextInt();
                                    if (opci == 1 && pos >= 0 && pos < hom.size()) {
                                        System.out.print("\nOpciones que puedes cambiar\n"
                                                + "1). Lugar\n"
                                                + "2). Descripcion\n"
                                                + "3). Tipo\n"
                                                + "4). Detective\n"
                                                + "5). Estado\n"
                                                + "Opcion: ");
                                        int lol = leer.nextInt();
                                            
                                            switch (lol) {
                                                
                                                case 1: {
                                                    System.out.print("\nIngrese el nuevo lugar: ");
                                                    String l = leer.next();
                                                    ((Casos)hom.get(0)).setLugar(l);
                                                }
                                                
                                                case 2: {
                                                    System.out.print("\nIngrese la nueva descripcion: ");
                                                    String l = leer.next();
                                                    ((Casos)hom.get(1)).setLugar(l);
                                                }
                                                
                                                case 3: {
                                                    System.out.print("Que tipo de caso modificaras?"
                                                    + "1). Homicidio\n"
                                                    + "2). Secuestro\n"
                                                    + "3). Robo\n"
                                                    + "Escoge la opcion");
                                                    System.out.print("\nIngrese el nuevo tipo: ");
                                                    String l = leer.next();
                                                    ((Casos)hom.get(2)).setTipo(l);
                                                }
                                                
                                                case 4: {
                                                   String n = "";
                                                    int cont = 0;
                                                        for (Object o : detec) {
                                                            n+= detec.indexOf(o)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                                            n+="\n";//salto 
                                                            cont++;
                                                        }
                                                        System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                                                        System.out.print("\nIngrese el nuevo detective a cargo: ");
                                                        int de = leer.nextInt();
                                                        String detective = ((Detectives)detec.get(de)).getNombre();
                                                        ((Casos)hom.get(3)).setDetective(detective);
                                                }
                                                
                                                case 5: {
                                                    System.out.print("\nEstado del caso\n"
                                                    + "1). En proceso\n"
                                                    + "2). Resuelto\n"
                                                    + "Opcion: ");
                                                    int est = leer.nextInt();
                                                    String estado = "";
                                                        if (est == 1) {
                                                            estado = "En Proceso";
                                                        } else if (est == 2) {
                                                             estado = "Resuelto";
                                                        } else {
                                                            System.out.println("No es valido");
                                                        }
                                                        ((Casos)hom.get(4)).setEstado(estado);
                                                        }
                                                
                                            }
                                    } else if (opci == 2 && pos >= 0 && pos < sec.size()) {
                                        System.out.print("\nOpciones que puedes cambiar\n"
                                                + "1). Lugar\n"
                                                + "2). Descripcion\n"
                                                + "3). Tipo\n"
                                                + "4). Detective\n"
                                                + "5). Estado\n"
                                                + "Opcion: ");
                                        int lol = leer.nextInt();
                                            
                                            switch (lol) {
                                                
                                                case 1: {
                                                    System.out.print("\nIngrese el nuevo lugar: ");
                                                    String l = leer.next();
                                                    ((Casos)sec.get(0)).setLugar(l);
                                                }
                                                
                                                case 2: {
                                                    System.out.print("\nIngrese la nueva descripcion: ");
                                                    String l = leer.next();
                                                    ((Casos)sec.get(1)).setLugar(l);
                                                }
                                                
                                                case 3: {
                                                    System.out.print("Que tipo de caso modificaras?"
                                                    + "1). Homicidio\n"
                                                    + "2). Secuestro\n"
                                                    + "3). Robo\n"
                                                    + "Escoge la opcion");
                                                    System.out.print("\nIngrese el nuevo tipo: ");
                                                    String l = leer.next();
                                                    ((Casos)sec.get(2)).setTipo(l);
                                                }
                                                
                                                case 4: {
                                                   String n = "";
                                                    int cont = 0;
                                                        for (Object o : detec) {
                                                            n+= detec.indexOf(o)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                                            n+="\n";//salto 
                                                            cont++;
                                                        }
                                                        System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                                                        System.out.print("\nIngrese el nuevo detective a cargo: ");
                                                        int de = leer.nextInt();
                                                        String detective = ((Detectives)detec.get(de)).getNombre();
                                                        ((Casos)sec.get(3)).setDetective(detective);
                                                }
                                                
                                                case 5: {
                                                    System.out.print("\nEstado del caso\n"
                                                    + "1). En proceso\n"
                                                    + "2). Resuelto\n"
                                                    + "Opcion: ");
                                                    int est = leer.nextInt();
                                                    String estado = "";
                                                        if (est == 1) {
                                                            estado = "En Proceso";
                                                        } else if (est == 2) {
                                                             estado = "Resuelto";
                                                        } else {
                                                            System.out.println("No es valido");
                                                        }
                                                        ((Casos)sec.get(4)).setEstado(estado);
                                                        }
                                                
                                            }
                                    } else if (opci == 3 && pos >= 0 && pos < robo.size()) {
                                        System.out.print("\nOpciones que puedes cambiar\n"
                                                + "1). Lugar\n"
                                                + "2). Descripcion\n"
                                                + "3). Tipo\n"
                                                + "4). Detective\n"
                                                + "5). Estado\n"
                                                + "Opcion: ");
                                        int lol = leer.nextInt();
                                            
                                            switch (lol) {
                                                
                                                case 1: {
                                                    System.out.print("\nIngrese el nuevo lugar: ");
                                                    String l = leer.next();
                                                    ((Casos)robo.get(0)).setLugar(l);
                                                }
                                                
                                                case 2: {
                                                    System.out.print("\nIngrese la nueva descripcion: ");
                                                    String l = leer.next();
                                                    ((Casos)robo.get(1)).setLugar(l);
                                                }
                                                
                                                case 3: {
                                                    System.out.print("Que tipo de caso modificaras?"
                                                    + "1). Homicidio\n"
                                                    + "2). Secuestro\n"
                                                    + "3). Robo\n"
                                                    + "Escoge la opcion");
                                                    System.out.print("\nIngrese el nuevo tipo: ");
                                                    String l = leer.next();
                                                    ((Casos)robo.get(2)).setTipo(l);
                                                }
                                                
                                                case 4: {
                                                   String n = "";
                                                    int cont = 0;
                                                        for (Object o : detec) {
                                                            n+= detec.indexOf(o)+" -> "+((Detectives)detec.get(cont)).getNombre();
                                                            n+="\n";//salto 
                                                            cont++;
                                                        }
                                                        System.out.print("\n"+n); //muestro que detectives hay y sus nombres
                                                        System.out.print("\nIngrese el nuevo detective a cargo: ");
                                                        int de = leer.nextInt();
                                                        String detective = ((Detectives)detec.get(de)).getNombre();
                                                        ((Casos)robo.get(3)).setDetective(detective);
                                                }
                                                
                                                case 5: {
                                                    System.out.print("\nEstado del caso\n"
                                                    + "1). En proceso\n"
                                                    + "2). Resuelto\n"
                                                    + "Opcion: ");
                                                    int est = leer.nextInt();
                                                    String estado = "";
                                                        if (est == 1) {
                                                            estado = "En Proceso";
                                                        } else if (est == 2) {
                                                             estado = "En proceso";
                                                        } else {
                                                            System.out.println("No es valido");
                                                        }
                                                        ((Casos)robo.get(4)).setEstado(estado);
                                                        }
                                                
                                            }
                                    }
                            } else {
                                System.out.println("No existen casos, no puedes modificar o la posicion esta fuera de rango");
                            }
                        break; }//fin del caso 6
                        
                        case 7: {
                            String casos = "Lista de casos";
                            casos+='\n';
                            casos+="Homicidios";
                            casos+= "\n";
                                for (Object hom1 : hom) {
                                    casos+=hom;
                                    casos+="\n";
                                }
                                casos+="\n";
                                
                                casos+="Secuestros";
                                for (Object s : sec) {
                                    casos+=s;
                                    casos+="\n";
                                }
                                casos+="\n";
                                
                                casos+="Robos";
                                for (Object r : robo) {
                                    casos+=r;
                                    casos+="\n";
                                }
                                System.out.println(casos);
                                
                        break; }//fin del caso 7
                        
                        case 8: {
                            String casos = "Lista de casos resueltos";
                            casos+='\n';
                            casos+="Homicidios";
                            casos+= "\n";
                            int cont = 0;
                                for (Object hom1 : hom) {
                                    if (((Casos)hom.get(cont)).getEstado().equals("Resuelto")) {
                                        casos+=hom;
                                        casos+="\n";
                                    }
                                    cont++;
                                }
                                casos+="\n";
                                cont = 0;
                                
                                casos+="Secuestros";
                                for (Object s : sec) {
                                    if (((Casos)sec.get(cont)).getEstado().equals("Resuelto")) {
                                    casos+=s;
                                    casos+="\n";
                                    }
                                    cont++;
                                }
                                casos+="\n";
                                cont = 0;
                                
                                casos+="Robos";
                                for (Object r : robo) {
                                    if (((Casos)robo.get(cont)).getEstado().equals("Resuelto")) {
                                    casos+=r;
                                    casos+="\n";
                                    }
                                    cont++;
                                }
                                
                                System.out.print("\n"+casos);
                                
                        break; }//fin del caso 8 
                        
                        case 9: {
                            String casos = "Lista de casos pendientes";
                            casos+='\n';
                            casos+="Homicidios";
                            casos+= "\n";
                            int cont = 0;
                                for (Object hom1 : hom) {
                                    if (((Casos)hom.get(cont)).getEstado().equals("En proceso")) {
                                        casos+=hom;
                                        casos+="\n";
                                    }
                                    cont++;
                                }
                                casos+="\n";
                                cont = 0;
                                
                                casos+="Secuestros";
                                for (Object s : sec) {
                                    if (((Casos)sec.get(cont)).getEstado().equals("En proceso")) {
                                    casos+=s;
                                    casos+="\n";
                                    }
                                    cont++;
                                }
                                casos+="\n";
                                cont = 0;
                                
                                casos+="Robos";
                                for (Object r : robo) {
                                    if (((Casos)robo.get(cont)).getEstado().equals("En proceso")) {
                                    casos+=r;
                                    casos+="\n";
                                    }
                                    cont++;
                                }
                                
                                System.out.print("\n"+casos);
                        break; }//fin del caso 9
                        
                        case 10: {
                            resp = 'n'; 
                            System.out.print("\nHASTA PRONTO\n");
                        break; }//fin del caso 10
                        
                        default : {
                            System.out.print("\nOooops! Esa no es una opcion, intentalo de nuevo.\n"); break;
                        }//fin del default
                        
                    } //fin del bloque caso que controla mis opciones
                
            }//fin del ciclo que controla el menu
            
    }//fin del main
    
}//fin de la clase
