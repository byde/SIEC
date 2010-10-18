package clasesUsuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class Usuarios extends BD.BaseDeDatos {

    private int id=0;
    private String nombre="";
    private String usname="";
    private String pass="";
    private int perfil = 0;

    
    public Usuarios(){}
    public Usuarios(int id, String nombre, String usname, String pass){
        setId(id);
        setNombre(nombre);
        setUsname(usname);
        setPass(pass);
   }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getUsname() {
        return usname;
    }
    public void setUsname(String usname) {
        this.usname = usname;
    }

   public static  List<Usuarios> CrearUsuarios(){
        Usuarios user1 = new Usuarios(1,"maestro1","jo","jo");
        Usuarios user2 = new Usuarios(2,"maestro2","ji","ji");
        Usuarios user3 = new Usuarios(3,"alumno","enrique","upa");
        
       
        List<Usuarios>usuarios = new ArrayList<Usuarios>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        return usuarios;
    }
    public boolean Login(String usname,String pass) throws SQLException{
        //List<Usuarios>u = Usuarios.CrearUsuarios();

            ResultSet rs = s.executeQuery ("SELECT USUARIO_ID, USUARIO, PERFIL_ID FROM tr_usuario WHERE  USUARIO = '" + usname + "' AND PASSWORD = '" + pass + "'");

            /*
            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next())
            {
                st += rs.getInt ("IdUsuario") + " " + rs.getString (2);
            }
             *
             */
            //this.apellidos = rs.getString("password");

    /*    for(int i=0; i < u.size(); i++)
        {
            String n1 = u.get(i).getUsname();
            String n2 = u.get(i).getPass();
            if(n1.equals(usname) &&  n2.equals(pass))
            {                    
                return true;
            }
        }*/
            this.st = "no logeado " + "SELECT USUARIO_ID, USUARIO, PERFIL_ID FROM tr_usuario WHERE  USUARIO = '" + usname + "' AND PASSWORD = '" + pass + "'";
            if(rs.last() == true){
                this.id = rs.getInt("USUARIO_ID");
                this.usname = rs.getString("USUARIO");
                this.perfil = rs.getInt("PERFIL_ID");
                this.st = "logeado";
                return true;
            }
        return false;
    }

    /**
     * @return the perfil
     */
    public int getPerfil() {
        return perfil;
    }
}
