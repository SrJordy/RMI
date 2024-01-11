package Client;
import RMI.RemoteInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
public class Cliente {
    public static void main (String args[]){
        try{
            String valora= JOptionPane.showInputDialog("Ingrese el valor del numero uno");
            String valorb= JOptionPane.showInputDialog("Ingrese el valor del numero dos");
            int a=Integer.parseInt(valora);
            int b=Integer.parseInt(valorb);
            Registry miRegistro=LocateRegistry.getRegistry("26.151.192.234",1234);
            RemoteInterface s=(RemoteInterface) miRegistro.lookup("Ejemplo Matematicas");
            JOptionPane.showMessageDialog(null, "Resultado suma: "+s.suma(a,b));
            JOptionPane.showMessageDialog(null, "Resultado resta: "+s.resta(a,b));
            JOptionPane.showMessageDialog(null, "Resultado Multiplica: "+s.multiplica(a,b));
            JOptionPane.showMessageDialog(null, "Resultado Divide: "+s.divide(a,b));
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
