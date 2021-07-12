package aplcovid19.koneksi;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * @author 
 * Nama  : Rachman Aldiansyah (10119038)
 *         Diva Sabila Ramadhan (10119039)
 *         Agus Deri Dermawan (10119040)
 * Kelas : IF-1
 */

public class koneksi {
    public Properties mypanel, myLanguage;
    private String strNamePanel;
    public koneksi() {
        
    }
    public String SettingPanel(String nmPanel) {
        try {
            mypanel = new Properties();
            mypanel.load(new FileInputStream("lib/database.ini"));
            strNamePanel = mypanel.getProperty(nmPanel);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return strNamePanel;
    }
}