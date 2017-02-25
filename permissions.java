/*
 * Copyright 2017 Emre JILTA
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO 
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE 
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package permissions;

/**
 *
 * @author emrejilta
 */
public class permissions extends javax.swing.JFrame {

    /**
     * Creates new form permissions
     */
    public permissions() {
        initComponents();
    }
    
    //Permissions as Strings
    String[] permissionsString = { "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx" };
    
    //Permission Strings indices
    int[] permissionsInt = { 1, 2, 3, 4, 5, 6, 7 };
    
    //Setting owner's permissions
    private void owner(){
        if(!(cbOwnerRead.isSelected() && cbOwnerWrite.isSelected() && cbOwnerExecute.isSelected())){
            tbStrOwner.setText("---");
            tbHexOwner.setText("0");
        }
        if(cbOwnerExecute.isSelected()){
            tbStrOwner.setText(permissionsString[0]);
            tbHexOwner.setText(String.valueOf(permissionsInt[0]));
        }
        if(cbOwnerWrite.isSelected()){
            tbStrOwner.setText(permissionsString[1]);
            tbHexOwner.setText(String.valueOf(permissionsInt[1]));
        }
        if(cbOwnerExecute.isSelected() && cbOwnerWrite.isSelected()){
            tbStrOwner.setText(permissionsString[2]);
            tbHexOwner.setText(String.valueOf(permissionsInt[2]));
        }
        if(cbOwnerRead.isSelected()){
            tbStrOwner.setText(permissionsString[3]);
            tbHexOwner.setText(String.valueOf(permissionsInt[3]));
        }
        if(cbOwnerExecute.isSelected() && cbOwnerRead.isSelected()){
            tbStrOwner.setText(permissionsString[4]);
            tbHexOwner.setText(String.valueOf(permissionsInt[4]));
        }
        if(cbOwnerRead.isSelected() && cbOwnerWrite.isSelected()){
            tbStrOwner.setText(permissionsString[5]);
            tbHexOwner.setText(String.valueOf(permissionsInt[5]));
        }
        if(cbOwnerRead.isSelected() && cbOwnerWrite.isSelected() && cbOwnerExecute.isSelected()){
            tbStrOwner.setText(permissionsString[6]);
            tbHexOwner.setText(String.valueOf(permissionsInt[6]));
        }
    }

    //Setting group's permissions
    private void group(){
        if(!(cbGroupRead.isSelected() && cbGroupWrite.isSelected() && cbGroupExecute.isSelected())){
            tbStrGroup.setText("---");
            tbHexGroup.setText("0");
        }
        if(cbGroupExecute.isSelected()){
            tbStrGroup.setText(permissionsString[0]);
            tbHexGroup.setText(String.valueOf(permissionsInt[0]));
        }
        if(cbGroupWrite.isSelected()){
            tbStrGroup.setText(permissionsString[1]);
            tbHexGroup.setText(String.valueOf(permissionsInt[1]));
        }
        if(cbGroupExecute.isSelected() && cbGroupWrite.isSelected()){
            tbStrGroup.setText(permissionsString[2]);
            tbHexGroup.setText(String.valueOf(permissionsInt[2]));
        }
        if(cbGroupRead.isSelected()){
            tbStrGroup.setText(permissionsString[3]);
            tbHexGroup.setText(String.valueOf(permissionsInt[3]));
        }
        if(cbGroupExecute.isSelected() && cbGroupRead.isSelected()){
            tbStrGroup.setText(permissionsString[4]);
            tbHexGroup.setText(String.valueOf(permissionsInt[4]));
        }
        if(cbGroupRead.isSelected() && cbGroupWrite.isSelected()){
            tbStrGroup.setText(permissionsString[5]);
            tbHexGroup.setText(String.valueOf(permissionsInt[5]));
        }
        if(cbGroupRead.isSelected() && cbGroupWrite.isSelected() && cbGroupExecute.isSelected()){
            tbStrGroup.setText(permissionsString[6]);
            tbHexGroup.setText(String.valueOf(permissionsInt[6]));
        }
    }
    
    //Setting others' permission
    private void others(){
        if(!(cbOthersRead.isSelected() && cbOthersWrite.isSelected() && cbOthersExecute.isSelected())){
            tbStrOthers.setText("---");
            tbHexOthers.setText("0");
        }
        if(cbOthersExecute.isSelected()){
            tbStrOthers.setText(permissionsString[0]);
            tbHexOthers.setText(String.valueOf(permissionsInt[0]));
        }
        if(cbOthersWrite.isSelected()){
            tbStrOthers.setText(permissionsString[1]);
            tbHexOthers.setText(String.valueOf(permissionsInt[1]));
        }
        if(cbOthersExecute.isSelected() && cbOthersWrite.isSelected()){
            tbStrOthers.setText(permissionsString[2]);
            tbHexOthers.setText(String.valueOf(permissionsInt[2]));
        }
        if(cbOthersRead.isSelected()){
            tbStrOthers.setText(permissionsString[3]);
            tbHexOthers.setText(String.valueOf(permissionsInt[3]));
        }
        if(cbOthersExecute.isSelected() && cbOthersRead.isSelected()){
            tbStrOthers.setText(permissionsString[4]);
            tbHexOthers.setText(String.valueOf(permissionsInt[4]));
        }
        if(cbOthersRead.isSelected() && cbOthersWrite.isSelected()){
            tbStrOthers.setText(permissionsString[5]);
            tbHexOthers.setText(String.valueOf(permissionsInt[5]));
        }
        if(cbOthersRead.isSelected() && cbOthersWrite.isSelected() && cbOthersExecute.isSelected()){
            tbStrOthers.setText(permissionsString[6]);
            tbHexOthers.setText(String.valueOf(permissionsInt[6]));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbOwnerRead = new javax.swing.JCheckBox();
        cbOwnerWrite = new javax.swing.JCheckBox();
        cbOwnerExecute = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cbGroupRead = new javax.swing.JCheckBox();
        cbGroupWrite = new javax.swing.JCheckBox();
        cbGroupExecute = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cbOthersRead = new javax.swing.JCheckBox();
        cbOthersWrite = new javax.swing.JCheckBox();
        cbOthersExecute = new javax.swing.JCheckBox();
        tbStrGroup = new javax.swing.JTextField();
        tbHexGroup = new javax.swing.JTextField();
        tbStrOthers = new javax.swing.JTextField();
        tbHexOthers = new javax.swing.JTextField();
        StrAll = new javax.swing.JTextField();
        HexAll = new javax.swing.JTextField();
        btShow = new javax.swing.JButton();
        tbStrOwner = new javax.swing.JTextField();
        tbHexOwner = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Permissions");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Owner"));

        cbOwnerRead.setText("Read");

        cbOwnerWrite.setText("Write");

        cbOwnerExecute.setText("Execute");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOwnerRead)
                    .addComponent(cbOwnerWrite)
                    .addComponent(cbOwnerExecute))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOwnerRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOwnerWrite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOwnerExecute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Group"));

        cbGroupRead.setText("Read");

        cbGroupWrite.setText("Write");

        cbGroupExecute.setText("Execute");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbGroupRead)
                    .addComponent(cbGroupWrite)
                    .addComponent(cbGroupExecute))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbGroupRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGroupWrite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGroupExecute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Others"));

        cbOthersRead.setText("Read");

        cbOthersWrite.setText("Write");

        cbOthersExecute.setText("Execute");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOthersRead)
                    .addComponent(cbOthersWrite)
                    .addComponent(cbOthersExecute))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOthersRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOthersWrite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOthersExecute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btShow.setText("Show");
        btShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tbStrOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbHexOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tbStrGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbHexGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tbStrOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbHexOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StrAll, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HexAll, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btShow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbStrGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbHexGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbStrOthers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbHexOthers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbStrOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbHexOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StrAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HexAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btShow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowActionPerformed
        //  0   |  000  |  -
        //  1   |  001  |  x
        //  2   |  010  |  w
        //  3   |  011  |  w+x
        //  4   |  100  |  r
        //  5   |  101  |  r+x
        //  6   |  110  |  r+w
        //  7   |  111  |  r+w+x    
        
        owner();
        group();
        others();
        StrAll.setText(tbStrOwner.getText()+tbStrGroup.getText()+tbStrOthers.getText());
        HexAll.setText(tbHexOwner.getText()+tbHexGroup.getText()+tbHexOthers.getText());
    }//GEN-LAST:event_btShowActionPerformed

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
            java.util.logging.Logger.getLogger(permissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permissions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HexAll;
    private javax.swing.JTextField StrAll;
    private javax.swing.JButton btShow;
    private javax.swing.JCheckBox cbGroupExecute;
    private javax.swing.JCheckBox cbGroupRead;
    private javax.swing.JCheckBox cbGroupWrite;
    private javax.swing.JCheckBox cbOthersExecute;
    private javax.swing.JCheckBox cbOthersRead;
    private javax.swing.JCheckBox cbOthersWrite;
    private javax.swing.JCheckBox cbOwnerExecute;
    private javax.swing.JCheckBox cbOwnerRead;
    private javax.swing.JCheckBox cbOwnerWrite;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tbHexGroup;
    private javax.swing.JTextField tbHexOthers;
    private javax.swing.JTextField tbHexOwner;
    private javax.swing.JTextField tbStrGroup;
    private javax.swing.JTextField tbStrOthers;
    private javax.swing.JTextField tbStrOwner;
    // End of variables declaration//GEN-END:variables
}
