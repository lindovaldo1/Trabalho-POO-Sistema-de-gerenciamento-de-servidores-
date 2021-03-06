/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Disciplina;
/**
 *
 * @author Lindovaldo
 */
public class DisciplinaDAO {
    
    public void adiciona(Disciplina obj){
        
         String sql = "insert into disciplinas"
                    + " (nome,carga_horaria,periodicidade,curso,criacao,modificacao)"
                    + " values (?,?,?,?,?,?)";
         
        try (Connection connection = new ConnectionFactory().getConnection();
            
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, obj.getNome());
            stmt.setDouble(2, obj.getCargaHoraria());
            stmt.setInt(3, obj.getPeriodicidade());
            stmt.setLong(4, obj.getCurso());
            stmt.setTimestamp (5, java.sql.Timestamp.valueOf(LocalDateTime.now()));
            stmt.setTimestamp (6, java.sql.Timestamp.valueOf(LocalDateTime.now()));
            
            stmt.execute();
            
            System.out.println("Elemento inserido com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro, elemento não adicionado ao banco. RuntimeException");
        } 
        
    }
    
   /* public Disciplina buscaEspecifico(long identificador) {
        
        String sql = "select * "
                   + "from disciplinas "
                   + "where id = ?";
        
        Disciplina obj = new Disciplina();
        
        try (Connection connection = new ConnectionFactory().getConnection(); 
             PreparedStatement ps = connection.prepareStatement(sql)         ){
            
            ps.setLong(1, identificador);

            try (ResultSet rs = ps.executeQuery()) {
                
                while(rs.next()) {

                  Long indice = rs.getLong("id");
                  String nome = rs.getString("nome");
                  double cargaHoraria = rs.getDouble("carga_horaria");
                  int periodicidade = rs.getInt("periodicidade");
                  Long curso = rs.getLong("curso");
                  
                  Timestamp criacaoTimestamp = rs.getTimestamp("criacao");
                  LocalDateTime criacao = criacaoTimestamp.toLocalDateTime();
                  Timestamp modificacaoTimestamp = rs.getTimestamp("criacao");
                  LocalDateTime modificacao= modificacaoTimestamp.toLocalDateTime();

                  obj.setId(indice);
                  obj.setNome(nome);
                  obj.setCargaHoraria(cargaHoraria);
                  obj.setPeriodicidade(periodicidade);
                  obj.setCurso(curso);
                  obj.setDtCriacao(criacao);
                  obj.setDtModificacao(modificacao);
                    
                }
            }
        } catch (SQLException e) {
             throw new RuntimeException("Erro. Dados não retornados do banco. RuntimeException");
        }
        return obj;
    }*/
    
    public Disciplina buscaEspecifico(long identificador) {
        
        String sql = "select * "
                   + "from disciplinas "
                   + "where id = ?";
        
        Disciplina obj = new Disciplina();
        
        try (Connection connection = new ConnectionFactory().getConnection(); 
             PreparedStatement ps = connection.prepareStatement(sql)         ){
            
            ps.setLong(1, identificador);

            try (ResultSet rs = ps.executeQuery()) {
                
                while(rs.next()) {

                  Long indice = rs.getLong("id");
                  String nome = rs.getString("nome");
                  double cargaHoraria = rs.getDouble("carga_horaria");
                  int periodicidade = rs.getInt("periodicidade");
                  Long curso = rs.getLong("curso");
                  
                  Timestamp criacaoTimestamp = rs.getTimestamp("criacao");
                  LocalDateTime criacao = criacaoTimestamp.toLocalDateTime();
                  Timestamp modificacaoTimestamp = rs.getTimestamp("modificacao");
                  LocalDateTime modificacao= modificacaoTimestamp.toLocalDateTime();
                  
                  obj.setId(indice);
                  obj.setNome(nome);
                  obj.setCargaHoraria(cargaHoraria);
                  obj.setPeriodicidade(periodicidade);
                  obj.setCurso(curso);
                  
                  obj.setDtCriacao(criacao);
                  obj.setDtModificacao(modificacao);
                    
                }
            }
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }
        return obj;
    }
    
    public List<Disciplina> lista() {

          String sql = "select * from disciplinas";


          ArrayList<Disciplina> arr = new ArrayList<>();

          try (Connection connection = new ConnectionFactory().getConnection();
                  PreparedStatement stmt = connection.prepareStatement(sql);
                  ResultSet rs = stmt.executeQuery(sql)) {

              while (rs.next()) {
                   
                  Long indice = rs.getLong("id");
                  String nome = rs.getString("nome");
                  double cargaHoraria = rs.getDouble("carga_horaria");
                  int periodicidade = rs.getInt("periodicidade");
                  Long curso = rs.getLong("curso");
                  
                  Timestamp criacaoTimestamp = rs.getTimestamp("criacao");
                  LocalDateTime criacao = criacaoTimestamp.toLocalDateTime();
                  Timestamp modificacaoTimestamp = rs.getTimestamp("modificacao");
                  LocalDateTime modificacao= modificacaoTimestamp.toLocalDateTime();
                  
                  Disciplina obj = new Disciplina();
                  
                  obj.setId(indice);
                  obj.setNome(nome);
                  obj.setCargaHoraria(cargaHoraria);
                  obj.setPeriodicidade(periodicidade);
                  obj.setCurso(curso);
                  
                  obj.setDtCriacao(criacao);
                  obj.setDtModificacao(modificacao);
                  
                  arr.add(obj);

              }
          } catch (SQLException e) {
               throw new RuntimeException("Erro, Arquivos não retornados. RuntimeException");
          }

          return arr;
      }
    
    
    public void remove(long id) {
       String sql = "delete from disciplinas where id = ?";

       try ( Connection connection = new ConnectionFactory().getConnection();  
             PreparedStatement stmt = connection.prepareStatement(sql)) {

           stmt.setLong(1, id);
           stmt.execute();

       } catch (SQLException e) {
           throw new RuntimeException("Erro, elemento não removido do banco. RuntimeException");
       }
    }

    public void altera(Disciplina obj){
        
        String sql = "update disciplinas "
                   + "set nome = ?, "
                   + "carga_horaria = ?,"
                   + "periodicidade = ?,"
                   + "curso = ?,"
                   + "modificacao = ?"
                   + "where id = ?";
        
         try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, obj.getNome());
            stmt.setDouble(2, obj.getCargaHoraria());
            stmt.setInt(3, obj.getPeriodicidade());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(obj.getDtCriacao()));
            stmt.setTimestamp(5, java.sql.Timestamp.valueOf(LocalDateTime.now()));
            stmt.setLong(6, obj.getId());
            
            
            stmt.execute();
            
            System.out.println("Elemento alterado com sucesso.");
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro, elemento não foi alterado. RuntimeException");
        }
    }
    
}
