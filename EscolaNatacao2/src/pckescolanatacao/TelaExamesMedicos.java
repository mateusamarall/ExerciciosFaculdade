/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckescolanatacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class TelaExamesMedicos extends javax.swing.JFrame {
    LinkedList listidoso = new LinkedList();
    LinkedList listcrianca = new LinkedList();
    LinkedList listadulto = new LinkedList();
    LinkedList list = new LinkedList();

    /**
     * Creates new form Consultorio
     */
    public TelaExamesMedicos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidade = new javax.swing.JTextField();
        chamar2 = new javax.swing.JButton();
        chamar1 = new javax.swing.JButton();
        registrarfila = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        chamar4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escola de natação");

        jLabel1.setText("Nome do candidato: ");

        jLabel2.setText("Idade do candidato:");

        chamar2.setText("Lista de adultos");
        chamar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamar2ActionPerformed(evt);
            }
        });

        chamar1.setText("Lista de idosos");
        chamar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamar1ActionPerformed(evt);
            }
        });

        registrarfila.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registrarfila.setText("Registrar");
        registrarfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarfilaActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo do candidato:");

        chamar4.setText("Lista de crianças");
        chamar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamar4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Atender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chamar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(chamar4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chamar2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addComponent(registrarfila)))
                        .addContainerGap(91, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(registrarfila, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chamar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chamar4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chamar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        setSize(new java.awt.Dimension(529, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarfilaActionPerformed
        
        if(txtnome.getText().equals("") || txtsexo.getText().equals("")|| txtidade.getText().equals("") || txtnome.getText()==null || txtsexo.getText()==null || txtidade.getText()==null){
            JOptionPane.showMessageDialog(null, "Por favor adicionar os dados solicitados");
        }
        else{
            Candidato can = new Candidato(txtnome.getText(), txtsexo.getText(),Integer.parseInt(txtidade.getText()));
        
            if(can.getIdade()>=60){
                if(listidoso.isEmpty()){
                    listidoso.addFirst(can);
                }else{
                    listidoso.addLast(can);
                }
                JOptionPane.showMessageDialog(null, "idoso encaminhado para a fila  ");
        }
        else if(can.getIdade()<18){
            if(listcrianca.isEmpty()){
                listcrianca.addFirst(can);
            }
            else{
                listcrianca.addLast(can);
            }
            JOptionPane.showMessageDialog(null, "criança encaminhada para a fila");
        }
        else{
            if(listadulto.isEmpty()){
                listadulto.addFirst(can);
            } 
            else{
                listadulto.addLast(can);
            }
            JOptionPane.showMessageDialog(null, "adulto encaminhado para a fila");
        }
        }
    }//GEN-LAST:event_registrarfilaActionPerformed
    private void chamar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamar1ActionPerformed
        // TODO add your handling code here:
        if(!listidoso.isEmpty()){
            
            Object[] todoscandidatos = listidoso.toArray();
            for(int i=0; i<todoscandidatos.length; i++){
                if(todoscandidatos[i] instanceof Candidato ){
                    Candidato can = (Candidato) todoscandidatos[i];
                    if(can.getIdade()>=60){
                    JOptionPane.showMessageDialog(null, can.toString());
                    System.out.println(can.toString());
                    }
                    
                }
            }
       }
        else{
            JOptionPane.showMessageDialog(null, "A fila de idoso esta vazia");
        }
    }//GEN-LAST:event_chamar1ActionPerformed
    private void chamar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamar4ActionPerformed
        // TODO add your handling code here:
        if(!listcrianca.isEmpty()){
            
            Object[] todoscandidatos = listcrianca.toArray();
            for(int i=0; i<todoscandidatos.length; i++){
                if(todoscandidatos[i] instanceof Candidato ){
                    Candidato can = (Candidato) todoscandidatos[i];
                    if(can.getIdade()<=17){
                    JOptionPane.showMessageDialog(null, can.toString());
                    System.out.println(can.toString());
                    }
                    
                }
            }
       }
        else{
            JOptionPane.showMessageDialog(null, "A fila de criança esta vazia");
        }
    }//GEN-LAST:event_chamar4ActionPerformed

    private void chamar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamar2ActionPerformed
        // TODO add your handling code here:
        if(!(listadulto.isEmpty())){
            
            Object[] todoscandidatos = listadulto.toArray();
            for(int i=0; i<todoscandidatos.length; i++){
                if(todoscandidatos[i] instanceof Candidato ){
                    Candidato can = (Candidato) todoscandidatos[i];
                    if(can.getIdade()<60 && can.getIdade()>17){
                    JOptionPane.showMessageDialog(null, can.toString());
                    System.out.println(can.toString());
                    }
                    
                }
            }
       }
        else{
            JOptionPane.showMessageDialog(null, "A fila de adulto esta vazia");
        }
    }//GEN-LAST:event_chamar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     if(!listidoso.isEmpty()){
            Candidato can = (Candidato) listidoso.removeFirst();
            JOptionPane.showMessageDialog(null, "Idoso atendido. dados: " + can.toString());
        }
        else if(listadulto.isEmpty() && listcrianca.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há ninguém na fila !");
        }
        else if(listadulto.isEmpty() && !listcrianca.isEmpty()){
            Candidato can = (Candidato) listcrianca.removeFirst();
            
            JOptionPane.showMessageDialog(null, "Criança atendida. dados: "+ can.toString());
        }
        else if(!listadulto.isEmpty() && listcrianca.isEmpty()){
            Candidato can = (Candidato) listadulto.removeFirst();
            
            JOptionPane.showMessageDialog(null, "Adulto atendido. dados: "+ can.toString());
        }
        else{
            if(!listadulto.isEmpty()){
                Candidato can = (Candidato) listadulto.removeFirst();
                JOptionPane.showMessageDialog(null, "Adulto atendido: "+ can.toString());
               
            }
            else{
                Candidato can = (Candidato) listcrianca.removeFirst();
                JOptionPane.showMessageDialog(null, "Criança atendida: "+ can.toString());
                
            }
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExamesMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExamesMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chamar1;
    private javax.swing.JButton chamar2;
    private javax.swing.JButton chamar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registrarfila;
    private javax.swing.JTextField txtidade;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}