/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JMenuItem;


/**
 *
 * @author Edwin
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        ingresarMenuItem = new javax.swing.JMenuItem();
        cerrarSesionMenuItem1 = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        comprarMenu = new javax.swing.JMenu();
        cataloCompraMenuItem = new javax.swing.JMenuItem();
        persoBiciMenuItem = new javax.swing.JMenuItem();
        alquilarMenu = new javax.swing.JMenu();
        cataloAlquilerMenuItem = new javax.swing.JMenuItem();
        copyMenuItem1 = new javax.swing.JMenuItem();
        mantenerMenu = new javax.swing.JMenu();
        soliciMantenMenuItem2 = new javax.swing.JMenuItem();
        compraRepuestoMenuItem2 = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();
        ayudaMenuItem = new javax.swing.JMenuItem();
        acercaDeMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(fondo)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 280);

        archivoMenu.setMnemonic('a');
        archivoMenu.setText("Archivo");

        ingresarMenuItem.setMnemonic('i');
        ingresarMenuItem.setText("Ingresar");
        archivoMenu.add(ingresarMenuItem);

        cerrarSesionMenuItem1.setMnemonic('c');
        cerrarSesionMenuItem1.setText("Cerrar Sesion");
        archivoMenu.add(cerrarSesionMenuItem1);

        salirMenuItem.setMnemonic('s');
        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        archivoMenu.add(salirMenuItem);

        menuBar.add(archivoMenu);

        comprarMenu.setMnemonic('c');
        comprarMenu.setText("Comprar");

        cataloCompraMenuItem.setMnemonic('t');
        cataloCompraMenuItem.setText("Catálogo de biclietas");
        comprarMenu.add(cataloCompraMenuItem);

        persoBiciMenuItem.setMnemonic('p');
        persoBiciMenuItem.setText("Personalizar bicicleta");
        comprarMenu.add(persoBiciMenuItem);

        menuBar.add(comprarMenu);

        alquilarMenu.setMnemonic('l');
        alquilarMenu.setText("Alquilar");

        cataloAlquilerMenuItem.setMnemonic('b');
        cataloAlquilerMenuItem.setText("Catálogo de bicicletas");
        alquilarMenu.add(cataloAlquilerMenuItem);

        copyMenuItem1.setMnemonic('f');
        copyMenuItem1.setText("Facturar");
        alquilarMenu.add(copyMenuItem1);

        menuBar.add(alquilarMenu);

        mantenerMenu.setMnemonic('m');
        mantenerMenu.setText("Mantenimiento");

        soliciMantenMenuItem2.setMnemonic('s');
        soliciMantenMenuItem2.setText("Solicitar Mantenimiento");
        soliciMantenMenuItem2.setToolTipText("");
        mantenerMenu.add(soliciMantenMenuItem2);

        compraRepuestoMenuItem2.setMnemonic('c');
        compraRepuestoMenuItem2.setText("Comprar Repuesto");
        compraRepuestoMenuItem2.setToolTipText("");
        compraRepuestoMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraRepuestoMenuItem2ActionPerformed(evt);
            }
        });
        mantenerMenu.add(compraRepuestoMenuItem2);

        menuBar.add(mantenerMenu);

        ayudaMenu.setMnemonic('u');
        ayudaMenu.setText("Ayuda");

        ayudaMenuItem.setMnemonic('y');
        ayudaMenuItem.setText("Ayuda");
        ayudaMenu.add(ayudaMenuItem);

        acercaDeMenuItem1.setMnemonic('d');
        acercaDeMenuItem1.setText("Acerca de...");
        ayudaMenu.add(acercaDeMenuItem1);

        menuBar.add(ayudaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void compraRepuestoMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraRepuestoMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compraRepuestoMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDeMenuItem1;
    private javax.swing.JMenu alquilarMenu;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JMenuItem ayudaMenuItem;
    private javax.swing.JMenuItem cataloAlquilerMenuItem;
    private javax.swing.JMenuItem cataloCompraMenuItem;
    private javax.swing.JMenuItem cerrarSesionMenuItem1;
    private javax.swing.JMenuItem compraRepuestoMenuItem2;
    private javax.swing.JMenu comprarMenu;
    private javax.swing.JMenuItem copyMenuItem1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuItem ingresarMenuItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mantenerMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem persoBiciMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JMenuItem soliciMantenMenuItem2;
    // End of variables declaration//GEN-END:variables

}
