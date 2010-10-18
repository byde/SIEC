/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 *
 * @author RaiL
 */
public class Grupo /*implements Carrera*/{
    
    private int idGrupo;
    private int cuatrimestre;
    private String letra;
    
     public Grupo(int idGrupo,int cuatrimestre,String letra){
        setIdGrupo(idGrupo);
        setCuatrimestre(cuatrimestre);
        setLetra(letra);
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    

    @Override
    public String toString() {
        String regresa="";
        StringBuilder sb = new StringBuilder();
        sb.append("Valores de mi clase: \n idGrupo  [").append(getIdGrupo()).append("], ");
        sb.append(" setCuatrimestre [").append(getCuatrimestre()).append("], ");
        sb.append(" Letra [").append(getLetra()).append("],");
        regresa = sb.toString();
        return regresa;
    }

//     public static void main(String[] args) {
//
//  Grupo grupo = new Grupo(1,6,"A");
//
//  System.out.println(grupo.toString());
//        
//    }



}
