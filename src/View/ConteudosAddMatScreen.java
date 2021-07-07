package View;

import Controller.DBConteudos;
import ViewFunctions.Conteudos;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class ConteudosAddMatScreen extends javax.swing.JInternalFrame {

    private String sigla;
    private DBConteudos dbConteudos = new DBConteudos();
    private Conteudos cont = new Conteudos();

    public ConteudosAddMatScreen(String Materia, String Sigla, String nCred) {
        initComponents();
        this.sigla = Sigla;
        lb_Materia1.setText("Matéria: " + Materia);
        lb_Sigla1.setText("Sigla: " + Sigla);
        lb_Creditos1.setText("N° Créditos: " + nCred);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_dialog1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_Materia1 = new javax.swing.JLabel();
        lb_Sigla1 = new javax.swing.JLabel();
        lb_Conteudos1 = new javax.swing.JLabel();
        lb_Avisos1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txArConteudos = new javax.swing.JTextArea();
        bt_concluir = new javax.swing.JButton();
        lb_Creditos1 = new javax.swing.JLabel();

        setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_Materia1.setText("Matéria:");

        lb_Sigla1.setText("Sigla:");

        lb_Conteudos1.setText("Conteúdos da Matéria");

        lb_Avisos1.setText("<html> <div style='text-align: center;'>Use ponto para separar os conteúdos</div></html>"); // NOI18N

        txArConteudos.setColumns(20);
        txArConteudos.setLineWrap(true);
        txArConteudos.setRows(5);
        jScrollPane2.setViewportView(txArConteudos);

        bt_concluir.setText("Concluir");
        bt_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_concluirActionPerformed(evt);
            }
        });

        lb_Creditos1.setText("N° Créditos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_Avisos1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_Conteudos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_Materia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_Sigla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_Creditos1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lb_Materia1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_Sigla1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_Conteudos1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_Creditos1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Avisos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jp_dialog1Layout = new javax.swing.GroupLayout(jp_dialog1);
        jp_dialog1.setLayout(jp_dialog1Layout);
        jp_dialog1Layout.setHorizontalGroup(
            jp_dialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dialog1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jp_dialog1Layout.setVerticalGroup(
            jp_dialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dialog1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_dialog1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_dialog1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_concluirActionPerformed
        cont.bt_concluir(sigla, txArConteudos);
        backHome();
        this.dispose();
    }//GEN-LAST:event_bt_concluirActionPerformed

    private void backHome() {
        HomeScreen screenHome = new HomeScreen();
        getParent().add(screenHome);
        ((BasicInternalFrameUI) screenHome.getUI()).setNorthPane(null);
        screenHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        screenHome.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_concluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp_dialog1;
    private javax.swing.JLabel lb_Avisos1;
    private javax.swing.JLabel lb_Conteudos1;
    private javax.swing.JLabel lb_Creditos1;
    private javax.swing.JLabel lb_Materia1;
    private javax.swing.JLabel lb_Sigla1;
    private javax.swing.JTextArea txArConteudos;
    // End of variables declaration//GEN-END:variables
}