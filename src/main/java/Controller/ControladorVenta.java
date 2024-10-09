
package Controller;

import DTO.VentaDTO;
import Service.VentaServiceIMP;
import Vista.generalCompra;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class ControladorVenta {
    
    generalCompra genCompra = new generalCompra();
    private VentaServiceIMP ventaService = new VentaServiceIMP();


    public ControladorVenta() {
      
    }
    
    public void guardarVenta() {
    try {
        String cantidadText = genCompra.getCantidad().getText();
        String precioText = genCompra.getPrecio().getText();
        String identificacionText = genCompra.getTxtIdentificacion().getText();
        String idProduccionText = genCompra.getTxtIdProduccion().getText();

        // Validación de la cantidad
        if (cantidadText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cantidad no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validación de número
        if (!cantidadText.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convertir textos a números
        int cantidad = Integer.parseInt(cantidadText);
        float precio = Float.parseFloat(precioText); // Cambié a Float.parseFloat directamente
        int idUsuario = Integer.parseInt(identificacionText);
        int idProduccion = Integer.parseInt(idProduccionText);

        // Crear el objeto VentaDTO
        VentaDTO venta = new VentaDTO(0, LocalDate.now(), cantidad, precio, idUsuario, idProduccion);

        // Guardar la venta
        boolean guardadoExitoso = ventaService.save(venta);

        if (guardadoExitoso) {
            JOptionPane.showMessageDialog(null, "Venta registrada con éxito en la base de datos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar la venta en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error al convertir los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

     
}
