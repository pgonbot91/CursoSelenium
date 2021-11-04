package EjerciciosPratica7;

import EjerciciosPractica6.Alumno;
import EjerciciosPractica6.Persona;
import EjerciciosPractica6.Profesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {

    private static List<Profesor> listaProfesor = new ArrayList<Profesor>();
    private static List<Alumno> listaAlumno = new ArrayList<Alumno>();
    private static List<Persona> listaPersona = new ArrayList<Persona>();


    public static void main (String args[]){

        Scanner input = new Scanner (System.in);

        Profesor profe1 = new Profesor();
        //Como profesor y alumno son del tipo persona, podria declararlas como tal, es decia, podria hacer esto:
        Persona profe2 = new Profesor("Don Jose", 7785, "Biologia", 1300);

        //no puedo añadir el profe2 a una lista que sea de profesor porque no es de tipo profesor, sino que es persona, y Java es restrictivo con eso
        //listaPersona.add(profe1);
        //listaPersona.add(profe2);
        agregarElementosAListaPersona(profe1);
        agregarElementosAListaPersona(profe2);

        System.out.println(profe1);
        System.out.println(profe2);


        Alumno alum1 = new Alumno("Juan" , 1234);
        Alumno alum2 = new Alumno("Manoli", 9876, "Tercero");

        //listaPersona.add(alum1);
        //listaPersona.add(alum2);

        agregarElementosAListaPersona(alum1);
        agregarElementosAListaPersona(alum2);

        //listaPersona.clear(); --> vacia la lista

        imprimirListaPersonas();

        Profesor profeMates = new Profesor("Marcos", 1452, "Matematicas", 1400);
        Profesor profeIngles = new Profesor ("Concha", 7410, "ingles", 900);
        Profesor profeLengua = new Profesor();


        agregarProfesorAListaProfes(profeMates);
        agregarProfesorAListaProfes(profeIngles);
        agregarProfesorAListaProfes(profeLengua);



        System.out.println("¿Cuantos alumnos quiere ingresar?");
        int cantidadAlumnos = input.nextInt();

        for(int i = 1; i < cantidadAlumnos; i++){
            Alumno crearAlumnoNuevo = crearAlumno();
            añadirAlumnoALista(crearAlumnoNuevo);



            System.out.println("Se ha agregado a " + crearAlumnoNuevo.getNombre() +  " al sistema");
        }

        imprimirListaAlumnos();

        imprimirListaPersonas();

        }

        public static void imprimirListaAlumnos(){
            for(Alumno estudiante: listaAlumno){
                System.out.println(estudiante);
            }

        }

        public static void agregarElementosAListaPersona(Persona p){
            listaPersona.add(p);
        }

        public static void agregarProfesorAListaProfes(Profesor profe){
            listaProfesor.add(profe);
        }

        public static void imprimirListaPersonas(){
            if(listaPersona.isEmpty() == false) {
                System.out.println("La lista de personas: ");
                for (int i = 0; i < listaPersona.size(); i++) {
                    System.out.println(listaPersona.get(i));
                }
            }else{
                System.out.println("La lista esta vacia ");
            }

        }

        public static boolean encontrarProfesor (String unNombre){

           /* for(Profesor profe: listaProfesor){
                //profe es un objeto, entonces yo no podría hacer esto:
                //if (profe == "Marcos) , porque estaría comparando un objeto con un String, y eso da un error. Tampoco puedo usar == para String, tiene que
                //usarse equals, asi que quedaría asi:
                // if(profe.getNombre().equals("Marcos") -> y ahora si podria

                if(profe.getNombre().equals("Marcos")){
                    System.out.println("EL profesor está en la lisa");
                }

                //para ver si un nombre esta en la lista
                if(profe.getNombre().contains("Marcos")){//este if es un booleano, podria poner profe.getNombre().contains("Marcos") == true
                    System.out.println("EL nombre está en la lista");
                }
                System.out.println(profe);
                //tengo todos los metodos de los profesores disponibles
                /*
                 * System.out.println(profe.getMateria());
                 * System.out.println(profe.getNombre());
                 * System.out.println(profe.getDNI());
                 * */

                boolean encontrarNombre = false;
                for (Profesor profe : listaProfesor){
                    if (profe.getNombre().equals(unNombre)){
                        System.out.println("El profesor se encuentra en la lista");
                        encontrarNombre = true;
                    }
                    if (encontrarNombre == false){
                        System.out.println("EL nombre no está en la lista");
                    }
            }
                return encontrarNombre;
        }

        public static void añadirAlumnoALista (Alumno unAlumno){
            listaAlumno.add(unAlumno);
        }

        public static Alumno crearAlumno (){

        Scanner input = new Scanner (System.in);

            String nombre = Utilities.ingresarMensaje("Ingrese un nombre");
            
            int DNI = Utilities.ingresarNumero("Ingrese el DNI del alumno");

            String curso = Utilities.ingresarMensaje("Ingrese el curso del alumno");


            Alumno alumno = new Alumno(nombre, DNI, curso);
            return alumno;
        }

    }

