public class Programa {

    public static void main(String[] args) {
        Persona p, q, o;
        p =new Persona(30822101,"Julio Fernandez",37);
        q = new Persona();

        /*o.nombre = "javier";
        o.edad = 34;
        o.documento = 343434;*/


        q.setDocumento(22222222);
        q.setNombre("kjkdkdsjfkdsjf");
        q.setEdad(34);

        System.out.println(p.getNombre()+" "+p.getEdad());
        System.out.println(q.getNombre()+" "+q.getEdad());
    }

}
