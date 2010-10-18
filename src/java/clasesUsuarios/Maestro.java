/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUsuarios;

/**
 *
 * @author Lizbeth
 */
public class Maestro {
    //propiedades
    private int idMaestro;
    private int idUsuario;
    private String [][] menu = {
        {"Competencias", "competencias.jsp"}, //ver caso de "Establecer propuestas de competencias"
        {"Reportes", "reportes.jsp"},
        {"Evaluaciones Formativas", "evaluacionesf.jsp"}, //Ver caso de uso "Evaluaciones formativas"
        {"Evaluaciones Acumulativa", "evaluacionesa.jsp"}, //Ver caso de uso "Evaluaciones acumulativa"
        {"Estrategias", "estrategias.jsp"}//Ver caso de uso estrategias
    };

    //constructor
    public Maestro(){}
    
    // get and set
     public int getIdMaestro() {
        return idMaestro;
    }
    
    
    private void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String [][] getMenu()
    {
        return menu;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    private void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
   
      //metodo to sating
    @Override
     public String toString()
     {
         String regresa="";
         StringBuilder x= new StringBuilder();
         x.append("id_usario [").append(getIdUsuario()).append("],");
         x.append("id_maestro [").append(getIdMaestro()).append("],");
         regresa=x.toString();
         return regresa;


     }
     @Override// no se
    public void finalize() {
    }
     //metodo main
//    public static void main(String[] args)
//    {
//      Maestro maestro= new Maestro();
//      maestro.setIdMaestro(3);
//      maestro.setIdUsuario(4);
//      System.out.println(maestro.toString());
//
//    }
}
