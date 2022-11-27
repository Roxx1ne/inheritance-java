// Naufal 

package kendaraan;


public class main {
    public static void main(String[] args) {
        mobil mob = new mobil( 2017,  442, "black doff ", "pertamax turbo ", "wilayah Asia ",  628872, "City Car " , "7 " ,"Avanza",  1300, "4 Slinder 1300 cc " );
        motor mot = new motor(2020, 301, "Hitam " , "pertamax/petralite ", "wilayah Asia ", 627621, "City Motorcycle " , "PCX " , 150, "4-valve, e-SP+ ");
        sepeda sep = new sepeda (2019, 102, "merah ", "kayuh/energi kinetik " , "wilayah Eropa ", "MTB ", "Polygon " , 8 );
        
        System.out.println("MOBIL");
        mob.view();
        mob.viewMobil();
        System.out.println(" ");
        
        System.out.println("MOTOR");
        mot.view();
        mot.viewMotor();
        System.out.println(" ");
        System.out.println(" --- data setelah di ubah --- ");
        System.out.println(" ");
        mot.setKd_produksi(202);
        mot.setTh_produksi(2018);
        mot.setNo_polisiMotor(623491);
        mot.setJenismesinM("SOHC PGM-FI.");
        mot.setJenis_motor( "city motorcycle ");
        mot.setNamaMotor( "Supra bapak ");
        mot.getNo_polisiMotor();
        mot.getJenismesinM();
        mot.setCcM(110);
        mot.getJenis_motor();
        mot.getNamaMotor();
        mot.getCcM();
        mot.getKd_produksi();
        mot.getTh_produksi();
        mot.view();
        mot.viewMotor();
        System.out.println(" ");
        
        System.out.println("SEPEDA");
        sep.view();
        sep.viewSepeda();
        System.out.println(" ");
        
        
    }
    
    
    
}
