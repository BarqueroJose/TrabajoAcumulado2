
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author barquero
 */
public class Cuestionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cuestionario
     */
    public Cuestionario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        grupo158 = new javax.swing.JRadioButton();
        grupo134 = new javax.swing.JRadioButton();
        grupo131 = new javax.swing.JRadioButton();
        grupo140 = new javax.swing.JRadioButton();
        grupo2Marte = new javax.swing.JRadioButton();
        grupo2Jupiter = new javax.swing.JRadioButton();
        grupo2Tierra = new javax.swing.JRadioButton();
        grupo2Saturno = new javax.swing.JRadioButton();
        grupo3Ola = new javax.swing.JRadioButton();
        grupo3Decision = new javax.swing.JRadioButton();
        grupo3hay = new javax.swing.JRadioButton();
        grupo3ahi = new javax.swing.JRadioButton();
        grupo4Sagaz = new javax.swing.JRadioButton();
        Grupo4Astuto = new javax.swing.JRadioButton();
        Grupo4Listo = new javax.swing.JRadioButton();
        Grupo4Lerdo = new javax.swing.JRadioButton();
        grupo1Respuesta = new javax.swing.JTextField();
        grupo2Respuesta = new javax.swing.JTextField();
        grupo3Respuesta = new javax.swing.JTextField();
        grupo4Respuesta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRespuestas = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(grupo158);
        grupo158.setText("58");

        buttonGroup1.add(grupo134);
        grupo134.setText("34");

        buttonGroup1.add(grupo131);
        grupo131.setText("31");

        buttonGroup1.add(grupo140);
        grupo140.setText("40");

        buttonGroup2.add(grupo2Marte);
        grupo2Marte.setText("Marte");

        buttonGroup2.add(grupo2Jupiter);
        grupo2Jupiter.setText("Jupiter");

        buttonGroup2.add(grupo2Tierra);
        grupo2Tierra.setText("Tierra");

        buttonGroup2.add(grupo2Saturno);
        grupo2Saturno.setText("Saturno");
        grupo2Saturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo2SaturnoActionPerformed(evt);
            }
        });

        buttonGroup3.add(grupo3Ola);
        grupo3Ola.setText("Ola");

        buttonGroup3.add(grupo3Decision);
        grupo3Decision.setText("Decisi??n");

        buttonGroup3.add(grupo3hay);
        grupo3hay.setText("Hay");

        buttonGroup3.add(grupo3ahi);
        grupo3ahi.setText("Ah??");

        buttonGroup4.add(grupo4Sagaz);
        grupo4Sagaz.setText("Sagaz");

        buttonGroup4.add(Grupo4Astuto);
        Grupo4Astuto.setText("Astuto");

        buttonGroup4.add(Grupo4Listo);
        Grupo4Listo.setText("Listo");

        buttonGroup4.add(Grupo4Lerdo);
        Grupo4Lerdo.setText("Lerdo");
        Grupo4Lerdo.setToolTipText("");

        grupo4Respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo4RespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grupo2Marte)
                    .addComponent(grupo3Ola)
                    .addComponent(grupo4Sagaz)
                    .addComponent(grupo158, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupo134)
                            .addComponent(grupo2Jupiter)
                            .addComponent(grupo3Decision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupo131)
                            .addComponent(grupo2Tierra)
                            .addComponent(grupo3hay)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Grupo4Astuto)
                        .addGap(20, 20, 20)
                        .addComponent(Grupo4Listo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(grupo2Saturno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grupo2Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupo140)
                            .addComponent(Grupo4Lerdo)
                            .addComponent(grupo3ahi))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grupo4Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grupo3Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grupo1Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupo158)
                    .addComponent(grupo134)
                    .addComponent(grupo131)
                    .addComponent(grupo140)
                    .addComponent(grupo1Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupo2Marte)
                    .addComponent(grupo2Jupiter)
                    .addComponent(grupo2Tierra)
                    .addComponent(grupo2Saturno)
                    .addComponent(grupo2Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupo3Ola)
                    .addComponent(grupo3Decision)
                    .addComponent(grupo3hay)
                    .addComponent(grupo3ahi)
                    .addComponent(grupo3Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupo4Sagaz)
                    .addComponent(Grupo4Astuto)
                    .addComponent(Grupo4Listo)
                    .addComponent(Grupo4Lerdo)
                    .addComponent(grupo4Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setText("4*6+3+2*2=");

        jLabel3.setText("Nombre del Quinto Planeta=");

        jLabel2.setText("Palabras con error ortografico=");

        jLabel4.setText("Sinonimo de inteligente=");

        btnRespuestas.setText("Ver respuestas");
        btnRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRespuestas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnRespuestas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grupo2SaturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo2SaturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupo2SaturnoActionPerformed

    private void btnRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuestasActionPerformed
        // TODO add your handling code here:
        if (grupo158.isSelected()) {
            grupo1Respuesta.setText("ERROR");
            grupo1Respuesta.setBackground(Color.red);   
        }else if(grupo134.isSelected()){
            grupo1Respuesta.setText("ERROR");
            grupo1Respuesta.setBackground(Color.red);  
        }else if(grupo131.isSelected()){
            grupo1Respuesta.setText("CIERTO");
            grupo1Respuesta.setBackground(Color.green);  
        }else if(grupo140.isSelected()){
            grupo1Respuesta.setText("ERROR");
            grupo1Respuesta.setBackground(Color.red);  
        }
        if (grupo2Marte.isSelected()){
            grupo2Respuesta.setText("ERROR");
            grupo2Respuesta.setBackground(Color.red);  
        }else if(grupo2Jupiter.isSelected()){
            grupo2Respuesta.setText("CIERTO");
            grupo2Respuesta.setBackground(Color.green); 
        }else if(grupo2Tierra.isSelected()){
            grupo2Respuesta.setText("ERROR");
            grupo2Respuesta.setBackground(Color.red);  
        }else if(grupo2Saturno.isSelected()){
            grupo2Respuesta.setText("ERROR");
            grupo2Respuesta.setBackground(Color.red);  
        }
        if(grupo3Ola.isSelected()){
            grupo3Respuesta.setText("CIERTO");
            grupo3Respuesta.setBackground(Color.green);
        }else if(grupo3Decision.isSelected()){
            grupo3Respuesta.setText("ERROR");
            grupo3Respuesta.setBackground(Color.red); 
        }else if(grupo3hay.isSelected()){
            grupo3Respuesta.setText("ERROR");
            grupo3Respuesta.setBackground(Color.red); 
        }else if(grupo3ahi.isSelected()){
            grupo3Respuesta.setText("ERROR");
            grupo3Respuesta.setBackground(Color.red); 
        }
        if(grupo4Sagaz.isSelected()){
            grupo4Respuesta.setText("CIERTO");
            grupo4Respuesta.setBackground(Color.green);
        }else if(Grupo4Listo.isSelected()){
             grupo4Respuesta.setText("CIERTO");
            grupo4Respuesta.setBackground(Color.green);
        }
        else if(Grupo4Lerdo.isSelected()){
             grupo4Respuesta.setText("ERROR");
            grupo4Respuesta.setBackground(Color.red);
        }else if(grupo4Sagaz.isSelected()){
             grupo4Respuesta.setText("ERROR");
            grupo4Respuesta.setBackground(Color.red);
        }
    }//GEN-LAST:event_btnRespuestasActionPerformed

    private void grupo4RespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo4RespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupo4RespuestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Grupo4Astuto;
    private javax.swing.JRadioButton Grupo4Lerdo;
    private javax.swing.JRadioButton Grupo4Listo;
    private javax.swing.JButton btnRespuestas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton grupo131;
    private javax.swing.JRadioButton grupo134;
    private javax.swing.JRadioButton grupo140;
    private javax.swing.JRadioButton grupo158;
    private javax.swing.JTextField grupo1Respuesta;
    private javax.swing.JRadioButton grupo2Jupiter;
    private javax.swing.JRadioButton grupo2Marte;
    private javax.swing.JTextField grupo2Respuesta;
    private javax.swing.JRadioButton grupo2Saturno;
    private javax.swing.JRadioButton grupo2Tierra;
    private javax.swing.JRadioButton grupo3Decision;
    private javax.swing.JRadioButton grupo3Ola;
    private javax.swing.JTextField grupo3Respuesta;
    private javax.swing.JRadioButton grupo3ahi;
    private javax.swing.JRadioButton grupo3hay;
    private javax.swing.JTextField grupo4Respuesta;
    private javax.swing.JRadioButton grupo4Sagaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
