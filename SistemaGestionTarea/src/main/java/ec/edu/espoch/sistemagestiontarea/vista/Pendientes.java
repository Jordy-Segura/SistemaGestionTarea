/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espoch.sistemagestiontarea.vista;

import ec.edu.espoch.sistemagestiontarea.controlador.Controlador;
import ec.edu.espoch.sistemagestiontarea.modelo.Tarea;


/**
 *
 * @author papel
 */
public class Pendientes extends javax.swing.JFrame {
    private Controlador controlador;
    /**
     * Creates new form Pendientes
     */
    public Pendientes() {
        initComponents();
    }
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuTareas = new javax.swing.JMenu();
        mItemNueva = new javax.swing.JMenuItem();
        mIPendientes = new javax.swing.JMenuItem();
        mICompletas = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        menuItemCerrar = new javax.swing.JMenuItem();
        lbdTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuTareas1 = new javax.swing.JMenu();
        mItemNueva1 = new javax.swing.JMenuItem();
        mIPendientes1 = new javax.swing.JMenuItem();
        mICompletas1 = new javax.swing.JMenuItem();
        MenuSalir1 = new javax.swing.JMenu();
        menuItemCerrar1 = new javax.swing.JMenuItem();

        MenuTareas.setText("Tarea");

        mItemNueva.setText("Nueva");
        mItemNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemNuevaActionPerformed(evt);
            }
        });
        MenuTareas.add(mItemNueva);

        mIPendientes.setText("Pendientes");
        MenuTareas.add(mIPendientes);

        mICompletas.setText("Completas");
        MenuTareas.add(mICompletas);

        jMenuBar1.add(MenuTareas);

        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });

        menuItemCerrar.setText("Cerrar");
        menuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarActionPerformed(evt);
            }
        });
        MenuSalir.add(menuItemCerrar);

        jMenuBar1.add(MenuSalir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbdTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbdTitulo.setText("TAREAS PENDIENTES");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        MenuTareas1.setText("Tarea");

        mItemNueva1.setText("Nueva");
        mItemNueva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemNueva1ActionPerformed(evt);
            }
        });
        MenuTareas1.add(mItemNueva1);

        mIPendientes1.setText("Pendientes");
        mIPendientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIPendientes1ActionPerformed(evt);
            }
        });
        MenuTareas1.add(mIPendientes1);

        mICompletas1.setText("Completas");
        mICompletas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mICompletas1ActionPerformed(evt);
            }
        });
        MenuTareas1.add(mICompletas1);

        jMenuBar2.add(MenuTareas1);

        MenuSalir1.setText("Salir");
        MenuSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalir1ActionPerformed(evt);
            }
        });

        menuItemCerrar1.setText("Cerrar");
        menuItemCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrar1ActionPerformed(evt);
            }
        });
        MenuSalir1.add(menuItemCerrar1);

        jMenuBar2.add(MenuSalir1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lbdTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbdTitulo)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemNuevaActionPerformed
        // TODO add your handling code here:
        Interfaz obInterfaz = new Interfaz();
        obInterfaz.setVisible(true);
        obInterfaz.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mItemNuevaActionPerformed

    private void menuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuSalirActionPerformed

    private void mItemNueva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemNueva1ActionPerformed
        // TODO add your handling code here:
        Interfaz obInterfaz = new Interfaz();
        obInterfaz.setVisible(true);
        obInterfaz.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mItemNueva1ActionPerformed

    private void menuItemCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrar1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuItemCerrar1ActionPerformed

    private void MenuSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalir1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuSalir1ActionPerformed

    private void mIPendientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIPendientes1ActionPerformed
        // TODO add your handling code here:
        Pendientes objPendientes = new Pendientes();
        objPendientes.setVisible(true);
        objPendientes.setLocationRelativeTo(null);
        this.dispose();
        
        controlador.agregarTarea();
        controlador.obtenerTareasPendientes();

    }//GEN-LAST:event_mIPendientes1ActionPerformed

    private void mICompletas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mICompletas1ActionPerformed
        // TODO add your handling code here:
        Completas objCompletas = new Completas();
        objCompletas.setVisible(true);
        objCompletas.setLocationRelativeTo(null);
        this.dispose();
              
    }//GEN-LAST:event_mICompletas1ActionPerformed
    
    private void mostrarTareas(String[] tareas) {
        StringBuilder sb = new StringBuilder();
        for (String tarea : tareas) {
            if (tarea != null) {
                sb.append(tarea).append("\n\n");
            }
        }
        jTextArea1.setText(sb.toString());
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenu MenuSalir1;
    private javax.swing.JMenu MenuTareas;
    private javax.swing.JMenu MenuTareas1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbdTitulo;
    private javax.swing.JMenuItem mICompletas;
    private javax.swing.JMenuItem mICompletas1;
    private javax.swing.JMenuItem mIPendientes;
    private javax.swing.JMenuItem mIPendientes1;
    private javax.swing.JMenuItem mItemNueva;
    private javax.swing.JMenuItem mItemNueva1;
    private javax.swing.JMenuItem menuItemCerrar;
    private javax.swing.JMenuItem menuItemCerrar1;
    // End of variables declaration//GEN-END:variables


}
