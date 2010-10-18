/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUsuarios;
/**
 *
 * @author RaiL
 */
public class Alumno /*implements Usuario*/{
    
 private int idAlumno;
 private String nombre;
 private String matricula;
 private String carrera;
    private String [][] menu = {
        {"Auto-Evaluacion", "competencias.jsp"}, //Ver caso de uso "Auto Evaluacion"
        {"Evaluaciones Formaticas", "evaluaciones.jsp"}, //Ver caso de uso "Evaluaciones Formativas", co-evaluacion
    };


    public String [][] getMenu()
    {
        return menu;
    }
 public Alumno(int idAlumno, String nombre, String matricula, String carrera){
        setIdAlumno(idAlumno);
        setNombre(nombre);
        setMatricula(matricula);
        setCarrera(carrera);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    @Override
    public String toString() {
        String regresa="";
        StringBuilder sb = new StringBuilder();
        sb.append("Valores de mi clase: \n idAlumno [").append(getIdAlumno()).append("], ");
        sb.append(" setNombre [").append(getNombre()).append("], ");
        sb.append(" Matricula [").append(getMatricula()).append("],");
        sb.append(" Carrera [").append(getCarrera()).append("],");
        regresa = sb.toString();
        return regresa;
    }

//     public static void main(String[] args) {
//
//  Alumno alumno = new Alumno(1,"Alex","up080218","ISEI");
//
//  System.out.println(alumno.toString());
//      
//    }

}
