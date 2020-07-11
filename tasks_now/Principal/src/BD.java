import java.sql.*;


public class BD{
	   
    private Connection con;
	private Statement stmt;
	private boolean erro;
	private String msg;
	private String banco, usuario, senha;
	private Class<?> forName;

      /* Metodo Construtor: inicializa alguns atributos do objeto
         Parametros: b-nome do banco de dados / u-nome o usuario / s-senha 
      */   
      public BD(String b, String u, String s){
		 this.banco="jdbc:mysql://localhost/JPAPAGAIO"; // + "" b;
		 this.usuario= "root"; //u;
		 this.senha= ""; //s;
		 erro=false;
		 msg="";
	 }
       /* Metodo conectaBD: realiza a conexao com o banco de dados
          Retorno: TRUE-conexao realizada / FALSE-falha na conexao 
       */ 
	 public boolean conectaBD(){
		 this.erro=false;
	       try {
		 	
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      con = DriverManager.getConnection(this.banco, this.usuario, this.senha);
		      stmt=con.createStatement();
		     }catch (SQLException e){this.erro=true;
		      	System.out.println(e);
			  this.msg="Falha na conexao com o banco de dados!"; 
			}
		      catch (java.lang.Exception e){this.erro=true;
		      	System.out.println(e);
			     this.msg="Erro no driver de conexao!"; 
			}
		return !erro;      
	}
      /* Metodo: consulta
         Parametro: c-comando SQL de consulta (SELECT)
         Retorno: objeto ResultSet com o resultado da consulta
      */ 
	public ResultSet consulta (String c){
		ResultSet res=null;
		this.erro=false;
		this.msg="Sucesso na execucao da consulta!";
		try{
			res=stmt.executeQuery(c);
		}catch (SQLException e){this.erro=true;
		      this.msg="Falha na execucao da consulta!";
		 }
		return res;
	}
      /* Metodo: atualiza
         Parametro: c-comando SQL de atualizado (INSERT, UPDATE, DELETE)
         Retorno: TRUE-comando executado com sucesso / FALSE-falha na execao
      */ 
	public boolean atualiza(String c){
		int i=-1;
		this.erro=false;
		this.msg="Operacao realizada com sucesso!";
		try{
			i=stmt.executeUpdate(c);
		}catch (SQLException e){this.erro=true; 
			this.msg="Falha na operaao!";
             }
		return !erro;
	}
      /* Metodo desconecta: fecha a conexao com o banco de dados
         Retorno: TRUE-desconexao realizada / FALSE-falha na desconexao
      */ 
	public boolean desconecta(){
		boolean sucesso=true;
		try{
			stmt.close();
			con.close();
		}catch(SQLException e){sucesso=false;}
		return sucesso;
	}
      /* Metodo ocorreuErro: retorna o valor do atributo erro
         Retorno: TRUE-ocorreu um erro durante uma operacao 
                  FALSE-nao ocorreu nenhum erro 
      */ 
	public boolean ocorreuErro(){
		return this.erro;
	}
       /* Metodo mensagem: retorna o valor do atributo mensagem
          Retorno: Mensagem sobre um possavel erro que possa ter ocorrido 
                    durante a realizacao de uma operacao
       */ 
	public String mensagem(){
		return this.msg;
	}
}
