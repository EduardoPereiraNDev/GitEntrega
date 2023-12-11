package br.org.sesisp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;



import br.org.sesisp.controller.Conexao;
import br.org.sesisp.model.Aluno;

public class CrudDAO  {

		public void create(Aluno aluno) {
			String sql = "INSERT INTO alunos(nome, idade) VALUES(?, ?)";
			Connection conn = null;
			PreparedStatement p =null;
			try {
				conn= Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);
				p.setString(1, aluno.getNome());
				p.setInt(2, aluno.getIdade());
				p.execute();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		public void update(Aluno aluno) {
			
			String sql = "Update alunos Set nome = ?, idade = ?, WHERE ra= ?";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);
				p.setString(1, aluno.getNome());
				p.setInt(2, aluno.getIdade());
				p.setInt(3, aluno.getRa());
				p.execute();
				JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
				System.out.println("Dados atualizados com sucesso!!");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		public List<Aluno> read() {
			List <Aluno> alunos = new ArrayList <Aluno>();
			String sql = "SELECT * FROM alunos";
			Connection conn = null;
			PreparedStatement p = null;
			ResultSet resultado = null;
			try {
				conn= Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);
				resultado = p.executeQuery();
				while(resultado.next()) {
					Aluno ver_aluno = new Aluno();
					ver_aluno.setRa(resultado.getInt("ra"));
					ver_aluno.setNome(resultado.getString("nome"));
					ver_aluno.setIdade(resultado.getInt("idade"));
					alunos.add(ver_aluno);
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return alunos;
		}
		public boolean delete(int ra) {
			String sql ="DELETE FROM alunos where ra = ?";
			Connection conn = null;
			PreparedStatement p= null;
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);
				p.setInt(1, ra);
				p.execute();
				JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
				System.out.println("Dados excluidos com sucesso!");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO:"+ e);
				}finally {
					try {
						if(p != null);
						p.close();
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			return false;
		}
}
