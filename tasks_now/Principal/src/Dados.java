import java.sql.ResultSet;
import java.sql.SQLException;

public class Dados {
	public static BD objBD = new BD("JPAPAGAIO", "root","");

	public static boolean Consultar(String sqlPesquisa) {
		if (objBD.conectaBD()) {
			System.out.println("Conectou ao banco de dados!");
			ResultSet objRes = objBD.consulta(sqlPesquisa);
			
			try {
				if (objRes.next()) {
					System.out.println(objRes.getString(1));
				}
			} catch (Exception e ) {
				System.out.println("Deu tudo errado mano, olha só => " + e);
			}
			 
		} else {
			System.out.println("Erro ao conectar ao banco! "  + objBD.mensagem());
		}
		return true;
	}

	public static boolean Inserir(String sqlInsert) {
		
		if (objBD.conectaBD()) {
			try {
				objBD.atualiza(sqlInsert);
				System.out.println("Inserindo o valor");
			} catch(Exception e) {
				System.out.println("Erro => " + e + ", erro classe" + objBD.mensagem());
			}			
		} else {
			System.out.println("Erro ao conectar ao banco => " + objBD.mensagem());
		}
		return true;
		
	}
	
	public static boolean Atualizar(String sqlAtualiza) {
		if (objBD.conectaBD()) {
			try {
				objBD.atualiza(sqlAtualiza);
				System.out.println("Inserindo o valor");
			} catch(Exception e) {
				System.out.println("Erro => " + e + ", erro classe" + objBD.mensagem());
			}			
		} else {
			System.out.println("Erro ao conectar ao banco => " + objBD.mensagem());
		}
		return true;
		
	}
		


	public static boolean Excluir(String sqlExcluir) {
		if (objBD.conectaBD()) {
			try {
				objBD.atualiza(sqlExcluir);
				System.out.println("Inserindo o valor");
			} catch(Exception e) {
				System.out.println("Erro => " + e + ", erro classe" + objBD.mensagem());
			}			
		} else {
			System.out.println("Erro ao conectar ao banco => " + objBD.mensagem());
		}
		return true;
		
	}
	
	public static void main(String[] args)  throws SQLException {
		String sqlPesquisa = "select * from PESSOAS";
		Dados.Consultar(sqlPesquisa);
		
		String sqlInsert = "INSERT INTO PESSOAS(EMAIL, NOME, NASCIMENTO, SENHA) VALUES ('aluno@gmail.com', 'Lisa Sobraia', '19970301', '144')";
		Dados.Inserir(sqlInsert);

		String sqlAtualiza = "update PESSOAS set EMAIL='alunos2@gmail.com', NOME = 'Lisa Sobrano' where SENHA = '144'";
		Dados.Atualizar(sqlAtualiza);
		
		String sqlExcluir = "DELETE FROM PESSOAS WHERE EMAIL = 'alunos2@gmail.com'";
		Dados.Atualizar(sqlExcluir);
		
		System.out.println("FIM");
	}
}
