package presenter;

//19-5-2019, 10116182, IRVAN NUR PRATAMA, IF - 4

import view.ViewDetailTeman;

public class PresenterDetailTeman {
    private ViewDetailTeman view;

    public PresenterDetailTeman(ViewDetailTeman view) {
        this.view = view;
    }

    public void getFriendsDetail() {
        view.showDetail();
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
}
