/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Data.DataMessageDialog;
import Data.DataSQL;
import Data.DataValidator;
import java.awt.event.FocusEvent;
import java.sql.Blob;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BangDiem;
import model.Student;
import view.QLSVPannel;

/**
 *
 * @author USER
 */
public class QLDiemPannel extends javax.swing.JPanel {

    private MainForm parentForm;
    public QLDiemPannel() {
        initComponents();
        this.ViewDiem();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_TimMaSV = new javax.swing.JTextField();
        jTextField_maSV = new javax.swing.JTextField();
        jTextField_lapTrinhC = new javax.swing.JTextField();
        jTextField_pyThon = new javax.swing.JTextField();
        jTextField_java = new javax.swing.JTextField();
        jButton_timKiem = new javax.swing.JButton();
        jLabel_DTB = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_nhapMoi = new javax.swing.JButton();
        jButton_luu = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jButton_capNhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_bangDiem = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField_hoTen = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1100, 610));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Mã sinh viên:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel3.setText("Mã sinh viên");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel5.setText("Lập trình C");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jLabel6.setText("Python");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 60, 20));

        jLabel7.setText("Java");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));
        add(jTextField_TimMaSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 152, 210, 30));

        jTextField_maSV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_maSVFocusLost(evt);
            }
        });
        add(jTextField_maSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 140, 30));

        jTextField_lapTrinhC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_lapTrinhCFocusLost(evt);
            }
        });
        add(jTextField_lapTrinhC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 140, 30));

        jTextField_pyThon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_lapTrinhCFocusLost(evt);
            }
        });
        add(jTextField_pyThon, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 140, 30));

        jTextField_java.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_lapTrinhCFocusLost(evt);
            }
        });
        add(jTextField_java, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 140, 30));

        jButton_timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search1.png"))); // NOI18N
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_timKiemActionPerformed(evt);
            }
        });
        add(jButton_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, 30));

        jLabel_DTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_DTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DTB.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm TB", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 18))); // NOI18N
        jLabel_DTB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel_DTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 140, 110));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1090, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, 1070, 0));

        jButton_nhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/write.png"))); // NOI18N
        jButton_nhapMoi.setText("Nhập mới");
        jButton_nhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nhapMoiActionPerformed(evt);
            }
        });
        add(jButton_nhapMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 120, 30));

        jButton_luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/diskette (1).png"))); // NOI18N
        jButton_luu.setText("Lưu ");
        jButton_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_luuActionPerformed(evt);
            }
        });
        add(jButton_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 120, 30));

        jButton_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-24.png"))); // NOI18N
        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });
        add(jButton_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 110, 30));

        jButton_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-update-24.png"))); // NOI18N
        jButton_capNhat.setText("Cập nhật");
        jButton_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_capNhatActionPerformed(evt);
            }
        });
        add(jButton_capNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 120, 30));

        jTable_bangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Lập trình C", "Python", "Java", "Điểm Trung Bình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_bangDiem);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1070, 110));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1090, 10));

        jLabel4.setText("Họ tên");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));
        add(jTextField_hoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 242, 140, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-check-mark-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 140));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("QUẢN LÍ ĐIỂM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 930, 140));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1090, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_nhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nhapMoiActionPerformed
        jTextField_maSV.setText("");
        jTextField_hoTen.setText("");
        jTextField_lapTrinhC.setText("");
        jTextField_pyThon.setText("");
        jTextField_java.setText("");
        jTextField_TimMaSV.setText("");
        
    }//GEN-LAST:event_jButton_nhapMoiActionPerformed

    private void jButton_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_luuActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(jTextField_maSV, sb, "Vui lòng nhập mã sinh viên");
        DataValidator.validateEmpty(jTextField_lapTrinhC, sb, "Vui lòng nhập diểm Lập trình C");
        DataValidator.validateEmpty(jTextField_pyThon, sb, "Vui lòng nhập điểm Python");
        DataValidator.validateEmpty(jTextField_java, sb, "Vui lòng nhập điểm Java");
        if(sb.length() > 0){
            DataMessageDialog.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            BangDiem bd = new BangDiem();
            bd.setMaSV(jTextField_maSV.getText().toUpperCase());
            bd.setLapTrinhC(Float.parseFloat(jTextField_lapTrinhC.getText()));
            bd.setPython(Float.parseFloat(jTextField_pyThon.getText()));
            bd.setJava(Float.parseFloat(jTextField_java.getText()));
            if(findByID(jTextField_maSV.getText())!= null){
                if(DataMessageDialog.showConfirmDialog(parentForm, "Bạn có muốn cập nhật điểm không ? ", "Xác nhận") == JOptionPane.NO_OPTION){
                    return;
                }
                else if( (bd.getLapTrinhC() < 0 || bd.getLapTrinhC() > 10) || (bd.getPython()< 0 || bd.getPython()> 10) || (bd.getJava()< 0 || bd.getJava()> 10) ){
                    DataMessageDialog.showErrorDialog(parentForm, "Điểm nằm trong khoảng từ 0 đến 10", "Cảnh báo");
                }
                else if(updateDiem(bd)){
                DataMessageDialog.showMessageDialog(parentForm, "Cập nhật bảng điểm thành công", "Thông báo");
                }
                else{
                DataMessageDialog.showMessageDialog(parentForm, "Cập nhật bảng điểm thất bại", "Thông báo");
                }
            }
            else if(findByIDfromSinhVien(jTextField_maSV.getText()) == null){
                DataMessageDialog.showMessageDialog(parentForm, "Sinh viên không nằm trong hệ thống, vui lòng thêm sinh viên", "Thông báo");
            }
            else{
                if( (bd.getLapTrinhC() < 0 || bd.getLapTrinhC() > 10) || (bd.getPython()< 0 || bd.getPython()> 10) || (bd.getJava()< 0 || bd.getJava()> 10) ){
                    DataMessageDialog.showErrorDialog(parentForm, "Điểm nằm trong khoảng từ 0 đến 10", "Cảnh báo");
                }
                else if(insertDiem(bd)){
                    DataMessageDialog.showMessageDialog(parentForm, "Lưu bảng điểm thành công", "Thông báo");
                }
                else{
                    DataMessageDialog.showMessageDialog(parentForm, "Lưu bảng điểm thất bại", "Thông báo");
                }
            }
            ViewDiem();
        } catch (Exception e) {
            e.printStackTrace();
            DataMessageDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton_luuActionPerformed

    private void jTextField_maSVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_maSVFocusLost
        try {
            QLSVPannel ql = new QLSVPannel();
            Student st = ql.findByID(jTextField_maSV.getText());
            if(st != null){
                jTextField_hoTen.setText(st.getHoTen());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField_maSVFocusLost

    private void jTextField_lapTrinhCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_lapTrinhCFocusLost
        if(jTextField_lapTrinhC.getText().equals("") || jTextField_pyThon.getText().equals("") || jTextField_java.getText().equals("")){
            return;
        }
        else{
        float laptrinhC = Float.parseFloat(jTextField_lapTrinhC.getText());
        float python = Float.parseFloat(jTextField_pyThon.getText());
        float java = Float.parseFloat(jTextField_java.getText());
        
        float dtb = (laptrinhC + python + java)/3;
        
        String str = String.format("%.2f", dtb);
        jLabel_DTB.setText(str);
        }
        
    }//GEN-LAST:event_jTextField_lapTrinhCFocusLost

    private void jButton_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_timKiemActionPerformed
        try {
            BangDiem bd = findByID(jTextField_TimMaSV.getText());
            if(bd != null){
                jTextField_maSV.setText(bd.getMaSV());
                jTextField_lapTrinhC.setText(String.format("%.2f", bd.getLapTrinhC()));
                jTextField_pyThon.setText(String.format("%.2f", bd.getPython()));
                jTextField_java.setText(String.format("%.2f", bd.getJava()));
                jTextField_maSVFocusLost(null);
                jTextField_lapTrinhCFocusLost(null);
            }
            else{
                DataMessageDialog.showMessageDialog(parentForm, "Không tìm thấy dữ liệu", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            DataMessageDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton_timKiemActionPerformed

    private void jButton_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_capNhatActionPerformed
        jButton_luuActionPerformed(evt);
    }//GEN-LAST:event_jButton_capNhatActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        try {
            if(jTextField_TimMaSV.getText().equals("")){
                DataMessageDialog.showMessageDialog(parentForm, "Vui lòng nhập mã sinh viên", "Thông báo");
                return;
            }
            BangDiem bd = findByID(jTextField_TimMaSV.getText());
            if(bd == null){
                DataMessageDialog.showMessageDialog(parentForm, "Sinh viên không tồn tại trong bảng điểm", "Thông báo");
                return;
            }
            if(DataMessageDialog.showConfirmDialog(parentForm, "Bạn có muốn xoá điểm không ", "Xác nhận") == JOptionPane.NO_OPTION){
                return;
            }
            if(deleteDiem(jTextField_TimMaSV.getText())){
                DataMessageDialog.showMessageDialog(parentForm, "Xoá điểm của sinh viên thành công", "Thông báo");    
            }
            else{
                DataMessageDialog.showMessageDialog(parentForm, "Xoá điểm của sinh viên thất bại", "Thông báo");    
            }
            ViewDiem();
        } catch (Exception e) {
            e.printStackTrace();
            DataMessageDialog.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed
     // thêm thông tin vào sql
    public boolean insertDiem(BangDiem bd) throws Exception{
        
        String sql ="insert into BangDiem([MaSV],[LapTrinhC],[Python],[Java] ) values (?,?,?,?)";
        try (Connection ketNoi = DataSQL.openConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);){ 
            ps.setString(1, bd.getMaSV());
            ps.setFloat(2, bd.getLapTrinhC());
            ps.setFloat(3, bd.getPython());
            ps.setFloat(4, bd.getJava());  
            return ps.executeUpdate() > 0;
        } 
    }
     // cập nhật thông tin vào sql
    public boolean updateDiem(BangDiem bd) throws Exception{
        
        String sql ="update BangDiem set LapTrinhC = ? , Python = ?, Java = ? where MaSV = ?";
        try (Connection ketNoi = DataSQL.openConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);){ 
            ps.setString(4, bd.getMaSV());
            ps.setFloat(1, bd.getLapTrinhC());
            ps.setFloat(2, bd.getPython());
            ps.setFloat(3, bd.getJava());  
            return ps.executeUpdate() > 0;
        } 
    }// xoá thông tin vào sql
    public boolean deleteDiem(String maSV) throws Exception{
        String sql ="delete from BangDiem where MaSV = ?";
        try (Connection ketNoi = DataSQL.openConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);){ 
            ps.setString(1, maSV);  
            return ps.executeUpdate() > 0;
        } 
    }
    public void ViewDiem(){
        DefaultTableModel model = (DefaultTableModel) jTable_bangDiem.getModel();
        model.setNumRows(0);
        Connection ketNoi = DataSQL.openConnection();        
        String sql ="select * from BangDiem";
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vt = new Vector();
                vt.add(rs.getString("MaSV"));
                vt.add(rs.getString("LapTrinhC"));
                vt.add(rs.getString("Python"));
                vt.add(rs.getString("Java"));
                vt.add((rs.getFloat("LapTrinhC") + rs.getFloat("Python") +rs.getFloat("Java"))/3 );
                model.addRow(vt);
            }
            jTable_bangDiem.setModel(model);
            rs.close();
            ps.close();
            ketNoi.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    //Tìm kiếm sinh viên
    public BangDiem findByID(String maSV){
        String sql = "select * from BangDiem where maSV = ?";      
        try {
            Connection ketNoi = DataSQL.openConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maSV);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                BangDiem bd =new BangDiem();
                bd.setMa(rs.getInt("Ma"));
                bd.setMaSV(rs.getString("MaSV"));
                bd.setLapTrinhC(rs.getFloat("LapTrinhC"));
                bd.setPython(rs.getFloat("Python"));
                bd.setJava(rs.getFloat("Java"));
                return bd;
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        // Tìm kiếm SV
    public Student findByIDfromSinhVien(String maSV){
        String sql = "select * from SinhVien where maSV = ?";      
        try {
            Connection ketNoi = DataSQL.openConnection();
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maSV);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Student st = new Student();
                st.setMaSV(rs.getString("MaSV"));
                st.setHoTen(rs.getString("HoTen"));
                st.setEmail(rs.getString("Email"));
                st.setSoDT(rs.getString("SDT"));
                st.setGioiTinh(rs.getString("GioiTinh"));
                st.setQueQuan(rs.getString("QueQuan"));
                Blob blob = rs.getBlob("Hinh");
                if(blob != null)
                    st.setHinh(blob.getBytes(1, (int) blob.length()));
                return st;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JButton jButton_capNhat;
    private javax.swing.JButton jButton_luu;
    private javax.swing.JButton jButton_nhapMoi;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_DTB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_bangDiem;
    private javax.swing.JTextField jTextField_TimMaSV;
    private javax.swing.JTextField jTextField_hoTen;
    private javax.swing.JTextField jTextField_java;
    private javax.swing.JTextField jTextField_lapTrinhC;
    private javax.swing.JTextField jTextField_maSV;
    private javax.swing.JTextField jTextField_pyThon;
    // End of variables declaration//GEN-END:variables
}
