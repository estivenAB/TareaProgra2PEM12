package view;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Welcome() {
        initComponents();
        setLocationRelativeTo(null);
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
        lbWelcome = new javax.swing.JLabel();
        lbCrossword = new javax.swing.JLabel();
        lbAutores = new javax.swing.JLabel();
        lbEstiven = new javax.swing.JLabel();
        lbPriscila = new javax.swing.JLabel();
        lbMaikol = new javax.swing.JLabel();
        btEnter = new javax.swing.JButton();
        btRegister = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbWelcome.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        lbWelcome.setText("Bienvenidos");

        lbCrossword.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lbCrossword.setText("Crucigrama");

        lbAutores.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lbAutores.setText("Autores");

        lbEstiven.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lbEstiven.setText("Estiven Álvarez");

        lbPriscila.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lbPriscila.setText("Priscila Castro");

        lbMaikol.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lbMaikol.setText("Maikol Lizano");

        btEnter.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btEnter.setText("Ingresar");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        btRegister.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        btRegister.setText("Inscribirse");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCrossword)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbAutores)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaikol)
                            .addComponent(lbPriscila)
                            .addComponent(lbEstiven)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbWelcome)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btRegister)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWelcome)
                .addGap(18, 18, 18)
                .addComponent(lbCrossword)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAutores)
                            .addComponent(lbEstiven))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPriscila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMaikol)
                        .addGap(62, 118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEnter)
                            .addComponent(btRegister))
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        Login login = new Login(this, true);
        login.setVisible(true);
    }//GEN-LAST:event_btEnterActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        SingOn singOn = new SingOn(this, true);
        singOn.setVisible(true);
    }//GEN-LAST:event_btRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAutores;
    private javax.swing.JLabel lbCrossword;
    private javax.swing.JLabel lbEstiven;
    private javax.swing.JLabel lbMaikol;
    private javax.swing.JLabel lbPriscila;
    private javax.swing.JLabel lbWelcome;
    // End of variables declaration//GEN-END:variables
}
