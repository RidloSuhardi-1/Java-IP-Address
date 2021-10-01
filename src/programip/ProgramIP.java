package programip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author RIDLO_SHUHARDI
 */
public class ProgramIP {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.polinema.ac.id");
            InetAddress address2 = InetAddress.getByName("114.6.41.77"); // menggunakan jaringan luar
            System.out.println("" + address.getHostAddress());
            System.out.println("" + address2.getHostName());
            if (address.equals(address2)) {
                System.out.println("Alamat sama");
            } else {
                System.out.println("Alamat tidak sama");
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(ProgramIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
