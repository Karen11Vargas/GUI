/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class AprendizI extends javax.swing.JFrame {
    
    static final int CANTIDAD_MAXIMA_ESTUDIANTES = 10;
    int contador = 0 ;
    Aprendiz vecEstudiante[] = new Aprendiz [CANTIDAD_MAXIMA_ESTUDIANTES];
    Aprendiz est = null;

    /**
     * Creates new form AprendizI
     */
    public AprendizI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldPF = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(700, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("APRENDIZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 123, 33);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 140, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 90, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 70, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 70, 90);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 260, 60, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("Programa Formacion");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 300, 170, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setText("Codigo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 380, 60, 20);
        getContentPane().add(jTextFieldTel);
        jTextFieldTel.setBounds(100, 170, 190, 30);
        getContentPane().add(jTextFieldCorreo);
        jTextFieldCorreo.setBounds(100, 260, 190, 30);
        getContentPane().add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(100, 380, 190, 30);
        getContentPane().add(jTextFieldApellido);
        jTextFieldApellido.setBounds(100, 120, 190, 30);
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(100, 70, 190, 30);
        getContentPane().add(jTextFieldEdad);
        jTextFieldEdad.setBounds(100, 220, 190, 30);
        getContentPane().add(jTextFieldPF);
        jTextFieldPF.setBounds(100, 340, 190, 30);

        jButtonAtras.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(153, 153, 255));
        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras);
        jButtonAtras.setBounds(350, 330, 140, 80);

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(153, 153, 255));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(350, 70, 140, 80);

        jButtonLimpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(153, 153, 255));
        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar);
        jButtonLimpiar.setBounds(350, 190, 140, 80);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setText("DATOS: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 470, 90, 30);

        jTextAreaResult.setColumns(20);
        jTextAreaResult.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResult);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 450, 230, 96);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
         Herencia herencia = new Herencia ();
            herencia.setVisible(true);
            //Dispose mata el proceso anterior 
            dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldTel.setText("");
        jTextFieldEdad.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldPF.setText("");
        jTextFieldCodigo.setText("");
        jTextAreaResult.setText(String.valueOf("" + "\n" + "" +"\n" + "" + "\n" + "" +"\n" + "" +"\n" + "" +"\n" + ""));
       jTextAreaResult.setEditable(false);
            
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (contador < vecEstudiante.length){
            
           
            String nombre =  jTextFieldNombre.getText();
            String apellido =  jTextFieldApellido.getText();
            int edad=  Integer.parseInt ( jTextFieldEdad.getText());
            String correo =  jTextFieldCorreo.getText();
            double telefono= Double.parseDouble( jTextFieldTel.getText());
            String programaFormacion = jTextFieldPF.getText();
            int codigoAprendiz = Integer.parseInt ( jTextFieldCodigo.getText());
            
            // est= new Aprendiz (nombre, apellido, edad, correo, telefono, programaFormacion, codigoAprendiz);
            //vacEstudiante[contador] = est;
            //contador ++;
            
             Aprendiz aprendiz = new Aprendiz(nombre, apellido, edad, correo, telefono);
         aprendiz.setProgramaFormacion(programaFormacion);
         
      
        JOptionPane.showMessageDialog(this, "Sus datos se guardaron correctamente");
 
       jTextAreaResult.setText(String.valueOf(nombre + "\n" + apellido +"\n" + edad+ "\n" +correo+"\n" +telefono+"\n" +programaFormacion +"\n" + codigoAprendiz));
       jTextAreaResult.setEditable(false);
            
        }else{
                        JOptionPane.showMessageDialog(this, "No se guardaron bien los datos");

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AprendizI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AprendizI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AprendizI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AprendizI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AprendizI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPF;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
