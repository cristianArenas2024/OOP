import javax.swing.*;

public class CajeroGUI {
    private Cuenta cuenta;

    public CajeroGUI() {
        cuenta = new Cuenta(1000); // Saldo inicial

        JFrame ventana = new JFrame("Cajero Automático");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JButton btnIngresar = new JButton("Consignar");
        JButton btnRetirar = new JButton("Retirar");
        JButton btnSaldo = new JButton("Ver Saldo");

        btnIngresar.setBounds(80, 20, 120, 30);
        btnRetirar.setBounds(80, 60, 120, 30);
        btnSaldo.setBounds(80, 100, 120, 30);

        ventana.add(btnIngresar);
        ventana.add(btnRetirar);
        ventana.add(btnSaldo);

        // Acción Ingresar
        btnIngresar.addActionListener(e -> {
            String texto = JOptionPane.showInputDialog("Cantidad a ingresar:");
            if (texto != null) {
                double valor = Double.parseDouble(texto);
                double nuevoSaldo = cuenta.getSaldo() + valor;
                cuenta.setSaldo(nuevoSaldo);
                JOptionPane.showMessageDialog(null, "Nuevo saldo: $" + cuenta.getSaldo());
            }
        });

        // Acción Retirar
        btnRetirar.addActionListener(e -> {
            String texto = JOptionPane.showInputDialog("Cantidad a retirar:");
            if (texto != null) {
                double valor = Double.parseDouble(texto);
                double nuevoSaldo = cuenta.getSaldo() - valor;
                cuenta.setSaldo(nuevoSaldo);
                JOptionPane.showMessageDialog(null, "Nuevo saldo: $" + cuenta.getSaldo());
            }
        });

        // Acción Ver Saldo
        btnSaldo.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.getSaldo());
        });

        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new CajeroGUI();
    }
}
