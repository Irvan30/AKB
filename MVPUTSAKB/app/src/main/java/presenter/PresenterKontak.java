package presenter;

//19-5-2019, 10116182, IRVAN NUR PRATAMA, IF - 4

import view.ViewKontak;

public class PresenterKontak {

    private ViewKontak view;

    public PresenterKontak(ViewKontak view) {
        this.view = view;
    }

    public void makeCall() {
        view.doCall();
    }

    public void sendEmail() {
        view.sendEmail();
    }

    public void openInstagram() {
        view.openInstagram();
    }

    public void openTwitter() {
        view.openTwitter();
    }
}
