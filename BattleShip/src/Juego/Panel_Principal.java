package Juego;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author keneth
 */

public final class Panel_Principal extends javax.swing.JFrame {

    static boolean paso = false;
    static JPanel currentPanel;

    public Panel_Principal() {
        initComponents();
        setIconImage(getlconlmage());

        if (paso == false) {
            ShowPanel(Ingreso_Nombres);
            System.out.println("paso = " + paso);
            paso = true;
        }
        System.out.println("paso = " + paso);

    }
    Ingreso_Nombres Ingreso_Nombres = new Ingreso_Nombres();

    public static boolean Bien_Ingre;

    public void ingreso_Nombres_Ok(boolean Bien_Ingresado) {
        this.Bien_Ingre = Bien_Ingresado;
    }

    public static void ShowPanel(JPanel p) {
        if (p != null) {
            currentPanel = p; // Guarda el panel actual
            p.setSize(800, 500);
            p.setLocation(0, 0);

            Fondo_Cambiable.removeAll();
            Fondo_Cambiable.add(p, BorderLayout.CENTER);
            Fondo_Cambiable.revalidate();
            Fondo_Cambiable.repaint();
        }
    }

    public static JPanel getCurrentPanel() {
        return currentPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        MinimizarBtn = new javax.swing.JPanel();
        MinimizarTxt = new javax.swing.JLabel();
        Fondo_Cambiable = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 530));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setRequestFocusEnabled(false);
        BG.setVerifyInputWhenFocusTarget(false);
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitBtn.setBackground(new java.awt.Color(255, 255, 255));

        ExitTxt.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
        ExitBtn.setLayout(ExitBtnLayout);
        ExitBtnLayout.setHorizontalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitBtnLayout.setVerticalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitBtnLayout.createSequentialGroup()
                .addComponent(ExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Barra.add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        MinimizarBtn.setBackground(new java.awt.Color(255, 255, 255));

        MinimizarTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        MinimizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizarTxt.setText("—");
        MinimizarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimizarTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MinimizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MinimizarBtnLayout = new javax.swing.GroupLayout(MinimizarBtn);
        MinimizarBtn.setLayout(MinimizarBtnLayout);
        MinimizarBtnLayout.setHorizontalGroup(
            MinimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MinimizarTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        MinimizarBtnLayout.setVerticalGroup(
            MinimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MinimizarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Barra.add(MinimizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        BG.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        Fondo_Cambiable.setBackground(new java.awt.Color(0, 255, 0));
        Fondo_Cambiable.setLayout(new java.awt.BorderLayout());
        BG.add(Fondo_Cambiable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int XMouse, YMouse;

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        ExitBtn.setBackground(Color.red);
        ExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
        ExitBtn.setBackground(Color.white);
        ExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void MinimizarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarTxtMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizarTxtMouseClicked


    private void MinimizarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarTxtMouseEntered
        MinimizarBtn.setBackground(Color.decode("#eeeeee"));
    }//GEN-LAST:event_MinimizarTxtMouseEntered

    private void MinimizarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarTxtMouseExited
        MinimizarBtn.setBackground(Color.white);
    }//GEN-LAST:event_MinimizarTxtMouseExited

    public Image getlconlmage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel ExitTxt;
    private static javax.swing.JPanel Fondo_Cambiable;
    private javax.swing.JPanel MinimizarBtn;
    private javax.swing.JLabel MinimizarTxt;
    // End of variables declaration//GEN-END:variables
}
