
package controlasistencias;


import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import static controlasistencias.registroUsuarios.ruta;
import java.awt.Color;
import java.awt.Dimension;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;       
import org.opencv.videoio.VideoCapture; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;

public class video extends javax.swing.JFrame {
    
   private DaemonThread myThread = null;
    int count = 0;
    VideoCapture webSource = null;
    Mat frame = new Mat();
    MatOfByte mem = new MatOfByte();
    
    public static String rutaphoto = "";

  
    public video() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(490, 340);
        btnStart.doClick();
        btnStart.setEnabled(false);
        panelVideo.setSize(200,200);
        btnSave.setEnabled(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        panelVideo = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnStart.setText("CANCELAR");
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.setFocusPainted(false);
        btnStart.setFocusable(false);
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setMargin(new java.awt.Insets(1, 10, 2, 10));
        btnStart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 70));

        btnStop.setForeground(new java.awt.Color(255, 255, 255));
        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Shot.png"))); // NOI18N
        btnStop.setText("CAPTURAR");
        btnStop.setBorderPainted(false);
        btnStop.setContentAreaFilled(false);
        btnStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop.setFocusPainted(false);
        btnStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStop.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnStop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, 70));

        panelVideo.setBackground(new java.awt.Color(255, 255, 255));
        panelVideo.setPreferredSize(new java.awt.Dimension(500, 600));

        javax.swing.GroupLayout panelVideoLayout = new javax.swing.GroupLayout(panelVideo);
        panelVideo.setLayout(panelVideoLayout);
        panelVideoLayout.setHorizontalGroup(
            panelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        panelVideoLayout.setVerticalGroup(
            panelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(panelVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, 200));

        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusPainted(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setMargin(new java.awt.Insets(1, 10, 1, 10));
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 60, 70));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       webSource =new VideoCapture(0);
            myThread = new DaemonThread();
            Thread t = new Thread(myThread);
            t.setDaemon(true);
            myThread.runnable = true;
            t.start();
            btnStart.setEnabled(false);  //start button
            btnStop.setEnabled(true);  // stop button
            btnSave.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
           myThread.runnable = false;
            btnStop.setEnabled(false);   
            btnStart.setEnabled(true);
            btnSave.setEnabled(true);
            webSource.release();
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
         rutaphoto = java.util.UUID.randomUUID().toString();   
         
         String f = "src/usersphotos/"+rutaphoto+".jpg";
            
            
            Rect rectCrop = new Rect(230, 100, 200, 200);
            Mat image_output= frame.submat(rectCrop);
        
        
             Imgcodecs imageCodecs = new Imgcodecs();
             imageCodecs.imwrite(f, image_output);
             JOptionPane.showMessageDialog(null,"Imagen cargada");
             registroUsuarios.ruta = f;
             ImageIcon icon = new ImageIcon(f);
             registroUsuarios.lblFoto.setIcon(icon);
             this.dispose();
            
    
      
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    
    class DaemonThread implements Runnable
    {
    protected volatile boolean runnable = false;

    @Override
    public  void run()
    {
        synchronized(this)
        {
            while(runnable)
            {
                if(webSource.grab())
                {
		    	try
                        {
                            File salida= new File("imagen.png");
                            webSource.retrieve(frame);
			    Imgcodecs.imencode(".bmp", frame, mem);
			    Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));

			    BufferedImage buff = (BufferedImage) im;
			    Graphics2D g=(Graphics2D) panelVideo.getGraphics();
                            
			    if (g.drawImage(buff, 0, 0, getWidth(), getHeight() , 230, 100, buff.getWidth(), buff.getHeight(), null))
			    
                             ImageIO.write((RenderedImage) g, "png", salida);
			    if(runnable == false)
                            {
			    	
			    	this.wait();
			    }
			 }
			 catch(Exception ex)
                         {
			   
                         }
                }
            }
        }
     }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
       // System.load("C:/opencv/build/java/x64/opencv_java411.dll");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video().setVisible(true);
                 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelVideo;
    // End of variables declaration//GEN-END:variables
}
