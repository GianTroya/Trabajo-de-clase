import javax.swing.*;

public class PruebaFormulario {
    private JTextField textFieldNombre;
    private JTextField textFieldEmail;
    private JLabel etNombre;
    private JTextArea textAreaMensaje;
    private JLabel etEmail;
    private JPanel mainPanel;
    private JButton enviarMensajeButton;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Formulario de Contacto"); // Título de la ventana

                //Crea una instancia de tu clase de formulario (que es un JPanel)
                PruebaFormulario formulario = new PruebaFormulario();
                frame.setContentPane(formulario.mainPanel); // Establece el panel del formulario como contenido de la ventana.

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack(); // Ajusta el tamaño de la ventana al contenido preferido
                frame.setLocationRelativeTo(null); // Centra la ventana
                frame.setVisible(true);

                frame.setResizable(false);
                frame.setSize(500,400);

                // Agregar un evento al botón para que aparezca otra pantalla con un mensaje diciendo "El usuario *nombre del usuario* con email *nombre del email* ha enviado un mensaje
                formulario.enviarMensajeButton.addActionListener(e -> {
                    String nombreUsuario = formulario.textFieldNombre.getText();
                    String emailUsuario = formulario.textFieldEmail.getText();
                    String mensajeUsuario = formulario.textAreaMensaje.getText();
                    if (nombreUsuario.isEmpty() || emailUsuario.isEmpty() || mensajeUsuario.isEmpty()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Por favor, completa todos los campos.",
                                "Campos obligatorios",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return; // Salir del metodo si hay campos vacíos
                    }
                    // Crear un nuevo JFrame para mostrar el mensaje
                    JFrame mensajeFrame = new JFrame("Mensaje enviado");
                    JLabel mensajeLabel = new JLabel("El usuario " + nombreUsuario + " con email " + emailUsuario + " ha enviado el mensaje: " + mensajeUsuario);
                    mensajeLabel.setHorizontalAlignment(SwingConstants.CENTER);

                    mensajeFrame.add(mensajeLabel);
                    mensajeFrame.setSize(450,150);
                    mensajeFrame.setLocationRelativeTo(null); // Centrar la ventana
                    mensajeFrame.setVisible(true);
                });
            }
        });
    }
}