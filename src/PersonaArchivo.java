import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonaArchivo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
        sc.useDelimiter("[,\\n]");
        Persona mayor= null;

        while(sc.hasNextInt()){
            int documento = sc.nextInt();
            String nombre = sc.next();
            int edad = sc.nextInt();

            Persona p = new Persona(documento,nombre,edad);

            if(mayor == null || p.getEdad() > mayor.getEdad()){
                mayor = p;
            }

            //System.out.println(p.getNombre()+ " "+ p.getEdad());
            System.out.println(p.toString());

        }
        System.out.println("La persona mayor es: ");
        System.out.println(mayor.getNombre()+" "+mayor.edadmas10(12));
    }
}
