    package Modelagem;

import Controle.Conexao;
import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Clinica {
    private int id;
    private String CNPJ;
    private String RazaoSocial;
    private String NomeFantasia;
    private String Telefone;
    private String Endereco;
    private String Cidade;
    private String Estado;
    private String Email;
    private String Senha;
    
    //Conexao con = new Conexao();
    
    public Clinica() {
        this(0,"","","","","","","","","");
    }

    public Clinica(int id, String CNPJ, String RazaoSocial, String NomeFantasia, String Telefone, String Endereco, String Cidade, String Estado, String Email, String Senha) {
        this.id = id;
        this.CNPJ = CNPJ;
        this.RazaoSocial = RazaoSocial;
        this.NomeFantasia = NomeFantasia;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Email = Email;
        this.Senha = Senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public void cadastrar(){
        String sql =  "INSERT INTO Clinica(CNPJ, RazaoSocial, NomeFantasia, Telefone, Endereco, Cidade, Estado, Email, Senha) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try{
            //Criar conexão com o banco de dados
            conn =  ConnectionFactory.createConnectionToMySQL();
            
            //Criação de uma PreparedStatement para executar  a query
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, this.getCNPJ());
            pstmt.setString(2, this.getRazaoSocial());
            pstmt.setString(3, this.getNomeFantasia());
            pstmt.setString(4, this.getTelefone());
            pstmt.setString(5, this.getEndereco());
            pstmt.setString(6, this.getCidade());
            pstmt.setString(7, this.getEstado());
            pstmt.setString(8, this.getEmail());
            pstmt.setString(9, this.getSenha());
            
            //Executar a query
            pstmt.execute();
            
            try{
                String sqlId = "SELECT id FROM Clinica WHERE Clinica.CNPJ = ?";
                
                ResultSet rs = null;
                
                pstmt = (PreparedStatement) conn.prepareStatement(sqlId);
                pstmt.setString(1, this.getCNPJ());
                
                rs = pstmt.executeQuery();
               
                rs.first();
                this.setId(rs.getInt("id"));
                
                JOptionPane.showMessageDialog(null, "Realizado cadastro com sucesso!");
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar capturar id: " + erro);
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados: " + erro);
        }finally{
            //Fechar as conexões
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar encerrar as conexões: " + erro);
            }
        }
    }
    
    public void alterar(Clinica clinica){
        String sql = "UPDATE Clinica SET CNPJ = ?, RazaoSocial = ?, NomeFantasia = ?, Telefone = ?, Endereco = ?, Cidade = ?, Estado = ?, Email = ? " +
                     "WHERE id = ? ;";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try{
            //Criar conexão com o banco de dados
            conn =  ConnectionFactory.createConnectionToMySQL();
            
            //Criação de uma PreparedStatement para executar  a query
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, clinica.getCNPJ());
            pstmt.setString(2, clinica.getRazaoSocial());
            pstmt.setString(3, clinica.getNomeFantasia());
            pstmt.setString(4, clinica.getTelefone());
            pstmt.setString(5, clinica.getEndereco());
            pstmt.setString(6, clinica.getCidade());
            pstmt.setString(7, clinica.getEstado());
            pstmt.setString(8, clinica.getEmail());
            
            //id da clinica que será atualizada
            pstmt.setInt(9, clinica.getId());
            
            //Executar a query
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tenta alterar os dados: " + erro);
        }finally{
            
            
            //Fechar as conexões
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar encerrar as conexões: " + erro);
            }
        }
    }
    
    public Clinica getClinica(String cnpj){
        String sql = "SELECT * FROM Clinica WHERE Clinica.CNPJ = ?";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        //Classe que vai recuperar os dados do BD
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, cnpj);
            
            rs = pstmt.executeQuery();
            Clinica clinica = new Clinica();
            
            rs.first();
            clinica.setId(rs.getInt("id"));
            clinica.setCNPJ(rs.getString("CNPJ"));
            clinica.setRazaoSocial(rs.getString("RazaoSocial"));
            clinica.setNomeFantasia(rs.getString("NomeFantasia"));
            clinica.setTelefone(rs.getString("Telefone"));
            clinica.setEndereco(rs.getString("Endereco"));
            clinica.setCidade(rs.getString("Cidade"));
            clinica.setEstado(rs.getString("Estado"));
            clinica.setEmail(rs.getString("Email"));
            
            return clinica;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os dados cadastrais: " + erro);
        }finally{
            //Fechar as conexões
            try{
                if(rs!=null){
                    rs.close();
                }
                if(pstmt!=null){
                    pstmt.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar encerrar as conexões: " + erro);
            }
        }
        return null;
    }
    
    
    /*public List<Clinica> getClinica(int id){
        String sql = "SELECT * FROM Clinica id = ?";
        List<Clinica> clinicaDadosCadastrais = new ArrayList<Clinica>();
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        //Classe que vai recuperar os dados do BD
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            rs = pstmt.executeQuery();
            Clinica clinica = new Clinica();
            
            clinica.setId(id);
            clinica.setCNPJ(rs.getString("CNPJ"));
            clinica.setRazaoSocial(rs.getString("RazaoSocial"));
            clinica.setNomeFantasia(rs.getString("NomeFantasia"));
            clinica.setTelefone(rs.getString("Telefone"));
            clinica.setEndereco(rs.getString("Endereco"));
            clinica.setCidade(rs.getString("Cidade"));
            clinica.setEstado(rs.getString("Estado"));
            clinica.setEmail(rs.getString("Email"));
            
            clinicaDadosCadastrais.add(clinica);
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os dados cadastrais: " + erro);
        }finally{
            //Fechar as conexões
            try{
                if(rs!=null){
                    rs.close();
                }
                if(pstmt!=null){
                    pstmt.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao tentar encerrar as conexões: " + erro);
            }
        }
        
        return clinicaDadosCadastrais;
    }*/
    /*
    public void cadastrarClinica(){
        String sql = "INSERT INTO Clinica(CNPJ, RazaoSocial, NomeFantasia, Telefone, Endereco, Cidade, Estado, Email, Senha) values('" + this.getCNPJ() +
                                                                                                                                      "','" + this.getRazaoSocial() +
                                                                                                                                      "','" + this.getNomeFantasia() +
                                                                                                                                      "'," + this.getTelefone() +
                                                                                                                                      ",'" + this.getEndereco() +
                                                                                                                                      "','" + this.getCidade() +
                                                                                                                                      "','" + this.getEstado() +
                                                                                                                                      "','" + this.getEmail() +
                                                                                                                                      "','" + this.getSenha() + "');";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet consultarClinica(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Clinica";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
    public ResultSet getClinica(String cnpj){
        String sql = "SELECT * FROM Clinica WHERE CNPJ = '" + cnpj + "';";
        
        try{
            ResultSet tabela;
            tabela = null;
            tabela = con.RetornarResultset(sql);
            return tabela;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Erro na requisição de dados: " + erro);
            return null;
        }
        
        /*try{
            ResultSet tabela = this.con.RetornarResultset(sql);
            Clinica clinica = new Clinica();
            tabela.first();
            clinica.setCNPJ(cnpj);
            clinica.setRazaoSocial(tabela.getString("RazaoSocial"));
            clinica.setNomeFantasia(tabela.getString("NomeFantasia"));
            clinica.setTelefone(tabela.getString("Telefone"));
            clinica.setEndereco(tabela.getString("Endereco"));
            clinica.setCidade(tabela.getString("Cidade"));
            clinica.setEstado(tabela.getString("Estado"));
            clinica.setEmail(tabela.getString("Email"));
            return clinica;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro na requisição de dados: " + erro);
            return null;
        }
            
    }*/
}
