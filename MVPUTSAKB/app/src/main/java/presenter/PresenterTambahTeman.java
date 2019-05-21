package presenter;

//19-5-2019, 10116182, IRVAN NUR PRATAMA, IF - 4

import model.Teman;
import view.ViewTambahTeman;

public class PresenterTambahTeman {

    private ViewTambahTeman view;

    public PresenterTambahTeman(ViewTambahTeman view){
        this.view = view;
    }

    public void tambahTeman(Teman teman){
        view.saveData(teman);
    }
}
