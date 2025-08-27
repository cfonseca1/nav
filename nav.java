

public class Main {
    
    public static void main(String[] args) {

        try {
        TiendaFecher consultaAPI = new TiendaFecher();
        String resultado = consultaAPI.obtenerProductos("https://fakestoreapi.com/products");
        System.out.println("Respuesta de la API");
        System.out.println(resultado);

        } catch (Exception e) {

        }
        
        System.out.println("Tienda Java");
      
        JFrame ventana = new JFrame("Tienda Java");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setLayout(new BorderLayout());
        
        PanelBuscador panelBuscador = new PanelBuscador();
        
        ventana.add(panelBuscador.getJPanel(), BorderLayout.WEST);
        
        JPanel panelCentral = new JPanel();
        ventana.add(panelCentral, BorderLayout.CENTER);

        PanelProductos panelProductos = new PanelProductos();
        ventana.add(panelProductos.getJPanel(), BorderLayout.CENTER);
        
        
        ventana.setVisible(true);
    }
}