/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luz Ma
 */
public class Venta extends javax.swing.JFrame {
    DefaultTableModel modelo=new DefaultTableModel();
    private String seleccionar = "Seleccione";
    FondoPanel fondo = new FondoPanel();
    
    /**
     * Creates new form Venta
     */
    public Venta() {
        this.setContentPane(fondo);
        initComponents();
        cargaNombreProd();
        limpia_nom();
        tbl_datos.setModel(modelo);
        String titulo[]={"Nombre","Cantidad","Precio","Precio Total"};
        modelo.setColumnIdentifiers(titulo);
        tbl_datos.getColumnModel().getColumn(0).setPreferredWidth(200);
        
    } 
    private void cargaNombreProd(){
        RegistroStock objReg = new RegistroStock();
        for (Producto nombres: objReg.getProductos()){
            lst_nombres.addItem(nombres.getNombre());   
        }
    }   
    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lst_nombres = new javax.swing.JComboBox<>();
        txt_nombre_pro = new javax.swing.JLabel();
        txt_precio = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        txt_define_valor = new javax.swing.JTextField();
        txt_define_cantidad = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        ir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SubTotal = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        txt_subTotal = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Terminal Punto Venta");
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(153, 0, 0));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        tbl_datos.setBackground(new java.awt.Color(204, 204, 255));
        tbl_datos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Precio Total"
            }
        ));
        tbl_datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tbl_datos);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lst_nombres.setBackground(new java.awt.Color(51, 204, 255));
        lst_nombres.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lst_nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lst_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst_nombresActionPerformed(evt);
            }
        });

        txt_nombre_pro.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txt_nombre_pro.setText("Nombre Producto: ");

        txt_precio.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txt_precio.setText("Precio:");

        txt_cantidad.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txt_cantidad.setText("Cantidad: ");

        registrar.setBackground(new java.awt.Color(102, 255, 102));
        registrar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        registrar.setText("Registrar");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        txt_define_valor.setBackground(new java.awt.Color(245, 245, 227));
        txt_define_valor.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txt_define_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_define_valorKeyTyped(evt);
            }
        });

        txt_define_cantidad.setBackground(new java.awt.Color(245, 245, 227));
        txt_define_cantidad.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txt_define_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_define_cantidadKeyTyped(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(255, 102, 102));
        eliminar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eliminar.setText("Eliminar Registro");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(255, 255, 102));
        limpiar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lst_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre_pro))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_define_cantidad))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_precio)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_define_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrar)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_pro)
                    .addComponent(txt_cantidad)
                    .addComponent(txt_precio))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lst_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_define_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_define_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(eliminar)
                    .addComponent(registrar))
                .addContainerGap())
        );

        ir.setBackground(new java.awt.Color(102, 102, 255));
        ir.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        ir.setText("Atrás");
        ir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        SubTotal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        SubTotal.setText("SubTotal: ");

        IVA.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        IVA.setText("IVA: ");

        total.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        total.setText("TOTAL: ");

        txt_subTotal.setEditable(false);
        txt_subTotal.setBackground(new java.awt.Color(204, 255, 204));

        txt_iva.setEditable(false);
        txt_iva.setBackground(new java.awt.Color(204, 255, 204));

        txt_total.setEditable(false);
        txt_total.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubTotal)
                            .addComponent(IVA, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_subTotal)
                            .addComponent(txt_iva, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubTotal)
                    .addComponent(txt_subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IVA)
                    .addComponent(txt_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setText("VENTA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ir)
                                .addGap(163, 163, 163)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irActionPerformed
        // ocultar el formulario actual (Registro)
        this.setVisible(false);
        
        //Presentar el formulario Menú
        MenuOpciones objMenu = new MenuOpciones();
        objMenu.setVisible(true);
    }//GEN-LAST:event_irActionPerformed

    private void lst_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lst_nombresActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        String rowData[]=new String[4];
        rowData[0]=lst_nombres.getSelectedItem().toString();
        rowData[1]=txt_define_cantidad.getText();
        rowData[2]=txt_define_valor.getText();
        Double imp=Double.parseDouble(rowData[1])*Double.parseDouble(rowData[2]);
        imp=redondea(imp);
        rowData[3]=imp.toString();     
        limpiar_valores();
        if(rowData[0]==seleccionar){
            JOptionPane.showMessageDialog(null, "Por Favor seleccione un producto", "ERROR", JOptionPane.WARNING_MESSAGE);       
        }else{
          modelo.addRow(rowData);
          calcularTotal();  
        }
        
        
        
    }//GEN-LAST:event_registrarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminarRegistro();
    }//GEN-LAST:event_eliminarActionPerformed

    private void txt_define_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_define_cantidadKeyTyped
        char control = evt.getKeyChar();
        if((control<'0' || control>'9')) evt.consume();
    }//GEN-LAST:event_txt_define_cantidadKeyTyped

    private void txt_define_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_define_valorKeyTyped
        char control = evt.getKeyChar();
        if((control<'0' || control>'9')&(control<'.' || control>'.')) evt.consume();

    }//GEN-LAST:event_txt_define_valorKeyTyped

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar_valores();
    }//GEN-LAST:event_limpiarActionPerformed
    public void limpiar_valores(){ 
        lst_nombres.setOpaque(true);
        txt_define_cantidad.setText("");
        txt_define_valor.setText("");
        limpia_nom();
    }
    public void limpia_nom(){
        lst_nombres.getModel().setSelectedItem(seleccionar);
    }
 
    private void eliminarRegistro(){
       int fil;
       if (modelo.getRowCount()>0){
           if (tbl_datos.getSelectedRow()!=-1){
               fil=tbl_datos.getSelectedRow();
               modelo.removeRow(fil);
               calcularTotal();
           }else{
               JOptionPane.showMessageDialog(null, "Seleccione Una Fila");
           }
       }else{ JOptionPane.showMessageDialog(null, "No hay Filas en la Tabla");}
    }
    
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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
    
    private double redondea(double num){
        return Math.rint(num*100)/100;
    }
     private void calcularTotal(){
        double suma=0,val_iva,tot;
        for(int i=0;i<tbl_datos.getRowCount();i++){
                suma += Double.parseDouble(modelo.getValueAt(i, 3).toString());
        }
            suma = redondea(suma);
            txt_subTotal.setText(String.valueOf(suma));
            val_iva=0.12*suma;
            val_iva=redondea(val_iva);
            tot=suma*1.12;
            tot=redondea(tot);
            txt_iva.setText(String.valueOf(val_iva));
            txt_total.setText(String.valueOf(tot));
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IVA;
    private javax.swing.JLabel SubTotal;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton ir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiar;
    private javax.swing.JComboBox<String> lst_nombres;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JTextField txt_define_cantidad;
    private javax.swing.JTextField txt_define_valor;
    private javax.swing.JTextField txt_iva;
    private javax.swing.JLabel txt_nombre_pro;
    private javax.swing.JLabel txt_precio;
    private javax.swing.JTextField txt_subTotal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
class FondoPane3 extends JPanel{
    private Image imagen;
    
    @Override 
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/proyectopoo/UTPL-INSTITUCIONAL-FC.png")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}