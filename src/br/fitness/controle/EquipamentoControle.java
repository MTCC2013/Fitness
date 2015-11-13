/*--------------------------- Softness ---------------------------------------
 Rotina: Classes
 Descrição: Classe Equipamento Controle
 Fonte: EquipamentoControle.java
 @utor: Mayara Oliveira
 Observação: 
 ---------------------------- Alteração ---------------------------------------
 Data     Autor          Descrição
 -------- -------------- ------------------------------------------------------
 ------------------------------------------------------------------------------*/
//Pacotes
package br.fitness.controle;

import br.fitness.classes.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipamentoControle {

    public void delete(Equipamento equipamento) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from equipamento where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, equipamento.getEqp_codigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(Equipamento equipamento) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into equipamento (codigo, descricao, datafabricacao, marca, modelo, fornecedor, tipo, observacoes) "
                    + "values(?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, equipamento.getEqp_codigo());
            ps.setString(2, equipamento.getEqp_descricao());
            ps.setString(3, equipamento.getEqp_marca());
            ps.setString(4, equipamento.getEqp_modelo());
            ps.setInt(5, equipamento.getUsu_codigo());
            ps.setInt(6, equipamento.getEqp_tipo());
            ps.setString(2, equipamento.getEqp_obs());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Equipamento equipamento) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update equipamento set codigo = ?, descricao = ?, datafabricacao = ?, marca = ?, modelo = ?, fornecedor = ?, tipo = ?, "
                    + "observacoes = ? where codigo = ?";                                                                                         
            ps = conn.prepareStatement(sql);
            ps.setInt(1, equipamento.getEqp_codigo());
            ps.setString(2, equipamento.getEqp_descricao());
            ps.setString(3, equipamento.getEqp_marca());
            ps.setString(4, equipamento.getEqp_modelo());
            ps.setInt(5, equipamento.getUsu_codigo());
            ps.setInt(6, equipamento.getEqp_tipo());
            ps.setString(2, equipamento.getEqp_obs());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public List<Equipamento> getAll() {
        List<Equipamento> lista = new ArrayList<Equipamento>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, descricao, datafabricacao, marca, modelo, fornecedor, tipo, observacoes from equipamento";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String descricao = rs.getString(2);
                Date datafabricacao = rs.getDate(3);
                String marca = rs.getString(4);
                String modelo = rs.getString(5);
                Integer fornecedor = rs.getInt(6);
                String tipo = rs.getString(7);
                String observacao = rs.getString(8);
                
                
                Equipamento e = new Equipamento();
                e.setEqp_codigo(codigo);
                e.setEqp_descricao(descricao);
                e.setEqp_dtfabricacao(datafabricacao);
                e.setEqp_marca(marca);
                e.setEqp_modelo(modelo);
                int for_codigo = 0;
                e.setFor_codigo(for_codigo);
                 int eqp_tipo = 0;
                e.setEqp_tipo(eqp_tipo);
                e.setEqp_obs(tipo);
                
           
                
               
              
                lista.add(e);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public Equipamento getEquipamento(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, descricao, datafabricacao, marca, modelo, fornecedor, tipo, observacoes from equipamento where codigo = ?";
            
            //pesquisa
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
     
            //resultado 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt(1);
                String descricao = rs.getString(2);
                Date datafabricacao = rs.getDate(3);
                String marca = rs.getString(4);
                String modelo = rs.getString(5);
                Integer fornecedor = rs.getInt(6);
                String tipo = rs.getString(7);
                String observacoes = rs.getString(8);
                
                
                Equipamento e = new Equipamento();
                e.setEqp_codigo(cod);
                e.setEqp_descricao(descricao);
                e.setEqp_dtfabricacao(datafabricacao);
                e.setEqp_marca(marca);
                e.setEqp_modelo(modelo);
                                                             
              
                return e;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

}
