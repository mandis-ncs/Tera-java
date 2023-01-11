package Modelagem;

import Controle.Conexao;
import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Monitor {
    private int id;
    private String CPF;
    private String Nome;
    private String Sobrenome;
    private String Login;
    private String Celular;
    private String Telefone;
    private String Email;
    private String Senha;
    
    //Conexao con = new Conexao();
    
    public Monitor() {
        this(0,"","","","","","","","");
    }

    public Monitor(int id, String CPF, String Nome, String Sobrenome, String Login, String Celular, String Telefone, String Email, String Senha) {
        this.id = id;
        this.CPF = CPF;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Login = Login;
        this.Celular = Celular;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Senha = Senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
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
        String sql =  "INSERT INTO Monitor(CPF, Nome, Sobrenome, Login, Celular, Telefone, Email, Senha) values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try{
            //Criar conexão com o banco de dados
            conn =  ConnectionFactory.createConnectionToMySQL();
            
            //Criação de uma PreparedStatement para executar  a query
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, this.getCPF());
            pstmt.setString(2, this.getNome());
            pstmt.setString(3, this.getSobrenome());
            pstmt.setString(4, this.getLogin());
            pstmt.setString(5, this.getCelular());
            pstmt.setString(6, this.getTelefone());
            pstmt.setString(7, this.getEmail());
            pstmt.setString(8, this.getSenha());
            
            //Executar a query
            pstmt.execute();
            
            try{
                String sqlId = "SELECT id FROM Monitor WHERE Monitor.CPF = ?";
                
                ResultSet rs = null;
                
                pstmt = (PreparedStatement) conn.prepareStatement(sqlId);
                pstmt.setString(1, this.getCPF());
                
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
    
    public void alterar(Monitor monitor){
        String sql = "UPDATE Monitor SET CPF = ?, Nome = ?, Sobrenome = ?, Telefone = ?, Celular = ?, Login = ?, Email = ? " +
                     "WHERE id = ? ;";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try{
            //Criar conexão com o banco de dados
            conn =  ConnectionFactory.createConnectionToMySQL();
            
            //Criação de uma PreparedStatement para executar  a query
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, monitor.getCPF());
            pstmt.setString(2, monitor.getNome());
            pstmt.setString(3, monitor.getSobrenome());
            pstmt.setString(4, monitor.getTelefone());
            pstmt.setString(5, monitor.getCelular());
            pstmt.setString(6, monitor.getLogin());
            pstmt.setString(7, monitor.getEmail());
            
            //id da monitor que será atualizada
            pstmt.setInt(8, monitor.getId());
            
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
    
    public void excluir(int id){
        String sql = "DELETE FROM Monitor WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try{
            conn =  ConnectionFactory.createConnectionToMySQL();
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            pstmt.execute();
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados do monitor: " + erro);
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
    
    public Monitor getMonitor(String CPF){
        String sql = "SELECT * FROM Monitor WHERE Monitor.CPF = ?";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        //Classe que vai recuperar os dados do BD
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, CPF);
            
            rs = pstmt.executeQuery();
            Monitor monitor = new Monitor();
            
            rs.first();
            monitor.setId(rs.getInt("id"));
            monitor.setCPF(rs.getString("CPF"));
            monitor.setNome(rs.getString("Nome"));
            monitor.setSobrenome(rs.getString("Sobrenome"));
            monitor.setTelefone(rs.getString("Telefone"));
            monitor.setCelular(rs.getString("Celular"));
            monitor.setLogin(rs.getString("Login"));
            monitor.setEmail(rs.getString("Email"));
            
            return monitor;
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
    
    public List<Monitor> getMonitores(){
        String sql = "SELECT * FROM Monitor";
        List<Monitor> monitorDadosCadastrais = new ArrayList<Monitor>();
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        //Classe que vai recuperar os dados do BD
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            //Enquento houver registros, irá percorrer o array
            while(rs.next()){
                Monitor monitor = new Monitor();
                
                monitor.setId(rs.getInt("id"));
                monitor.setCPF(rs.getString("CPF"));
                monitor.setNome(rs.getString("Nome"));
                monitor.setSobrenome(rs.getString("Sobrenome"));
                monitor.setTelefone(rs.getString("Telefone"));
                monitor.setCelular(rs.getString("Celular"));
                monitor.setLogin(rs.getString("Login"));
                monitor.setEmail(rs.getString("Email"));
            
                monitorDadosCadastrais.add(monitor);
            }
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
        
        return monitorDadosCadastrais;
    }
    
    
    /*public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Monitor";
        tabela = conn.RetornarResultset(sql);
        return tabela;
    }*/
    
    /*
    public void cadastrarUsuario(){
        String sql = "INSERT INTO Usuario(CPF, Nome, Sobrenome, Login, Celular, Telefone, Email, Senha) values('" + this.getCPF() +
                                                                                                                "','" + this.getNome() +
                                                                                                                "','" + this.getSobrenome() +
                                                                                                                "','" + this.getLogin() +
                                                                                                                "'," + this.getCelular() +
                                                                                                                "," + this.getTelefone() +
                                                                                                                ",'" + this.getEmail() +
                                                                                                                "','" + this.getSenha() + "');";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet consultarUsuario(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Usuario";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }*/
    
}
