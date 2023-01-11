package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url= "jdbc:mysql://127.0.0.1/bancoDeDadosTera?useUnicode=true&amp;characterEncoding=UTF-8";
    private static final String usuario="root";
    private static final String senha="";
    
    //Conexao com o banco de dados
    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName(driver);
     
        Connection connection = DriverManager.getConnection(url, usuario, senha);
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        //Recuperar uma conexão com o banco de dados
        Connection conn = createConnectionToMySQL();
        
        //testar se a conexão é nula
        if(conn!=null){
            JOptionPane.showMessageDialog(null, "Conexão obtida com sucesso!");
            conn.close();
        }
    }
}
