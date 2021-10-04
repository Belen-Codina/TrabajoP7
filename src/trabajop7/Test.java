/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop7;

/**
 *
 * @author belen
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Materia m1= new Materia(1, "Ingles", 1);
        Materia m2= new Materia(2, "Matematica", 1);
         Materia m3= new Materia(3, "Laboratorio 1", 1);
      
         
         Alumno a1= new Alumno(1001, "López", "Martin");
          Alumno a2= new Alumno(1002, "Martinez", "Brenda");
           
          a1.agregarMateria(m1);
           a1.agregarMateria(m2);
            a1.agregarMateria(m3);
            
            a2.agregarMateria(m1);
             a2.agregarMateria(m2);
              a2.agregarMateria(m3);
              a2.agregarMateria(m3);
             
              
              System.out.println("Materias de: "+a1.getApellido()+" "+ a1.getLista());
               System.out.println("Cantidad de materias de "+a1.getApellido()+" = "+ a1.cantidadDeMaterias());
              
              System.out.println("Materias de: "+a2.getApellido()+" "+ a2.getLista());
              System.out.println("Materias de: "+a2.getApellido()+" = "+ a2.cantidadDeMaterias());
              
              
      
    }
    
}
