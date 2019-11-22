
package controlasistencias;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;


public class registroUsuarios extends javax.swing.JFrame {

   
    public static String ruta = "";
    
    
    public registroUsuarios() {
        initComponents();
        this.setSize(700,460);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cargarCombo();
        
    }
    
    
    public void cargarCombo(){
    
         cmbCarrera.addItem("---Seleccionar---");
         cmbCarrera.addItem("Tecnologias Computacionales");
         cmbCarrera.addItem("Ingenieria de Software");
         cmbCarrera.addItem("Redes y Servicios de Computo");
    
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        pixel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtHora = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 25));

        txtMatricula.setFont(new java.awt.Font("Leelawadee UI", 0, 17)); // NOI18N
        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatricula.setBorder(null);
        txtMatricula.setMargin(new java.awt.Insets(1, 2, 2, 2));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 300, 30));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtNombre.setFont(new java.awt.Font("Leelawadee UI", 0, 17)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        txtNombre.setMargin(new java.awt.Insets(0, 2, 4, 2));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 300, 30));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Matricula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Carrera:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("tu servicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, 20));

        cmbCarrera.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        cmbCarrera.setBorder(null);
        getContentPane().add(cmbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 300, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backend.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        lblFoto.setForeground(new java.awt.Color(204, 204, 204));
        lblFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 200, 200));

        pixel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pixel.setForeground(new java.awt.Color(255, 255, 255));
        pixel.setText("200 x 200 px");
        getContentPane().add(pixel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camera.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 30, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton2.setText("REGISTRAR");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setMargin(new java.awt.Insets(1, 2, 2, 5));
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 160, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/browser.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 30, 30));

        txtHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHora.setBorder(null);
        txtHora.setPreferredSize(new java.awt.Dimension(25, 15));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 100, 30));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Horas de ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 20));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Completa el siguiente formulario con tus datos.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FOTO ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 40, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avataruser.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -60, 380, 350));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarImagen(String path){
                
                ruta = path;
                ImageIcon icon = new ImageIcon(ruta);
                lblFoto.setIcon(icon);
    
    
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            String path2 = new File(".").getCanonicalPath();
            JFileChooser fileChooser = new JFileChooser(path2+"/src/avatars/");
            
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                
                File selectedFile = fileChooser.getSelectedFile();
                ruta = "/src/avatars/"+selectedFile.getName();
                System.out.println(ruta);
                ImageIcon icon = new ImageIcon(path2+ruta);
                lblFoto.setIcon(icon);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(registroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        
        
        Connection con = null;
        String pathAux = "";
        
        
        if(cmbCarrera.getSelectedIndex()== 0 || txtHora.getValue().equals("") || txtMatricula.getText().equals("") || txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay campos vacios o no haz seleccionado alguna carrera ", "CAMPOS VACIOS", JOptionPane.WARNING_MESSAGE);
            
        
        
        }else{
          try {
            pathAux = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(registroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            
            con = conexionDB.getConection();
            PreparedStatement ps;
            int value = (Integer) txtHora.getValue();
            ps = con.prepareStatement("INSERT INTO alumno (Matricula,Nombre,Carrera,HorasTotales,Imagen) VALUES(?,?,?,?,?)");
            ps.setString(1, txtMatricula.getText());
            ps.setString(2, txtNombre.getText());
            
            ps.setString(3,cmbCarrera.getSelectedItem().toString());
            
           ps.setString(4, String.valueOf(value));
            
            if(ruta.equals("")){
            ps.setString(5,"/src/avatars/PC.jpg" );
            
            }else{
            ps.setString(5,ruta);
            
            }
            
           
            
            int res = ps.executeUpdate();
            
            
            
            if(res > 0 ){
                JOptionPane.showMessageDialog(null, "Te haz registrado exitosamente");
                limpiarRegistro();
                
                
            }else{
                JOptionPane.showMessageDialog(null, res, "Error al guardar los datos revise la conexion con la base de datos", JOptionPane.ERROR_MESSAGE);
               
                
           
            }
            
            con .close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos o ingreso datos incorrectos error: "+e.getMessage());
        }
        
        }
        
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        video v = new video();
        v.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        menuPrincipal mp = new menuPrincipal();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public void limpiarRegistro(){
    
            txtNombre.setText("");
            txtMatricula.setText("");
            txtHora.setValue(0);
            cmbCarrera.setSelectedIndex(0);
            lblFoto.setIcon(null);
    
    }
    
    
    public static void main(String args[]) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel lblFoto;
    private javax.swing.JLabel pixel;
    private javax.swing.JSpinner txtHora;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
