import com.matiasayala.CocheCRUD;
import com.matiasayala.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findall();
        cocheCrud.delete();
    }
}