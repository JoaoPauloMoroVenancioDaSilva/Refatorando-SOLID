package DSOLID.Exemplo1;

public class PostgreSQLConnection implements SQLConnection {
    @Override
    public void connect() {
        System.out.println("Conectado ao PostgreSQL");
    }
}