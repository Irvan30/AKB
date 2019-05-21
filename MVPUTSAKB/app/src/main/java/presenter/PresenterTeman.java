package presenter;

//19-5-2019, 10116182, IRVAN NUR PRATAMA, IF - 4

import view.ViewTeman;

public class PresenterTeman {
    private ViewTeman view;

    public PresenterTeman(ViewTeman view){
        this.view = view;
    }

    public void setListTeman() {view.showListTeman(); }
}
