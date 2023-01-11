/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class HistMed2 {
    private String DiagnosticoHistMed;
    private String AdmissaoHistMed;
    private String AltaHistMed;
    private String MedicacaoHistMed;
    private String DescPacHistMed;
    private String CpfPacHistMed;

    Conexao con = new Conexao();
    
    public HistMed2() {
        this("","","","","","");
    }

    public HistMed2(String DiagnosticoHistMed, String AdmissaoHistMed, String AltaHistMed, String MedicacaoHistMed, String DescPacHistMed, String CpfPacHistMed) {
        this.DiagnosticoHistMed = DiagnosticoHistMed;
        this.AdmissaoHistMed = AdmissaoHistMed;
        this.AltaHistMed = AltaHistMed;
        this.MedicacaoHistMed = MedicacaoHistMed;
        this.DescPacHistMed = DescPacHistMed;
        this.CpfPacHistMed = CpfPacHistMed;
    }

    public String getDiagnosticoHistMed() {
        return DiagnosticoHistMed;
    }

    public void setDiagnosticoHistMed(String DiagnosticoHistMed) {
        this.DiagnosticoHistMed = DiagnosticoHistMed;
    }

    public String getAdmissaoHistMed() {
        return AdmissaoHistMed;
    }

    public void setAdmissaoHistMed(String AdmissaoHistMed) {
        this.AdmissaoHistMed = AdmissaoHistMed;
    }

    public String getAltaHistMed() {
        return AltaHistMed;
    }

    public void setAltaHistMed(String AltaHistMed) {
        this.AltaHistMed = AltaHistMed;
    }

    public String getMedicacaoHistMed() {
        return MedicacaoHistMed;
    }

    public void setMedicacaoHistMed(String MedicacaoHistMed) {
        this.MedicacaoHistMed = MedicacaoHistMed;
    }

    public String getDescPacHistMed() {
        return DescPacHistMed;
    }

    public void setDescPacHistMed(String DescPacHistMed) {
        this.DescPacHistMed = DescPacHistMed;
    }

    public String getCpfPacHistMed() {
        return CpfPacHistMed;
    }

    public void setCpfPacHistMed(String CpfPacHistMed) {
        this.CpfPacHistMed = CpfPacHistMed;
    }
     
     public void salvar(){           
        String sql = "Insert into HistMedPac(DiagnosticoHistMed, AdmissaoHistMed, AltaHistMed, MedicacaoHistMed, DescPacHistMed, cpfPac) values('" + this.getDiagnosticoHistMed() + 
                                                                                                                                                "','" + this.getAdmissaoHistMed() +
                                                                                                                                                "','" + this.getAltaHistMed() + 
                                                                                                                                                "','" + this.getMedicacaoHistMed() + 
                                                                                                                                                "','"+ this.getDescPacHistMed() +
                                                                                                                                                "','"+ this.getCpfPacHistMed() + "');";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");     
    }
        
     public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;        
        String sql= "Select * from HistMedPac";
        tabela = con.RetornarResultset(sql);
        return tabela;   
    }
     
    public void excluir(){
        String sql;
        sql= "Delete from HistMedPac where cpfPac="+ getCpfPacHistMed();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterar(){
        String sql;
        sql= "Update HistMedPac set  DiagnosticoHistMed='"+this.getDiagnosticoHistMed()+"'   , AdmissaoHistMed= '" + this.getAdmissaoHistMed()+ "' ,  "
                + "AltaHistMed= '" + this.getAltaHistMed() + "'  where MedicacaoHistMed=" + this.getAltaHistMed() + "'  where cpfPac=" + this.getCpfPacHistMed();
        
        
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        
    }
    
    public ResultSet consultarHistMed(){
        ResultSet tabela;
        tabela = null;        
        String sql= "Select * from HistMedPac where cpfPac =" + this.getCpfPacHistMed();
        tabela = con.RetornarResultset(sql);
        return tabela;   
    }
     
    
}

/*cpfPac no bd = CpfPacHistMed em java*/
        
