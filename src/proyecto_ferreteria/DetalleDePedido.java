/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_ferreteria;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author victo
 */
public class DetalleDePedido extends javax.swing.JFrame {

    Conexion con = new Conexion();
    private int idPedido = 1;

    
    public static DefaultTableModel modelo2;
    public DetalleDePedido() {
        initComponents();
        this.setLocationRelativeTo(null); 
        modelo2=new DefaultTableModel();
        modelo2.addColumn("nombre");
        modelo2.addColumn("Tipo");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Proveedor");
        modelo2.addColumn("Sucural");
        
        JTDetallesPedidos.setModel(modelo2);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDetallesPedidos = new javax.swing.JTable();
        jbConfirmarPedido = new javax.swing.JButton();
        jbCancelarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        JTDetallesPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Cantidad", "Proveedor", "Sucursal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTDetallesPedidos);

        jbConfirmarPedido.setText("Confirmar Pedido");
        jbConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarPedidoActionPerformed(evt);
            }
        });

        jbCancelarPedido.setText("Cancelar Pedido");
        jbCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbCancelarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConfirmarPedido))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbCancelarPedido, jbConfirmarPedido});

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalles del Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public java.sql.Connection conexion;
 
    private void jbConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarPedidoActionPerformed
        if(JTDetallesPedidos.getRowCount()>0){
            obtenerUltimoId();
            for (int i = 0; i < JTDetallesPedidos.getRowCount(); i++) {
                try {
                    con.sentencia.execute("INSERT INTO productos(Id, Nombre, Tipo, Cantidad, Proveedor, Sucursal) "
                            + "VALUES('"+getIdPedido()+"'"
                                    + ", '"+ JTDetallesPedidos.getValueAt(i, 0)+"' "
                                    + ", '"+ JTDetallesPedidos.getValueAt(i, 1)+"'"
                                    + ", '"+ JTDetallesPedidos.getValueAt(i, 2)+"'"
                                    + ", '"+ JTDetallesPedidos.getValueAt(i, 3)+"'"
                                    + ", '"+ JTDetallesPedidos.getValueAt(i, 4)+"')");
                } catch (SQLException ex) {
                    Logger.getLogger(DetalleDePedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(this, "Muy bien, el pedido se ha realizado con exito");
        }else{
            JOptionPane.showMessageDialog(this, "la tabla se encuentra vacía");
        }
       this.dispose();
    }//GEN-LAST:event_jbConfirmarPedidoActionPerformed

    private int obtenerUltimoId() {
        Conexion conexion = new Conexion();
        try {
            String sql = "SELECT Id FROM productos;";

            conexion.resultSet = conexion.sentencia.executeQuery("SELECT Id FROM productos;");
            while( conexion.resultSet.next() ) {
                idPedido = conexion.resultSet.getInt("Id") + 1;
            }
        } catch (SQLException ex) {
            System.out.println("DetallePedido::obtenerUltimoId -> " + ex);
        }
        return 0;
    }
    
    private void jbCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarPedidoActionPerformed
        JOptionPane.showMessageDialog(null,"El pedido ha sido cancelado");
        this.dispose();
    }//GEN-LAST:event_jbCancelarPedidoActionPerformed

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTDetallesPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelarPedido;
    private javax.swing.JButton jbConfirmarPedido;
    // End of variables declaration//GEN-END:variables
}
