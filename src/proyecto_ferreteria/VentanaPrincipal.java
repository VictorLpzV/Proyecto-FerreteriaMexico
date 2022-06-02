/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_ferreteria;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    DetalleDePedido ventanaInfo = new DetalleDePedido();
    DefaultTableModel modelo;
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Sucursal");
        JTDetallesProductos.setModel(modelo);
        
      
    }
    public void nuevatabla(){
        //limpiamos tabla
        modelo=new DefaultTableModel();
        JTDetallesProductos.setModel(modelo);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProveedores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbTipoProducto = new javax.swing.JLabel();
        lbCantidadProducto = new javax.swing.JLabel();
        jlProveedor = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jcTipoProducto = new javax.swing.JComboBox<>();
        jtCantidadProducto = new javax.swing.JTextField();
        jrbProveedor1 = new javax.swing.JRadioButton();
        jrbProveedor2 = new javax.swing.JRadioButton();
        jrbProveedor3 = new javax.swing.JRadioButton();
        jrbProveedor4 = new javax.swing.JRadioButton();
        jchSucursal1 = new javax.swing.JCheckBox();
        jchSucursal2 = new javax.swing.JCheckBox();
        lpTitAgregarProductos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDetallesProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbNombre.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbNombre.setText("Nombre:");

        lbTipoProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbTipoProducto.setText("Tipo:");

        lbCantidadProducto.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbCantidadProducto.setText("Cantidad:");

        jlProveedor.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jlProveedor.setText("Proveedor");

        lbSucursal.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbSucursal.setText("Sucursal");

        jcTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de producto", "Herramientas para el hogar", "electrónica", "accesorios para baño", "accesorios para jardín", " " }));

        jtCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadProductoKeyTyped(evt);
            }
        });

        bgProveedores.add(jrbProveedor1);
        jrbProveedor1.setText("TRUPER");

        bgProveedores.add(jrbProveedor2);
        jrbProveedor2.setText("HELVEX");

        bgProveedores.add(jrbProveedor3);
        jrbProveedor3.setText("PIMSA");

        bgProveedores.add(jrbProveedor4);
        jrbProveedor4.setText("INFRA");

        jchSucursal1.setText("Coatzacoalcos");

        jchSucursal2.setText("Minatitlán");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlProveedor)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTipoProducto)
                                    .addComponent(lbNombre))
                                .addComponent(lbCantidadProducto)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCantidadProducto)
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcTipoProducto, javax.swing.GroupLayout.Alignment.TRAILING, 0, 195, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jchSucursal1)
                                .addGap(18, 18, 18)
                                .addComponent(jchSucursal2))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jrbProveedor2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbProveedor4))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jrbProveedor1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbProveedor3)))
                            .addComponent(lbSucursal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoProducto)
                    .addComponent(jcTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidadProducto)
                    .addComponent(jtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbProveedor1)
                    .addComponent(jrbProveedor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbProveedor2)
                    .addComponent(jrbProveedor4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchSucursal1)
                    .addComponent(jchSucursal2))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jcTipoProducto, jtCantidadProducto, jtNombre});

        lpTitAgregarProductos.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        lpTitAgregarProductos.setText("Agregar Producto");

        JTDetallesProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTDetallesProductos);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jLabel2.setText("Productos en carrito");

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jbBorrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSalir)
                                        .addGap(29, 29, 29)
                                        .addComponent(jbGuardar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lpTitAgregarProductos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpTitAgregarProductos)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBorrar)
                            .addComponent(jbAgregar)
                            .addComponent(jbGuardar)
                            .addComponent(jButtonSalir))
                        .addGap(26, 26, 26))))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ferretería México");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
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

    private void jtCantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadProductoKeyTyped
         int tecla = evt.getKeyChar();
        boolean numeros = tecla >= 48 && tecla <= 57;
        if(!numeros){
            evt.consume();
        } 
    }//GEN-LAST:event_jtCantidadProductoKeyTyped

    
    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        this.jtNombre.setText("");
        this.jtCantidadProducto.setText(" ");
        this.jcTipoProducto.setSelectedIndex(0);
        this.jchSucursal1.setSelected(false);
        this.jchSucursal2.setSelected(false);
        this.bgProveedores.clearSelection(); 
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        if(jcTipoProducto.getSelectedIndex() ==0 ||jtNombre.getText().equals("") || jtCantidadProducto.getText().equals("") 
                ||!jrbProveedor1.isSelected() && !jrbProveedor2.isSelected() && !jrbProveedor3.isSelected() && !jrbProveedor4.isSelected() 
                ||!jchSucursal1.isSelected() && !jchSucursal2.isSelected()){
            JOptionPane.showMessageDialog(null,"Uno o varios campos siguen vacios, asegurate de llenarlos todos para poder continuar");    
        }
        else{
            DefaultTableModel model = (DefaultTableModel) JTDetallesProductos.getModel();
            Object[] fila = new Object[5];
            fila[0] = jtNombre.getText();
            fila[1] = jcTipoProducto.getSelectedItem().toString();
            fila[2] = jtCantidadProducto.getText();
            fila[3] = agregarProveedor();
            fila[4] = agregarSucursal();
            model.addRow(fila);
            JTDetallesProductos.setModel(model);
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       for(int i=0;i< JTDetallesProductos.getRowCount() ;i++){
           String Datos[] = new String[5];
           Datos[0]= JTDetallesProductos.getValueAt(i, 0).toString();
           Datos[1]= JTDetallesProductos.getValueAt(i, 1).toString();
           Datos[2]= JTDetallesProductos.getValueAt(i, 2).toString();
           Datos[3]= JTDetallesProductos.getValueAt(i, 3).toString();
           Datos[4]= JTDetallesProductos.getValueAt(i, 4).toString();
           ventanaInfo.modelo2.addRow(Datos);
       }
        nuevatabla();
        ventanaInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed
/**/
     private String agregarProveedor() {
        String proveedor = "";
        if (jrbProveedor1.isSelected()) {
            proveedor = "TRUPPER";
        } else if (jrbProveedor2.isSelected()) {
            proveedor = "HELVEX";
        } else if (jrbProveedor3.isSelected()) {
            proveedor = "PIMSA";
        } else if (jrbProveedor4.isSelected()) {
            proveedor = "INFRA";
        }
        return proveedor;
     }
     
      private String agregarSucursal() {
        String sucursal1 = jchSucursal1.getActionCommand();//guardar Sucursal
        String sucursal2 = jchSucursal2.getActionCommand();
       // String sucursal;
        if(jchSucursal1.isSelected()){
            return sucursal1 = sucursal1;
        }else{
           return sucursal2 = sucursal2;
        }          
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTDetallesProductos;
    private javax.swing.ButtonGroup bgProveedores;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcTipoProducto;
    private javax.swing.JCheckBox jchSucursal1;
    private javax.swing.JCheckBox jchSucursal2;
    private javax.swing.JLabel jlProveedor;
    private javax.swing.JRadioButton jrbProveedor1;
    private javax.swing.JRadioButton jrbProveedor2;
    private javax.swing.JRadioButton jrbProveedor3;
    private javax.swing.JRadioButton jrbProveedor4;
    private javax.swing.JTextField jtCantidadProducto;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JLabel lbCantidadProducto;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JLabel lbTipoProducto;
    private javax.swing.JLabel lpTitAgregarProductos;
    // End of variables declaration//GEN-END:variables
}
