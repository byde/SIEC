/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUsuarios;

/**
 *
 * @author Lizbeth
 */
public class Dpa
{
    private int idDpa;
    private int idUsuario;
    private String [][] menu = {
        {"Competencias", "competencias.jsp"},//ver caso de uso "Determinar competencias y criterios"
        {"Revisiones", "revisiones.jsp"}, //ver caso de "Establecer propuestas de competencias"
        {"Criterios", "criterios.jsp"}, //ver caso de uso "Creacion de criterios"
        {"Reportes", "reportes.jsp"}, //Ver caso de uso de reportes
        {"Estrategias", "evaluaciones.jsp"} //Ver caso de uso de registrar estrategias.
    };

    public Dpa()
    {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    private void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    

    public int getIdDpa() {
        return idDpa;
    }

    private void setIdDpa(int idDpa) {
        this.idDpa = idDpa;
    }


    public String [][] getMenu()
    {
        return menu;
    }

    public String toString()
    {
        String regresa="";
        StringBuilder x= new StringBuilder();
        x.append("id_dpa:[").append(getIdDpa()).append("],");
        x.append("id_usuario:[").append(getIdUsuario()).append("],");
        regresa=x.toString();
        return regresa;
    }

//    public static void main(String[] args)
//    {
//        Dpa dpa=new Dpa();
//        dpa.setIdDpa(1);
//        dpa.setIdUsuario(6);
//        System.out.print(dpa.toString());
//    }

}
