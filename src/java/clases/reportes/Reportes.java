/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases.reportes;

/**
 *
 * @author Lizbeth Delgado Márquez
 */
public class Reportes
{
    //propiedades
    private int idReporte;
    private String descripcion;
    private int idPerfil;
    private int idCriterio;
    private int idCompentencia;

    //constructor
    public Reportes()
    {
    }
    //get and set
    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getIdCompentencia()
    {
        return idCompentencia;
    }

    public void setIdCompentencia(int idCompentencia)
    {
        this.idCompentencia = idCompentencia;
    }

    public int getIdCriterio()
    {
        return idCriterio;
    }

    public void setIdCriterio(int idCriterio)
    {
        this.idCriterio = idCriterio;
    }

    public int getIdPerfil()
    {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil)
    {
        this.idPerfil = idPerfil;
    }

    public int getIdReporte()
    {
        return idReporte;
    }

    public void setIdReporte(int idReporte)
    {
        this.idReporte = idReporte;
    }
    //metodo to string
     public String toString()
     {
         String regresa="";
         StringBuilder x= new StringBuilder();
         x.append("id_report [").append(getIdReporte()).append("],");
         x.append("Descripcion [").append(getDescripcion()).append("],");
         x.append("id_perfil [").append(getIdPerfil()).append("] ,");
         x.append("Criterio [").append(getIdCriterio()).append("] ,");
         x.append("Competencia [").append(getIdCompentencia()).append("] ,");


         regresa=x.toString();
         return regresa;
     }
      @Override// no se esta en el ejmeplo de la maestra
    public void finalize() {
    }
     //metodo main
//     public static void main(String[] args)
//     {
//       Reportes reportes =new Reportes();
//       reportes.setIdReporte(2);
//       reportes.setDescripcion("valor");
//       reportes.setIdCompentencia(4);
//       reportes.setIdCriterio(5);
//       reportes.setIdPerfil(6);
//       System.out.println(reportes.toString());
//
//     }
}
