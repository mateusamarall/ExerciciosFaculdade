/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;


import Model.DAO.GeneroDAO;
import Model.Genero;
import Model.cdsModel;
import bdConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateus
 */
public class LojaInterface extends javax.swing.JFrame {

    /**
     * Creates new form LojaInterface
     */
    public LojaInterface() {
        initComponents();
     indexJtable();
    }
    public void indexJtable(){
       DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
       modelo.setRowCount(0);
       GeneroDAO gendao = new GeneroDAO();
       for(Genero g: gendao.index()){
           modelo.addRow(new Object[]{
               g.getGenero(),
           });
       }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacds = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 900));
        setMinimumSize(new java.awt.Dimension(900, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        tabelacds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "codigo", "titulo", "interprete", "genero", "preço"
            }
        ));
        jScrollPane1.setViewportView(tabelacds);
        tabelacds.setVisible(false);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 310, 452, 160);

        jPanel1.setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("clássico");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(141, 28, 90, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("mpb");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(159, 54, 60, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("pop");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(161, 80, 43, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("rock");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(160, 110, 45, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("salsa");
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(155, 132, 49, 23);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("sertanejo");
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(133, 158, 71, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 241, 221);

        btnmostrar.setText("MOSTRAR");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrar);
        btnmostrar.setBounds(50, 40, 150, 40);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Genero"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(380, 40, 460, 220);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

     
   
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        tabelacds.setVisible(true);
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<cdsModel>  Cd = new ArrayList<>();
                String filtro="";
        if(jRadioButton1.isSelected()){
            filtro =" WHERE genero ='clássico'";
        }
        if(jRadioButton2.isSelected()){
            filtro =" WHERE genero ='mpb'";
        }
        if(jRadioButton3.isSelected()){
            filtro =" where genero ='pop'";
        }
        if(jRadioButton4.isSelected()){
            filtro =" where genero='rock'";
        }
        if(jRadioButton5.isSelected()){
            filtro =" where genero ='salsa'";
        }
        if(jRadioButton6.isSelected()){
            filtro =" where genero='sertanejo'";         
        }
    try {
        stmt=con.prepareStatement("SELECT * FROM cds" +filtro);
        rs = stmt.executeQuery();
        Object dados[] =new Object[5];
         while(rs.next()){
                    int cod = rs.getInt("codigo");
                    String title = rs.getString("titulo");
                   String inter = rs.getString("interprete");
                    String gener = rs.getString("genero");
                    int price = rs.getInt("preco");
                    
                    dados[0] = cod;
                    dados[1]=title;
                    dados[2]=inter;
                    dados[3]=gener;
                    dados[4]=price;
                    
                   
                    DefaultTableModel modelo = (DefaultTableModel) tabelacds.getModel();
                 
                    modelo.addRow(dados);
   
                    
            }
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "erro ao salvar" + ex);
    }finally{
        conexao.closeConnection(con, stmt, rs);
    }
    }//GEN-LAST:event_btnmostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LojaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelacds;
    // End of variables declaration//GEN-END:variables
}