package Forms;

import Classes.Cliente;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import java.net.*;
import javax.swing.JFileChooser;

public class frmFileTransformer extends javax.swing.JFrame {

    public frmFileTransformer() {
        initComponents();
        CentralizarFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        tbrStatus = new javax.swing.JToolBar();
        lblStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        btnSelecionararquivo = new javax.swing.JButton();
        txtArquivo = new javax.swing.JTextField();
        lblArquivo = new javax.swing.JLabel();
        lblEnviarArquivo = new javax.swing.JLabel();
        txtPortaHost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIPHost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnDiretorio = new javax.swing.JButton();
        txtDiretorio = new javax.swing.JTextField();
        lblReceberArquivosEm = new javax.swing.JLabel();
        lblInforma = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblProntoReceber = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":: File Transporter ::");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        tbrStatus.setRollover(true);
        tbrStatus.setEnabled(false);

        lblStatus.setText("Servidor desligado");
        tbrStatus.add(lblStatus);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setEnabled(false);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnSelecionararquivo.setText("Selecionar");
        btnSelecionararquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionararquivoActionPerformed(evt);
            }
        });

        lblArquivo.setText("Arquivo");

        lblEnviarArquivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEnviarArquivo.setText("Enviar arquivo");

        txtPortaHost.setText("8080");

        jLabel3.setText("Porta");

        txtIPHost.setText("127.0.0.1");
        txtIPHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPHostActionPerformed(evt);
            }
        });

        jLabel2.setText("IP");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Conectar ao host:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIPHost, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPortaHost, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSelecionararquivo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnviar))
                            .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblEnviarArquivo))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnviarArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArquivo)
                            .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnviar)
                            .addComponent(btnSelecionararquivo))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIPHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPortaHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Porta");

        txtPorta.setText("8080");

        btnOk.setText("Ativar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnDiretorio.setText("Alterar");
        btnDiretorio.setEnabled(false);
        btnDiretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiretorioActionPerformed(evt);
            }
        });

        txtDiretorio.setText("C:\\FileTranporter\\");
            txtDiretorio.setEnabled(false);
            txtDiretorio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtDiretorioActionPerformed(evt);
                }
            });
            txtDiretorio.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    txtDiretorioFocusLost(evt);
                }
            });

            lblReceberArquivosEm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            lblReceberArquivosEm.setText("Receber arquivos em:");
            lblReceberArquivosEm.setEnabled(false);

            lblInforma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            lblInforma.setText("Desconectado");

            jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

            lblProntoReceber.setText("Você não pode receber arquivos");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblReceberArquivosEm)
                            .addGap(9, 9, 9)
                            .addComponent(btnDiretorio))
                        .addComponent(txtDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOk))
                        .addComponent(lblInforma, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblProntoReceber, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOk))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblInforma)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblProntoReceber)
                    .addGap(24, 24, 24))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblReceberArquivosEm)
                        .addComponent(btnDiretorio))
                    .addGap(18, 18, 18)
                    .addComponent(txtDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/filetransporter.jpg"))); // NOI18N
            jLabel4.setText("jLabel4");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbrStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addComponent(tbrStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void CentralizarFrame(frmFileTransformer frame) {
        Dimension paneSize = frame.getSize();
        Dimension screenSize = frame.getToolkit().getScreenSize();
        frame.setLocation((screenSize.width - paneSize.width) / 2, (screenSize.height - paneSize.height) / 2);
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
            Servidor serv = new Servidor(Integer.valueOf(txtPorta.getText()).intValue());
            lblInforma.setText("Conectado");
            lblReceberArquivosEm.setEnabled(true);
            btnDiretorio.setEnabled(true);
            txtDiretorio.setEnabled(true);
            txtPorta.setEnabled(false);
            btnOk.setEnabled(false);
            lblProntoReceber.setText("Pronto para receber arquivos");
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "Algum erro ocorreu...");
            e1.printStackTrace();
        }


    }//GEN-LAST:event_btnOkActionPerformed

    private void txtIPHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPHostActionPerformed

    private void btnDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiretorioActionPerformed
        SelecionaDiretorio selecionadir = new SelecionaDiretorio();
    }//GEN-LAST:event_btnDiretorioActionPerformed

    private void btnSelecionararquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionararquivoActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            txtArquivo.setText(arquivo.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou arquivo!");
        }
    }//GEN-LAST:event_btnSelecionararquivoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (txtIPHost.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o IP");
        } else {
            if (txtPorta.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Digite a porta");
            } else {
                if (!new File(txtArquivo.getText()).exists()) {
                    JOptionPane.showMessageDialog(rootPane, "Arquivo invalido");
                } else {
                    Cliente cliente = new Cliente(txtIPHost.getText(), Integer.parseInt(txtPortaHost.getText()));
                    cliente.setIpDoServidor(txtIPHost.getText());
                    cliente.setPorta(Integer.valueOf(txtPortaHost.getText()).intValue());
                    cliente.enviaArquivo(txtArquivo.getText());
                }
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtDiretorioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiretorioFocusLost
        if (!new File(txtDiretorio.getText()).exists()) {
            File diretorio = new File(txtDiretorio.getText());
            diretorio.mkdirs();
        }
    }//GEN-LAST:event_txtDiretorioFocusLost

    private void txtDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiretorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiretorioActionPerformed

    public class SelecionaDiretorio extends javax.swing.JFrame {

        public SelecionaDiretorio() {
            initComponents();
            trataFilechooser();
            close();
        }

        private void close() {
            setVisible(false);
            dispose();
        }

        private void trataFilechooser() {
            int retVal = jFileChooser1.showSaveDialog(this);
            if (retVal == jFileChooser1.APPROVE_OPTION) {
                txtDiretorio.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
            }
        }

        private void initComponents() {
            jFileChooser1 = new javax.swing.JFileChooser();

            addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosing(java.awt.event.WindowEvent evt) {
                    exitForm(evt);
                }
            });

            jFileChooser1.setAcceptAllFileFilterUsed(false);
            jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
            jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
            getContentPane().add(jFileChooser1, java.awt.BorderLayout.CENTER);

            pack();
        }

        private void exitForm(java.awt.event.WindowEvent evt) {
            setVisible(false);
            dispose();
        }
        private javax.swing.JFileChooser jFileChooser1;
    }

    public class Servidor implements Runnable {

        ServerSocket serv;
        private int porta;

        public Servidor(int porta_) throws Exception {
            this.porta = porta_;
            serv = new ServerSocket(porta_);
            new Thread(this).start();
            lblStatus.setText("Servidor aguardando conexão na porta: " + porta_);

        }

        public int getPorta() {
            return this.porta;
        }

        public void setPorta(int porta_) {
            this.porta = porta_;
        }

        public void run() {
            try {
                while (true) {
                    new TrataCliente(serv.accept()).start();
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

        class TrataCliente extends Thread {

            private Socket client;

            public TrataCliente(Socket s) {
                client = s;
            }

            public void run() {
                try {
                    ObjectInputStream in = new ObjectInputStream(client.getInputStream());
                    String fileName = in.readUTF();
                    long size = in.readLong();
                    lblStatus.setText("Processando arquivo: " + fileName + " - " + size + " bytes.");
                    String dir = new String(txtDiretorio.getText());
                    dir.replace("\\", "/");
                    FileOutputStream fos = new FileOutputStream(dir + "/" + fileName);
                    byte[] buf = new byte[4096];
                    while (true) {
                        int len = in.read(buf);
                        if (len == -1) {
                            break;
                        }
                        fos.write(buf, 0, len);                    }
                    fos.flush();
                    fos.close();
                    lblStatus.setText("Transferência concluída com sucesso!");
                    client.close();
                } catch (Exception e) {
                    lblStatus.setText("Algum erro com ocorreu...");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }
    }


    public class MyFileFilter extends javax.swing.filechooser.FileFilter {

        public static final String FILE_EXTENSION = ".dcat";

        public boolean accept(File f) {
            return f.getName().toLowerCase().endsWith(FILE_EXTENSION)
                    || f.isDirectory();
        }

        public String getDescription() {
            return "Meu formato (*" + FILE_EXTENSION + ")";
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmFileTransformer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiretorio;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSelecionararquivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblEnviarArquivo;
    private javax.swing.JLabel lblInforma;
    private javax.swing.JLabel lblProntoReceber;
    private javax.swing.JLabel lblReceberArquivosEm;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JToolBar tbrStatus;
    private javax.swing.JTextField txtArquivo;
    public javax.swing.JTextField txtDiretorio;
    private javax.swing.JTextField txtIPHost;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtPortaHost;
    // End of variables declaration//GEN-END:variables
}
