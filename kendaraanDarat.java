
// Naufal 
package kendaraan;

public class kendaraanDarat {
    private int th_produksi;
    private int kd_produksi;
    private String warna;
    private String bahanbakar;
    private String targetpemasaran;

    kendaraanDarat ( int thProd, int kdProd, String warnaX, String BB, String TP){
        th_produksi = thProd;
        kd_produksi = kdProd;
        warna = warnaX;
        bahanbakar = BB;
        targetpemasaran = TP;
    }
    public void view() {
        System.out.println("th_produksi    : " + getTh_produksi());
        System.out.println("kd_produksi    : " + getKd_produksi());
        System.out.println("warna          : " + getWarna());
        System.out.println("Bahan bakar    : " + getBahanbakar());
        System.out.println("Pemasaran      : " + getTargetpemasaran());
    }

    /**
     * @return the th_produksi
     */
    public int getTh_produksi() {
        return th_produksi;
    }

    /**
     * @param th_produksi the th_produksi to set
     */
    public void setTh_produksi(int th_produksi) {
        this.th_produksi = th_produksi;
    }

    /**
     * @return the kd_produksi
     */
    public int getKd_produksi() {
        return kd_produksi;
    }

    /**
     * @param kd_produksi the kd_produksi to set
     */
    public void setKd_produksi(int kd_produksi) {
        this.kd_produksi = kd_produksi;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the bahanbakar
     */
    public String getBahanbakar() {
        return bahanbakar;
    }

    /**
     * @param bahanbakar the bahanbakar to set
     */
    public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }

    /**
     * @return the targetpemasaran
     */
    public String getTargetpemasaran() {
        return targetpemasaran;
    }

    /**
     * @param targetpemasaran the targetpemasaran to set
     */
    public void setTargetpemasaran(String targetpemasaran) {
        this.targetpemasaran = targetpemasaran;
    }

    
}
