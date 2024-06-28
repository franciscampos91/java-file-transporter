package Classes;

import Forms.frmFileTransformer;
import java.io.File;

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
            System.out.println(jFileChooser1.getSelectedFile().getParent());
        }
        frmFileTransformer frm = new frmFileTransformer();
        frm.txtDiretorio.setText(jFileChooser1.getSelectedFile().getParent());
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

    public static void main(String args[]) {
        new SelecionaDiretorio().show();
    }
    private javax.swing.JFileChooser jFileChooser1;
}
