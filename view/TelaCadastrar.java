/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import CodigoFonte.hqs;
import CodigoFonte.UsuarioDAO;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TelaCadastrar extends javax.swing.JInternalFrame {
    UsuarioDAO usuarioDAO;
    private hqs hqs;
    

    public TelaCadastrar(UsuarioDAO usuarioDAO) {
        initComponents();
        this.usuarioDAO = usuarioDAO; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        radioSexo = new javax.swing.ButtonGroup();
        txtEdicao1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblSexp = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblSexp1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        lblSexp2 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        lblcapa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtfilename = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jTextField1.setText("jTextField1");

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(672, 336));

        lblNome.setBackground(new java.awt.Color(0, 0, 0));
        lblNome.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(102, 102, 102));
        lblNome.setText("Titulo ");

        txtTitulo.setBackground(new java.awt.Color(226, 226, 226));
        txtTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 226, 226), 2, true));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblIdade.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(102, 102, 102));
        lblIdade.setText("Editora");

        txtEditora.setBackground(new java.awt.Color(226, 226, 226));
        txtEditora.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtEditora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 226, 226), 2, true));
        txtEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditoraActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(102, 102, 102));
        lblCPF.setText("Autor");

        lblSexp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSexp.setForeground(new java.awt.Color(102, 102, 102));
        lblSexp.setText("Paginas");

        btnSalvar.setBackground(new java.awt.Color(51, 204, 255));
        btnSalvar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Cadastrar");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblSexp1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSexp1.setForeground(new java.awt.Color(102, 102, 102));
        lblSexp1.setText("Volume");

        txtAutor.setBackground(new java.awt.Color(226, 226, 226));
        txtAutor.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtAutor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 226, 226), 2, true));
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        txtPaginas.setBackground(new java.awt.Color(226, 226, 226));
        txtPaginas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtPaginas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 226, 226), 2, true));
        txtPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaginasActionPerformed(evt);
            }
        });

        lblSexp2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSexp2.setForeground(new java.awt.Color(102, 102, 102));
        lblSexp2.setText("Genero");

        txtVolume.setBackground(new java.awt.Color(226, 226, 226));
        txtVolume.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtVolume.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 226, 226), 2, true));
        txtVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolumeActionPerformed(evt);
            }
        });

        txtGenero.setBackground(new java.awt.Color(226, 226, 226));
        txtGenero.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtGenero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 226, 226), 2, true));
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        lblcapa.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcapa.setForeground(new java.awt.Color(102, 102, 102));
        lblcapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcapa.setText("Capa");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar Capa");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtfilename.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtfilename.setForeground(new java.awt.Color(255, 255, 255));
        txtfilename.setBorder(null);
        txtfilename.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfilename.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtfilename.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtfilename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilenameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(txtfilename))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblIdade)
                                    .addComponent(lblSexp))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtEditora)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(lblSexp1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVolume, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSexp2)
                                .addGap(18, 18, 18)
                                .addComponent(txtGenero)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(lblcapa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdade)
                            .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPF))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexp)
                            .addComponent(lblSexp1)
                            .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexp2)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblcapa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfilename, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 660, 365);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        String titulo = txtTitulo.getText();
        String editora  = txtEditora.getText();
        String autor = txtAutor.getText();
        int paginas =Integer.parseInt(txtPaginas.getText());
        int volume = Integer.parseInt(txtVolume.getText());
        String genero = txtGenero.getText();
        String capa = txtfilename.getText();
        
        hqs = new hqs(titulo,editora,autor,paginas,volume,genero,capa);
        usuarioDAO.inserir(hqs);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        this.limpaCampos();

        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginasActionPerformed

    private void txtEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditoraActionPerformed

    private void txtVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolumeActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtfilename.setText(filename);
        ImageIcon icon = new ImageIcon(filename);
        lblcapa.setIcon(icon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfilenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilenameActionPerformed

    public void limpaCampos(){
        txtTitulo.setText("");
        txtEditora.setText("");
        txtAutor.setText("");
        txtPaginas.setText("");
        txtVolume.setText("");
        txtGenero.setText("");
        txtfilename.setText("");
        lblcapa.setIcon(null);
    }
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexp;
    private javax.swing.JLabel lblSexp1;
    private javax.swing.JLabel lblSexp2;
    private javax.swing.JLabel lblcapa;
    private javax.swing.ButtonGroup radioSexo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicao1;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVolume;
    private javax.swing.JTextField txtfilename;
    // End of variables declaration//GEN-END:variables

    public hqs getUsuario() {
        return hqs;
    }

    public void setUsuario(hqs usuario) {
        this.hqs = usuario;
    }
}
