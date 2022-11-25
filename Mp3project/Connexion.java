package connect;
import java.sql.*;
public class Connexion{
    String user;
    String password;
    Connection connection;

    public String getUser(){return this.user;}
    public String getPassword(){return this.password;}
    public Connection getConnection(){return this.connection;}

    public void setUser(String a){this.user=a;}
    public void setPassword(String a){this.password=a;}
    public void setConnection(Connection c){this.connection=c; 
    }

    public Connexion(String a,String b){

    }

}