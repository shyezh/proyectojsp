package edu.fje.daw2;

import java.io.Serializable;
/**
 * JavaBean Main Model de dades
 */
public class Main implements Serializable {

    private String nom;
    private int temps;
    private String ntasque1;
    private String dtasque1;
    private int dutasque1;
    private String rtasque1;
    private String ntasque2;
    private String dtasque2;
    private int dutasque2;
    private String rtasque2;
    private String ntasque3;
    private String dtasque3;
    private int dutasque3;
    private String rtasque3;
    
   public Main(String nom, int temps, String ntasque1, int dutasque1, String ntasque2, int dutasque2, String ntasque3, int dutasque3) {
        this.nom = nom;
        this.temps = temps;
         this.ntasque1 = ntasque1;
         this.dutasque1 = dutasque1;
         this.ntasque2 = ntasque2;
         this.dutasque2 = dutasque2;
         this.ntasque3 = ntasque3;
         this.dutasque3 = dutasque3;
      /** 
        this.dtasque1 = dtasque1;
        this.rtasque1 = rtasque1;
        this.dtasque2 = dtasque2;
        this.rtasque2 = rtasque2;
        this.ntasque3 = ntasque3;
        this.rtasque3 = rtasque3;
      */
    }
    public Main() {
    }

    public String getNtasque1() {
        return ntasque1;
    }

    public void setNtasque1(String ntasque1) {
        this.ntasque1 = ntasque1;
    }

    public String getDtasque1() {
        return dtasque1;
    }

    public void setDtasque1(String dtasque1) {
        this.dtasque1 = dtasque1;
    }

    public int getDutasque1() {
        return dutasque1;
    }

    public void setDutasque1(int dutasque1) {
        this.dutasque1 = dutasque1;
    }

    public String getRtasque1() {
        return rtasque1;
    }

    public void setRtasque1(String rtasque1) {
        this.rtasque1 = rtasque1;
    }

    public String getNtasque2() {
        return ntasque2;
    }

    public void setNtasque2(String ntasque2) {
        this.ntasque2 = ntasque2;
    }

    public String getDtasque2() {
        return dtasque2;
    }

    public void setDtasque2(String dtasque2) {
        this.dtasque2 = dtasque2;
    }

    public int getDutasque2() {
        return dutasque2;
    }

    public void setDutasque2(int dutasque2) {
        this.dutasque2 = dutasque2;
    }

    public String getRtasque2() {
        return rtasque2;
    }

    public void setRtasque2(String rtasque2) {
        this.rtasque2 = rtasque2;
    }

    public String getNtasque3() {
        return ntasque3;
    }

    public void setNtasque3(String ntasque3) {
        this.ntasque3 = ntasque3;
    }

    public String getDtasque3() {
        return dtasque3;
    }

    public void setDtasque3(String dtasque3) {
        this.dtasque3 = dtasque3;
    }

    public int getDutasque3() {
        return dutasque3;
    }

    public void setDutasque3(int dutasque3) {
        this.dutasque3 = dutasque3;
    }

    public String getRtasque3() {
        return rtasque3;
    }

    public void setRtasque3(String rtasque3) {
        this.rtasque3 = rtasque3;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Alumne{"
                + "nom='" + nom + '\''
                + ", temps=" + temps + '\''
                + ", ntasque1=" + ntasque1 + '\''
                + ", dutasque1=" + dutasque1 + '\''
                + ", ntasque2=" + ntasque2 + '\''
                + ", dutasque2=" + dutasque2 + '\''
                + ", ntasque3=" + ntasque3 + '\''
                + ", dutasque3=" + dutasque3 + '\''
                + '}';
    }

}
