/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import myapp.studentForm;
import myapp.loginForm;
import net.proteanit.sql.DbUtils;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Administrator
 */
public class studentPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form userPage
     */
    public studentPage() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        search.setOpaque(false);
        search.setBackground(new Color(0,0,0,0));
    }
    
    public void displayData(){
        try{
            dbConnector dbc= new dbConnector();
            ResultSet rs=dbc.getData("SELECT `s_id`, `s_fname`, `s_lname`, `s_gender`, `s_status` FROM tbl_student");
            student_table.setModel(DbUtils.resultSetToTableModel(rs)); 
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors:"+ex.getMessage());
        }
         
    }
    
    Color navcolor=new Color (255,153,0);
    Color headcolor=new Color(255,204,51);
    Color bodycolor=new Color (255,51,51);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search_button = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(620, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3);
        jPanel3.setBounds(340, 0, 170, 40);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("STUDENTS PAGE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 150, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        jScrollPane1.setViewportView(student_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 640, 350));

        delete.setBackground(new java.awt.Color(255, 153, 0));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DELETE");
        delete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 30));

        add.setBackground(new java.awt.Color(255, 153, 0));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD");
        add.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 30));

        edit.setBackground(new java.awt.Color(255, 153, 0));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDIT");
        edit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, 30));

        search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.setOpaque(false);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 170, 30));

        search_button.setBackground(new java.awt.Color(255, 153, 0));
        search_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_buttonMouseExited(evt);
            }
        });
        search_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SEARCH");
        search_button.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 80, 30));

        refresh.setBackground(new java.awt.Color(255, 153, 0));
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REFRESH");
        refresh.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
       delete.setBackground(bodycolor);  
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
     delete.setBackground(navcolor);  
    }//GEN-LAST:event_deleteMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
      add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
     add.setBackground(navcolor); 
    }//GEN-LAST:event_addMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
     edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
     edit.setBackground(navcolor); 
    }//GEN-LAST:event_editMouseExited

    private void search_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseEntered
       search_button.setBackground(bodycolor);
    }//GEN-LAST:event_search_buttonMouseEntered

    private void search_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseExited
     search_button.setBackground(navcolor); 
    }//GEN-LAST:event_search_buttonMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
     
     JFrame mainFrame=(JFrame)SwingUtilities.getWindowAncestor(this);
     mainFrame.dispose();
     studentForm stf=new studentForm();
     stf.setVisible(true);
     stf.action="Add";
     stf.st_label.setText("Save");
     
    }//GEN-LAST:event_addMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
     refresh.setBackground(bodycolor); 

    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
     refresh.setBackground(navcolor); 
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
     displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
    int rowIndex=student_table.getSelectedRow();
    if(rowIndex<0){
      JOptionPane.showMessageDialog(null,"Please Select An Item!");
    }else{
        TableModel model=student_table.getModel();
        studentForm stf=new studentForm();
        stf.st_id.setText(""+model.getValueAt(rowIndex,0));
        stf.st_fname.setText(""+model.getValueAt(rowIndex,1));
        stf.st_lname.setText(""+model.getValueAt(rowIndex,2));
        
        stf.gender=model.getValueAt(rowIndex,3).toString();
        
        String gend=model.getValueAt(rowIndex,3).toString();
        
        if(gend.equals("Male")){
            stf.male.setSelected(true);
        }
        if(gend.equals("Female")){
            stf.female.setSelected(true);
        }
         
        stf.st_status.setSelectedItem(model.getValueAt(rowIndex,4));
        stf.st_address.setText(model.getValueAt(rowIndex,5).toString());
        stf.st_email.setText(model.getValueAt(rowIndex,6).toString());
        stf.setVisible(true);
        stf.action="Update";
        stf.st_label.setText("Update");
        JFrame mainFrame=(JFrame)SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
    }
    
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
     int rowIndex=student_table.getSelectedRow();
     if(rowIndex<0){
        JOptionPane.showMessageDialog(null,"Please Select data first from the table!"); 
     }else{
         TableModel model=student_table.getModel();
         Object value=model.getValueAt(rowIndex,0);
         String id=value.toString();
         
         int a= JOptionPane.showConfirmDialog(null,"Are you sure to delete ID:"+id);
         if(a==JOptionPane.YES_OPTION){
             dbConnector dbc=new dbConnector();
             int st_id=Integer.parseInt(id);
             dbc.deleteData(st_id,"tbl_student","s_id");
             displayData();
         }
     }
    }//GEN-LAST:event_deleteMouseClicked

    private void search_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseClicked
     DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        student_table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_search_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh;
    private javax.swing.JTextField search;
    private javax.swing.JPanel search_button;
    public javax.swing.JTable student_table;
    // End of variables declaration//GEN-END:variables
}
