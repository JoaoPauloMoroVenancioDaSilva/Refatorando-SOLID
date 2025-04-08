package DSOLID.Exemplo1;

public class UsuarioDAO {
    private SQLConnection sqlConnection;

    public UsuarioDAO(SQLConnection sqlConnection) {
        this.sqlConnection = sqlConnection;
    }

    public void salvarUsuario(String nome) {
        sqlConnection.connect();
        System.out.println("Salvando usuário: " + nome);
    }
}
