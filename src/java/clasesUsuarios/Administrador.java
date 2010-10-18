/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUsuarios;

/**
 *
 * @author Lizbeth
 */
public class Administrador {
    // propiedades
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int prefil;
    private String contraseña;
    private String [][] menu = {
        {"Competencias", "competencias.jsp"},//ver caso de uso "Determinar competencias y criterios"
        {"Criterios", "criterios.jsp"}, //ver caso de uso "Creacion de criterios"
        {"Reportes", "reportes.jsp"}, //Ver caso de uso de reportes
        {"Estrategias", "evaluaciones.jsp"} //Ver caso de uso de registrar estrategias.
    };
    //constructor
    public Administrador()
    {}
    //get ande Set
     public int getIdUsuario() {
        return idUsuario;
    }


    public String [][] getMenu()
    {
        return menu;
    }
    
    private void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    private void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrefil() {
        return prefil;
    }

    public void setPrefil(int prefil) {
        this.prefil = prefil;
    }
    //metodo toString
    public String toString()
    {
        String regresa="";
        StringBuilder x= new StringBuilder();
        x.append("Id_usuario [").append(getIdUsuario()).append("],");
        x.append("nombre [").append(getNombre()).append("],");
        x.append("Apellido [").append(getApellido()).append("],");
        x.append("Perfil [").append(getPrefil()).append("],");
        x.append("Contraseña [").append(getContraseña()).append("],");
        regresa=x.toString();
        return regresa;
    }
    @Override
    public void finalize()
    {
    }

//    public static void main(String[] args)
//    {
//        Usuario usuario =new Usuario();
//        usuario.setIdUsuario(2);
//        usuario.setNombre("Lizbeth");
//        usuario.setApellido("Delgado");
//        usuario.setPrefil(4);
//        usuario.setContraseña("ninguna");
//        System.out.println(usuario.toString());
//    }

}