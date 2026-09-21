import com.voting.repository.Conexao;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        try {

            Connection conexao = Conexao.conectar();

            System.out.println("Banco conectado com sucesso!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao conectar ao banco!");

            e.printStackTrace();
        }
    }
}