// Naufal

package kendaraan;

public class motor extends kendaraanDarat {
  private int no_polisiMotor;
  private String jenis_motor;
  private String namaMotor;
  private int ccM;
  private String jenismesinM;
  
  motor(int thProd, int kdProd, String warnaX, String BB, String TP, int nopolM, String JM, String nama, int speed, String mesinM){
    super(thProd, kdProd, warnaX, BB, TP);
    no_polisiMotor = nopolM;
    jenis_motor = JM;
    namaMotor = nama;
    ccM = speed;
    jenismesinM = mesinM;
  }
  public void viewMotor() {
    System.out.println("NO polisi      : " + getNo_polisiMotor());
    System.out.println("jenis motor    : " + getJenis_motor());
    System.out.println("nama motor     : " + getNamaMotor());
    System.out.println("speed          : " + getCcM());
    System.out.println("jenis mesin    : " + getJenismesinM());
}

    /**
     * @return the no_polisiMotor
     */
    public int getNo_polisiMotor() {
        return no_polisiMotor;
    }

    /**
     * @param no_polisiMotor the no_polisiMotor to set
     */
    public void setNo_polisiMotor(int no_polisiMotor) {
        this.no_polisiMotor = no_polisiMotor;
    }

    /**
     * @return the jenis_motor
     */
    public String getJenis_motor() {
        return jenis_motor;
    }

    /**
     * @param jenis_motor the jenis_motor to set
     */
    public void setJenis_motor(String jenis_motor) {
        this.jenis_motor = jenis_motor;
    }

    /**
     * @return the namaMotor
     */
    public String getNamaMotor() {
        return namaMotor;
    }

    /**
     * @param namaMotor the namaMotor to set
     */
    public void setNamaMotor(String namaMotor) {
        this.namaMotor = namaMotor;
    }

    /**
     * @return the ccM
     */
    public double getCcM() {
        return ccM;
    }

    /**
     * @param ccM the ccM to set
     */
    public void setCcM(int ccM) {
        this.ccM = ccM;
    }

    /**
     * @return the jenismesinM
     */
    public String getJenismesinM() {
        return jenismesinM;
    }

    /**
     * @param jenismesinM the jenismesinM to set
     */
    public void setJenismesinM(String jenismesinM) {
        this.jenismesinM = jenismesinM;
    }


     
    
}
