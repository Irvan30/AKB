package adapter;

//19-5-2019, 10116182, IRVAN NUR PRATAMA, IF - 4

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import fragment.FragmentProfil;

public class InfoAdapter extends FragmentPagerAdapter {

    int numOfTabs;

    public InfoAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentProfil();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}