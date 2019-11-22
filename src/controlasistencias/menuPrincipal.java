
package controlasistencias;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;


public class menuPrincipal extends javax.swing.JFrame implements Runnable{

   int hora, minutos, segundos;
    Calendar calendario;
    Thread h1;
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    public String nombre = "";
    public String matricula = "";
    public String carrera = "";
    public int id = 0;
    public String horas = "";
    public String ruta = "";
    
    
    
    
    public menuPrincipal() {
        this.setUndecorated(true);
        initComponents();
        this.setSize(800,600);
        txtMatricula.setMargin(new Insets(0, 10, 0, 10));
        h1 = new Thread(this);
        h1.start();
        AWTUtilities.setWindowOpaque(this, false);
        txtMatricula.requestFocus();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
    }

    public void calcula() {
        
        Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("X");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pc1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, 150, -1));

        lblClock.setFont(new java.awt.Font("Rockwell", 0, 140)); // NOI18N
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 580, 150));

        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 45)); // NOI18N
        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatricula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), null));
        txtMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMatricula.setMargin(new java.awt.Insets(0, 5, 5, 0));
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyReleased(evt);
            }
        });
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 320, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 50, 50));

        btnAdmin.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        btnAdmin.setText("ADMINISTRAR");
        btnAdmin.setBorderPainted(false);
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setFocusPainted(false);
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 170, 40));

        btnRegistrar.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adduser.png"))); // NOI18N
        btnRegistrar.setText("REGISTRARSE");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 170, 40));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MATRICULA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CENTRO DE COMPUTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 550, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 21, 21));
        jLabel3.setText("Control de asistencias");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 420, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 730, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        this.dispose();
        registroUsuarios ru = new registroUsuarios();
        ru.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
            Connection con = null;
            
            
            
            if(txtMatricula.getText().equals("")){
             JOptionPane.showMessageDialog(null, "DEBE INGRESAR UNA MATRICULA");
            
            }else{
            con = conexionDB.getConection();
            matricula = txtMatricula.getText();
            
            try{
            String consultar="SELECT * FROM alumno WHERE Matricula ='"+matricula+"'";
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(consultar);
            
            
            if(rs.last()){
           
                id = rs.getInt("idAlumno");
                matricula=rs.getString("Matricula");
                nombre=rs.getString("Nombre");
                carrera=rs.getString("Carrera");
                horas = rs.getString("HorasTotales");
                ruta = rs.getString("Imagen");
          
            
             
             System.out.println("Datos: "+id+","+matricula+","+nombre+","+carrera+","+horas+","+ruta);
             this.dispose();
             registroAsistencia ra = new registroAsistencia(nombre, matricula, carrera, horas, hora,ruta);
             ra.setVisible(true);
             
            
            }else{
            
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGÚN REGISTRO CON ESA MATRICULA");
            }
           
            
            
            
          
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra");
            
        }
            
            
            }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyReleased
        int code = evt.getKeyCode();
        
        if(code == KeyEvent.VK_ENTER && txtMatricula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UNA MATRICULA");
            
         
        
        }else if(code == KeyEvent.VK_ENTER && txtMatricula.getText() != ""){
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtMatriculaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    public static javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblClock;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            
            
            lblClock.setText(String.format("%02d:%02d:%02d", hora,minutos,segundos));
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
