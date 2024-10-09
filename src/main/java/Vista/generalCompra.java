package Vista;

import Controller.ControladorVenta;
import DTO.VentaDTO;
import Service.VentaServiceIMP;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lauravalencia
 */
public class generalCompra extends javax.swing.JFrame {

    
    public generalCompra() {
        initComponents();
    }

    public void setDatos(String product, String amount, String price) {
        producto.setText(product);
        cantidad.setText(amount);

        double valor = Double.parseDouble(price);
        int cantidadNumerica = Integer.parseInt(amount);
        double totalPrecio = valor * cantidadNumerica;
        precio.setText(String.valueOf(totalPrecio));
    }

    public boolean verificarEspacios() {
        JTextField[] fields = {txtNombre, txtNumeroTelefii, txtCiudad, txtIdentificacion, txtIdProduccion, txtContrasena};
        boolean allFieldsFilled = true;

        for (JTextField field : fields) {
            if (field.getText().isEmpty()) {
                field.setBackground(Color.pink); // Resalta el campo vacío
                allFieldsFilled = false;
            } else {
                field.setBackground(Color.WHITE); // Restablece el color si está lleno
            }
        }

        if (!allFieldsFilled) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return allFieldsFilled;
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtNumeroTelefii.setText("");
        txtCiudad.setText("");
        iD.setText("");
        txtIdProduccion.setText("");
        txtContrasena.setText("");
        producto.setText("");
        cantidad.setText("");
        precio.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        producto = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        iD = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnGenerarRecibo = new javax.swing.JButton();
        precio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroTelefii = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtIdProduccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO CLIENTE");

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setForeground(new java.awt.Color(102, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Producto");

        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Cantidad");

        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Precio Total");

        producto.setForeground(new java.awt.Color(102, 51, 0));
        producto.setText("jLabel5");

        cantidad.setForeground(new java.awt.Color(102, 51, 0));
        cantidad.setText("jLabel6");

        jLabel10.setForeground(new java.awt.Color(102, 51, 0));
        jLabel10.setText("Nombre ");

        iD.setForeground(new java.awt.Color(102, 51, 0));
        iD.setText("Identificacion");

        jLabel12.setForeground(new java.awt.Color(102, 51, 0));
        jLabel12.setText("Ciudad");

        btnGenerarRecibo.setBackground(new java.awt.Color(102, 153, 0));
        btnGenerarRecibo.setForeground(new java.awt.Color(102, 51, 0));
        btnGenerarRecibo.setText("Generar recibo");
        btnGenerarRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReciboActionPerformed(evt);
            }
        });

        precio.setForeground(new java.awt.Color(102, 51, 0));
        precio.setText("jLabel6");

        jLabel7.setForeground(new java.awt.Color(102, 51, 0));
        jLabel7.setText("Contraseña");

        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Dirección");

        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("ID producción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnGenerarRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8))
                            .addComponent(txtNumeroTelefii, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iD)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificacion))
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto)
                            .addComponent(cantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(iD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precio)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroTelefii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenerarRecibo)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReciboActionPerformed

        if (verificarEspacios()) {
            String recibo = String.format(
                    "------------------ Factura de Compra ------------------\n"
                    + "Nombre: %s\n"
                    + "Teléfono: %s\n"
                    + "Ciudad: %s\n"
                    + "Id producción: %s\n"
                    + "Dirección: %s\n"
                    + "-------------------------------------------------------\n"
                    + "Producto: %s\n"
                    + "Cantidad: %s\n"
                    + "-------------------------------------------------------\n"
                    + "Precio de compra: %s\n"
                    + "-------------------------------------------------------\n"
                    + "Gracias por su compra.\n"
                    + "\n"
                    + "            __\n"
                    + "          <(o   )___\n"
                    + "            (      )  ~\n"
                    + "            `----' \n",
                    txtNombre.getText(),
                    txtNumeroTelefii.getText(),
                    txtCiudad.getText(),
                    iD.getText(),
                    txtIdProduccion.getText(),
                    producto.getText(),
                    cantidad.getText(),
                    precio.getText()
            );
            JOptionPane.showMessageDialog(null, recibo, "Factura", JOptionPane.INFORMATION_MESSAGE);

           ControladorVenta controlador = new ControladorVenta();
           controlador.guardarVenta();

        }
    }//GEN-LAST:event_btnGenerarReciboActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Ventas venta = new Ventas();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed



    public JLabel getPrecio() {
        return precio;
    }

    public void setPrecio(JLabel precio) {
        this.precio = precio;
    }

    public JLabel getCantidad() {
        return cantidad;
    }

    public void setCantidad(JLabel cantidad) {
        this.cantidad = cantidad;
    }

    public JTextField getTxtIdProduccion() {
        return txtIdProduccion;
    }

    public void setTxtIdProduccion(JTextField txtIdProduccion) {
        this.txtIdProduccion = txtIdProduccion;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(JTextField txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarRecibo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel iD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel producto;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtIdProduccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroTelefii;
    // End of variables declaration//GEN-END:variables
}
