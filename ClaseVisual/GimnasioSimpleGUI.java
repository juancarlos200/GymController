package ClaseVisual;

import controlador.controladorgimnasio;
import javax.swing.*;
import java.awt.*;

public class GimnasioSimpleGUI extends JFrame {
    private controladorgimnasio controlador;
    
    private JButton limpiarBtn;
    private JButton agregarMaquinaBtn;
    private JButton agregarMancuernaBtn;
    private JTextArea infoArea;

    public GimnasioSimpleGUI(controladorgimnasio controlador) {
        this.controlador = controlador;
        setTitle("Gestión de Gimnasio Simple");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initComponents();
    }
    
    private void initComponents() {
        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        
        // Panel de botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        limpiarBtn = new JButton("Limpiar Salón");
        limpiarBtn.addActionListener(e -> {
            controlador.limpiarSalon();
            actualizarInfo();
            JOptionPane.showMessageDialog(this, "Salón limpiado correctamente");
        });
        
        agregarMaquinaBtn = new JButton("Agregar Máquina");
        agregarMaquinaBtn.addActionListener(e -> agregarMaquina());
        
        agregarMancuernaBtn = new JButton("Agregar Mancuerna");
        agregarMancuernaBtn.addActionListener(e -> agregarMancuerna());
        
        buttonPanel.add(limpiarBtn);
        buttonPanel.add(agregarMaquinaBtn);
        buttonPanel.add(agregarMancuernaBtn);
        
        // Área de información
        infoArea = new JTextArea();
        infoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(infoArea);
        
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        
        add(mainPanel);
        
        // Actualizar información inicial
        actualizarInfo();
    }
    
    private void agregarMaquina() {
        JTextField nombreField = new JTextField();
        JTextField musculoField = new JTextField();
        
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Músculo:"));
        panel.add(musculoField);
        
        int result = JOptionPane.showConfirmDialog(
            this, panel, "Agregar Máquina", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            // Aquí iría la lógica para agregar la máquina al controlador
            String nombre = nombreField.getText();
            String musculo = musculoField.getText();
            
            // Simulación de agregar máquina
            infoArea.append("Máquina agregada: " + nombre + " (" + musculo + ")\n");
        }
    }
    
    private void agregarMancuerna() {
        JTextField pesoField = new JTextField();
        JCheckBox disponibleCheck = new JCheckBox("Disponible");
        disponibleCheck.setSelected(true);
        
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Peso (kg):"));
        panel.add(pesoField);
        panel.add(new JLabel("Disponible:"));
        panel.add(disponibleCheck);
        
        int result = JOptionPane.showConfirmDialog(
            this, panel, "Agregar Mancuerna", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            try {
                double peso = Double.parseDouble(pesoField.getText());
                boolean disponible = disponibleCheck.isSelected();
                
                // Simulación de agregar mancuerna
                infoArea.append("Mancuerna agregada: " + peso + "kg - " + 
                               (disponible ? "Disponible" : "No disponible") + "\n");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un peso válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void actualizarInfo() {
        infoArea.setText("Información del Gimnasio:\n");
        infoArea.append("Salón: " + (controlador.getDisponibilidad() ? "Disponible" : "No disponible") + "\n");
        infoArea.append("--------------------------------\n");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            controladorgimnasio controlador = new controladorgimnasio();
            GimnasioSimpleGUI gui = new GimnasioSimpleGUI(controlador);
            gui.setVisible(true);
        });
    }
}
