/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Estiven
 */
public class Instructions extends javax.swing.JFrame {

    /**
     * Creates new form Instructions
     */
    public Instructions() {
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

        lbInstructions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriptions = new javax.swing.JTextArea();
        btNext = new javax.swing.JButton();
        rbNoMoreInstructions = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbInstructions.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lbInstructions.setText("Instrucciones:");

        txtDescriptions.setColumns(20);
        txtDescriptions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescriptions.setRows(5);
        txtDescriptions.setText("-En el presente juego podrá elegir entre 4 niveles de dificultad.\n-Se le presentarán las pistas para las palabras horizontales y \nverticales respectivamente.\n-Cuenta con 3 intentos, al exceder este límite, se le devolverá a la \nventana para volver a elegir un nivel.\n-Dependiendo del nivel que elija, se le presentará un tipo de ayuda \nsegún la dificultad.\n-Debe ser cuidadoso y completar todos los espacios solicitados, \nde lo contrario se descontará un intento.\n-Puede optar por el botón de ayuda cuando sea posible, sin\nembargo, puede exceder el uso de este.\n");
        jScrollPane1.setViewportView(txtDescriptions);

        btNext.setText("Siguiente");

        rbNoMoreInstructions.setText("No volver a mostrar esta ventana.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbInstructions)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rbNoMoreInstructions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNext)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNext)
                    .addComponent(rbNoMoreInstructions))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbInstructions;
    private javax.swing.JRadioButton rbNoMoreInstructions;
    private javax.swing.JTextArea txtDescriptions;
    // End of variables declaration//GEN-END:variables
}