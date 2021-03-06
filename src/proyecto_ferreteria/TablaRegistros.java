package proyecto_ferreteria;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Equipo Potaxie
 */
public class TablaRegistros extends javax.swing.JFrame {

    private static final int MODIFICACION_SIN_EXITO = 0;
    private static final int ELIMINACION_SIN_EXITO = 0;
    
    public TablaRegistros() {
        initComponents();
        jButtonEliminar.setVisible(false);
        jButtonModificar.setVisible(false);
        obtenerPedidos();
        ocultarColumna();
    }
    
    public TablaRegistros(int idPedido) {
        initComponents();
        obtenerPedidos(idPedido);
        ocultarColumna();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jLabelnomProductos = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros");

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fila", "num. Pedido", "Producto", "Cantidad", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRegistros);
        if (jTableRegistros.getColumnModel().getColumnCount() > 0) {
            jTableRegistros.getColumnModel().getColumn(0).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jLabelnomProductos.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabelnomProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelnomProductos.setText("Productos");

        jButtonModificar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro de los pedidos guardados");

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(148, 148, 148))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelnomProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelnomProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonEliminar, jButtonModificar});

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Ferreter??a M??xico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "??Est?? seguro de eliminar el pedido?", "Eliminar pedido", JOptionPane.YES_NO_OPTION);
        
        if( opcion == JOptionPane.NO_OPTION )
            return;
        
        //Llamar al m??todo para eliminar todos los productos con ese id
        String idPedido = jTableRegistros.getValueAt(0, 0).toString();
        
        if( eliminarPedido(idPedido) == ELIMINACION_SIN_EXITO ) {
            JOptionPane.showMessageDialog(this, "Lo sentimos ha ocurrido un problema al eliminar el pedido.");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "El pedido ha sido eliminado con ??xito");
        this.dispose();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Conexion conexion = new Conexion();
        int filas = 0;
        
        for( int i=0 ; i<jTableRegistros.getRowCount() ; i++ ) {
            try {
                String sql = "UPDATE productos "
                           + "SET Id = '"+jTableRegistros.getValueAt(i, 1)+"', "
                               + "Nombre = '"+jTableRegistros.getValueAt(i, 2)+"', "
                               + "Cantidad = '"+jTableRegistros.getValueAt(i, 3)+"', "
                               + "Tipo = '"+jTableRegistros.getValueAt(i, 4)+"' "
                           + "WHERE Fila = '"+jTableRegistros.getValueAt(i, 0)+"'";
                System.out.println("SQL: " + sql);
                filas =+ conexion.sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(TablaRegistros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if( filas == MODIFICACION_SIN_EXITO ) {
            JOptionPane.showMessageDialog(this, "Lo sentimos, ha ocurrido un problema al actualizar el pedido");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "El pedido se ha actualizado con ??xito");
        this.dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void obtenerPedidos() {
        Conexion conexion = new Conexion();
        DefaultTableModel modelo;
        
        String sql = "SELECT * "
                   + "FROM `productos` ";
        
        try {
            conexion.resultSet = conexion.sentencia.executeQuery(sql);
            Object[] pedido = new Object[5];
            modelo = (DefaultTableModel)jTableRegistros.getModel();
            try {
                while(conexion.resultSet.next()){
                    pedido[0] = conexion.resultSet.getInt("Fila");
                    pedido[1] = conexion.resultSet.getInt("Id");
                    pedido[2] = conexion.resultSet.getString("Nombre");
                    pedido[3] = conexion.resultSet.getString("Cantidad");
                    pedido[4] = conexion.resultSet.getString("Tipo");
                    modelo.addRow(pedido);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
            jTableRegistros.setModel(modelo);
            conexion.conexion.close();
        }catch(SQLException e){
            System.err.println("Error: " + e);
        }
    }
    
    private void obtenerPedidos(int idPedido) {
        Conexion conexion = new Conexion();
        DefaultTableModel modelo;
        
        String sql = "SELECT * "
                   + "FROM `productos` " 
                   + "WHERE Id = '"+idPedido+"'";
        
        try {
            conexion.resultSet = conexion.sentencia.executeQuery(sql);
            Object[] pedido = new Object[5];
            modelo = (DefaultTableModel)jTableRegistros.getModel();
            try {
                while(conexion.resultSet.next()){
                    pedido[0] = conexion.resultSet.getInt("Fila");
                    pedido[1] = conexion.resultSet.getInt("Id");
                    pedido[2] = conexion.resultSet.getString("Nombre");
                    pedido[3] = conexion.resultSet.getString("Cantidad");
                    pedido[4] = conexion.resultSet.getString("Tipo");
                    modelo.addRow(pedido);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
            jTableRegistros.setModel(modelo);
            conexion.conexion.close();
        }catch(SQLException e){
            System.err.println("Error: " + e);
        }
    }
   
    private int eliminarPedido(String idPedido) {
        Conexion conexion = new Conexion();
        int filas = 0;
        
        String sql = "DELETE "
                   + "FROM productos "
                   + "WHERE Id = '"+idPedido+"'";
        
        try {
            filas = conexion.sentencia.executeUpdate(sql);
            conexion.conexion.close();
        }catch(SQLException e){
            System.err.println("Error: " + e);
        }
        
        return filas;
    }
    
    private void ocultarColumna() {
        jTableRegistros.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableRegistros.getColumnModel().getColumn(0).setMinWidth(0);
        jTableRegistros.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelnomProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistros;
    // End of variables declaration//GEN-END:variables
}
