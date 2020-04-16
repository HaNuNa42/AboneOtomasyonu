package aboneotomasyonu;
import aboneotomasyonu.Kullanicilar.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PartheniaNora
 */
public class VTBaglantisi {

    static ResultSet rs; //resultset: Sorgumuzun sonucunda dönen dataları almak için kullanılır.
    static PreparedStatement prs;
    static Connection bag;   //Connection: Bu interface, bütün metotları ile veritabanına irtibat kurmak için kullanılır.
    static String url = "jdbc:mysql://localhost:3306/aboneotomasyonu?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey"; //mysql bizim yerel saat düzenine göre istediği için böyle uzun bir dönüştürme kodu kullanıldı. internette var
    static String vtadi = "aboneotomasyonu";
    static String driver = "com.mysql.cj.jdbc.Driver";  //Driver: Bu interface, veritabanı ile iletişimi ele alır.
    static String vtkullaniciadi = "root";
    static String vtsifre = "root";
    public static ArrayList<KullaniciGetSet> kgetset;
    public static ArrayList<MusteriGetSet> mgetset;
    public static ArrayList<AramaSonuclari> getir;
    public static DefaultTableModel model;
    
    public static Connection baglantiAc() { //veritabanına bağlanmak için kullanılan kod bloğu
        try {

            Class.forName(driver).newInstance(); //jdbc sürücüsü yüklendi
            System.out.println("veritabanına bağlanıldı");
            bag = DriverManager.getConnection(url, vtkullaniciadi, vtsifre); //DriverManager: Bu sınıf, veritabanı sürücülerinin listesini yönetir. bağlantı oluşturuldu

            Statement st = bag.createStatement(); //Statement: sorguyu veritabanında çalıştırma işlemini gerçekleştirmektedir.
        } catch (Exception e) {
            System.out.println(e + " veritabanına bağlantı başarısız");
        }
        return bag;
    }

    public static void baglantiKapat() throws Exception {
        bag.close();
    }

    public static boolean kullanicikontrol(String kadi, String sifre) {
        baglantiAc();
        try {
            Statement st = bag.createStatement();
            System.out.println("kullanıcı sorgulanıyor");
            rs = st.executeQuery("SELECT * FROM aboneotomasyonu.kullanicilar WHERE kadi='" + kadi + "' and sifre='" + sifre + "';");
            System.out.println("kullanıcı sorgulandı");

            if (rs.next()) {
                System.out.println("kullanıcı doğrulandı");

                KullaniciPaneli ac = new KullaniciPaneli();
                ac.setVisible(true);
            } else {
                System.out.println("geçersiz kullanıcı veya şifre, tekrar dene");
                JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre geçersiz... Lütfen tekrar deneyiniz...", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            rs.close();
            st.close();
            return false;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public static void MusteriEkle(String ad, String soyad, String unvani, String telefon, String eposta, String firma, String adres) {
        baglantiAc();
        try {
            System.out.println("müşteri kayıt ekleme için bağlantı veri tabanına bağlanıldı");

            String sql = "INSERT INTO musteriler (ad,soyad,unvani,telefon,eposta,firma,adres)" + "VALUES (?,?,?,?,?,?,?)";
            prs = bag.prepareStatement(sql);
            prs.setString(1, ad);
            prs.setString(2, soyad);
            prs.setString(3, unvani);
            prs.setString(4, telefon);
            prs.setString(5, eposta);
            prs.setString(6, firma);
            prs.setString(7, adres);
            
            int sonuc = prs.executeUpdate();
            if (sonuc == 0){
            JOptionPane.showMessageDialog(null, "Abone / Müşteri Eklenemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            System.out.println("müşteri eklenemedi");
            }
            else {
            JOptionPane.showMessageDialog(null, "Abone / Müşteri Eklendi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            System.out.println("müşteri eklendi");
            }
            baglantiKapat();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void KullaniciEkle(String kadi, String adi, String soyadi, String sifre) {
        baglantiAc();
        try {
            System.out.println("kayıt ekleme için veritabanına bağlanıldı");

            String sql = "INSERT INTO aboneotomasyonu.kullanicilar (adi,soyadi,kadi,sifre) VALUES (?,?,?,?)";
            prs = bag.prepareStatement(sql);
            prs.setString(1, kadi);
            prs.setString(2, adi);
            prs.setString(3, soyadi);
            prs.setString(4, sifre);

            int sonuc = prs.executeUpdate();
            if (sonuc == 0) {
                System.out.println(" kullanıcı eklenemedi");
                JOptionPane.showMessageDialog(null, "Kullanıcı Eklenemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            else {
            JOptionPane.showMessageDialog(null, "Kullanıcı Eklendi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            System.out.println("kullanıcı eklendi");
            }
            
            baglantiKapat();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<KullaniciGetSet> KullaniciListele() throws SQLException  {
       
        baglantiAc();
        try {
            Statement st = bag.createStatement();
            rs = st.executeQuery("SELECT * FROM kullanicilar");
            kgetset = new ArrayList<KullaniciGetSet>();
            
            while (rs.next()) {
                kgetset.add(new KullaniciGetSet(
                        rs.getInt("kid"), 
                        rs.getString("kadi"), 
                        rs.getString("adi"), 
                        rs.getString("soyadi"),
                        rs.getString("sifre")));
            } 
            System.out.println("kullanıcılar listelendi");
            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("kullanıcılar bulunamadı tekrar dene");
            JOptionPane.showMessageDialog(null, "kullanıcılar bulunamadı Lütfen tekrar deneyiniz...", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            
        }
        return kgetset;
    }
       
    public static ArrayList<MusteriGetSet> MusteriListele() throws SQLException  {
       
        baglantiAc();  
        try {
            Statement smt = bag.createStatement();
            rs = smt.executeQuery("SELECT * FROM aboneotomasyonu.musteriler");
            mgetset = new ArrayList<MusteriGetSet>();
            
            while (rs.next()) {
                mgetset.add(new MusteriGetSet(
                        rs.getInt("mid"), 
                        rs.getString("ad"), 
                        rs.getString("soyad"), 
                        rs.getString("unvani"),
                        rs.getString("telefon"),
                        rs.getString("eposta"),
                        rs.getString("firma"),
                        rs.getString("adres")));
            }
            System.out.println("müşteriler listelendi");
            rs.close();
            smt.close();
        } 
        catch (SQLException e) {
            System.out.println(e);
            System.out.println("müşteriler bulunamadı tekrar dene");
            JOptionPane.showMessageDialog(null, "müşteriler bulunamadı Lütfen tekrar deneyiniz...", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
        }
        return mgetset;
    }
        
    public static boolean KullaniciSil(String kadi) throws SQLException {
        baglantiAc();
        try {
            String sql = "DELETE FROM kullanicilar WHERE kadi =?;";
            prs = bag.prepareStatement(sql);
            prs.setString(1, kadi);
            
            int sonuc = prs.executeUpdate();
            if (sonuc == 0) {
                System.out.println("kullanici silinemedi");
                JOptionPane.showMessageDialog(null, "kullanıcı silinemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            } else {
            System.out.println("kullanici silindi");
            JOptionPane.showMessageDialog(null, "kullanıcı silindi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean MusteriSil(String ad, String soyad) throws SQLException {
       baglantiAc();
        try {
            String sql = "DELETE FROM musteriler WHERE ad =? and soyad =?;";
            prs = bag.prepareStatement(sql);
            prs.setString(1, ad);
            prs.setString(2, soyad);
            
            int sonuc = prs.executeUpdate();
            if (sonuc == 0) {
                System.out.println("musteriler silinemedi");
                JOptionPane.showMessageDialog(null, "musteriler silinemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            } else {
            System.out.println("musteriler silindi");
            JOptionPane.showMessageDialog(null, "musteriler silindi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean MusteriGuncelle(int mid, String ad, String soyad, String telefon, String eposta, String adres) throws SQLException {
        baglantiAc();
        try {
            System.out.println("güncellemek için veritabanı açıldı");

            String sql = "UPDATE musteriler SET telefon=? , eposta=? , adres=? WHERE ad=? and soyad=? and mid=?;";
            prs = bag.prepareStatement(sql);
            prs.setString(1, telefon);
            prs.setString(2, eposta);
            prs.setString(3, adres);
            prs.setString(4, ad);
            prs.setString(5, soyad);
            prs.setInt(6, mid);
            
            int sonuc = prs.executeUpdate();
            if (sonuc == 0) {
            System.out.println("musteriler güncellenmedi");
            JOptionPane.showMessageDialog(null, "musteriler güncellenemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                System.out.println("musteriler güncellendi");
                 JOptionPane.showMessageDialog(null, "musteriler güncellendi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            baglantiKapat();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean KullaniciGuncelle(String kadi, int kid) throws SQLException {
        baglantiAc();
        try {
            System.out.println("güncellemek için veritabanı açıldı");

            String sql = "UPDATE aboneotomasyonu.kullanicilar SET kadi =? WHERE kid= ?;";
            prs = bag.prepareStatement(sql);
            prs.setString(1, kadi);
            prs.setInt(2, kid);
            
            int sonuc = prs.executeUpdate();
            if (sonuc == 0) {
            System.out.println("kullanıcı güncellenmedi");
            JOptionPane.showMessageDialog(null, "kullanıcı güncellenemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                System.out.println("kullanıcı güncellendi");
                 JOptionPane.showMessageDialog(null, "kullanıcı güncellendi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            baglantiKapat();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
       
    public static boolean SifreGuncelle(int kid, String mevcut, String yeni) throws SQLException {
         baglantiAc();
        try {
            System.out.println("güncellemek için veritabanı açıldı");
           
            String sql = "UPDATE aboneotomasyonu.kullanicilar SET sifre =? WHERE kid=? and sifre=?";
            prs = bag.prepareStatement(sql);
            prs.setString(1, yeni);
            prs.setInt(2, kid);
            prs.setString(3, mevcut);
                    
            int sonuc = prs.executeUpdate();
            if (sonuc == 0) {
            System.out.println("şifre güncellenmedi");
            JOptionPane.showMessageDialog(null, "kullanıcı güncellenemedi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                System.out.println("şifre güncellendi");
                 JOptionPane.showMessageDialog(null, "şifre güncellendi", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            baglantiKapat();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static ArrayList<AramaSonuclari> MusteriAra(String ad, String soyad) throws SQLException  {
        baglantiAc();  
        try {
            String sql = "SELECT * FROM musteriler where ad=? and soyad=?;";
            prs = bag.prepareStatement(sql);
            prs.setString(1, ad);
            prs.setString(2, soyad);
            
            ResultSet rst = prs.executeQuery();
            System.out.println("sonuclar aranıyor");
            
            if(rst.next()) {
                getir = new ArrayList<>();
                    getir.add(new AramaSonuclari(
                            rst.getInt("mid"),
                            rst.getString("ad"),
                            rst.getString("soyad"),
                            rst.getString("unvani"),
                            rst.getString("telefon"),
                            rst.getString("eposta"),
                            rst.getString("firma"),
                            rst.getString("adres")));
            
                System.out.println("sonuclar listelendi");
          
            }
            else {
                System.out.println("sonuclar yok");
                JOptionPane.showMessageDialog(null, "sonuç bulunamadı", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
            }
            
        }
        catch (SQLException e) {
            System.out.println(e);
            }
        return getir;
    }

}
