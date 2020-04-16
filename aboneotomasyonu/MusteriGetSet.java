
package aboneotomasyonu;


public class MusteriGetSet {
    
    //müşterilerin sütunlarını tanımlanıyoruz.
    private int mid;
    private String ad;
    private String soyad;
    private String unvani;
    private String telefon;
    private String eposta;
    private String firma;
    private String adres;

    public MusteriGetSet(int mid, String ad, String soyad, String unvani, String telefon, String eposta, String firma, String adres) {
        this.mid = mid;
        this.ad = ad;
        this.soyad = soyad;
        this.unvani = unvani;
        this.telefon = telefon;
        this.eposta = eposta;
        this.firma = firma;
        this.adres = adres;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUnvani() {
        return unvani;
    }

    public void setUnvani(String unvani) {
        this.unvani = unvani;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
    
}
