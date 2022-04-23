package Model;

public class KrediResponse {
private Boolean krediOnaylandiMi;
private String mesaj;
private int onaylananTutar = 0;
private int musteriSeviyesi;
private int toplamOdeme = 0;
private int onaylananKartLimiti;
private String krediKartiTuru;


public int getOnaylananTutar() {
	return onaylananTutar;
}

public void setKrediOnaylandiMi(Boolean krediOnaylandiMi) {
	this.krediOnaylandiMi = krediOnaylandiMi;
}

public Boolean getKrediOnaylandiMi() {
	return krediOnaylandiMi;
}

public void setOnaylananTutar(int onaylananTutar) {
	this.onaylananTutar = onaylananTutar;
}
public String getMesaj() {
	return mesaj;
}
public void setMesaj(String mesaj) {
	this.mesaj = mesaj;
}

public int getMusteriSeviyesi() {
	return musteriSeviyesi;
}

public void setMusteriSeviyesi(int musteriSeviyesi) {
	this.musteriSeviyesi = musteriSeviyesi;
}

public int getToplamOdeme() {
	return toplamOdeme;
}

public void setToplamOdeme(int toplamOdeme) {
	this.toplamOdeme = toplamOdeme;
}

public int getOnaylananKartLimiti() {
	return onaylananKartLimiti;
}

public void setOnaylananKartLimiti(int onaylananKartLimiti) {
	this.onaylananKartLimiti = onaylananKartLimiti;
}

public String getKrediKartiTuru() {
	return krediKartiTuru;
}

public void setKrediKartiTuru(String krediKartiTuru) {
	this.krediKartiTuru = krediKartiTuru;
}

	
}
