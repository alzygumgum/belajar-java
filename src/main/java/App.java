import java.util.Scanner;
import com.mbokmar.models.MenuMbokmar;

public class App {
    
    public static void main(String[] args){
    
    int jumlah = 0;
    int order;
    
        while (true) {

            System.out.println("Masukkan pilihan menu: ");
            System.out.println("a. 1 potong bebek + gratis nasi.");
            /*System.out.println("b. 1/2 ekor bebek (2 potong)");
            System.out.println("c. 1 ekor bebek (4 potong)");*/
            
            //ambil data dari class MenuMbokMar
            //dengan membuat object terlebih dahulu, lalu panggil propertiesnya
            MenuMbokmar menu = new MenuMbokmar();
            //System.out.println(menu.MenuBebek());

            System.out.println("Masukkan Jumlah Orderan: ");
            Scanner scan = new Scanner(System.in);
            order = scan.nextInt();

            if (order >= 0){
                jumlah += order;
                System.out.println("Jumlah orderan saat ini: "+ jumlah + menu.MenuBebek());
            }
            else{
            System.out.println("Input yang dimasukkan salah!");
            }
        }
    }
}
