
package aboneotomasyonu;

/**
 *
 * @author Parthenia Nora
 */
public class KullaniciGetSet {
    
    //kullanıcıların sütunlarını tanımlanıyoruz.
    private int kid;
    private String kadi;
    private String adi;
    private String soyadi;
    private String sifre;

    public KullaniciGetSet(int kid, String kadi, String adi, String soyadi, String sifre) { //tanımladığımız sütunların constructor'ını tanımlıyoruz.
        this.kid = kid;
        this.kadi = kadi;
        this.adi = adi;
        this.soyadi = soyadi;
        this.sifre = sifre;
    }
    
    public int getkid() {
        return kid;
    }
    public void setkid(int kid) {
        this.kid = kid;
    }
    
    public String getkadi() {
        return kadi;
    }
    public void setkadi(String kadi) {
        this.kadi = kadi;
    }
    
    public String getadi() {
        return adi;
    }
    public void setadi(String adi) {
        this.adi = adi;
    }
    
    public String getsoyadi() {
        return soyadi;
    }
    public void setsoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    
    public String getsifre() {
        return sifre;
    }
    public void setsifre(String sifre) {
        this.sifre = sifre;
    } 
}
