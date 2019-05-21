package model;
import java.util.ArrayList;

//19-5-2019, 10116182, IRVAN NUR PRATAMA, IF - 4

public class ListTeman {
    public static String[][] data = new String[][] {
            {"10116060", "Santo Iswadi ", "IK-3", "santoo@gmail.com", "@santoo", "089789320173"},
            {"10116060", "Ridho M", "IK-3", "mridho@gmail.com", "@mridho", "087641275482"},
            {"10116060", "Safira", "IK-3", "firafirass@gmail.com", "@safiraa", "081287453902"},
    };
    public static ArrayList<Teman> getListData(){
        Teman teman;
        ArrayList<Teman> list = new ArrayList<>();
        for (String[] aData : data) {
            teman = new Teman();
            teman.setNim(aData[0]);
            teman.setNama(aData[1]);
            teman.setKelas(aData[2]);
            teman.setEmail(aData[3]);
            teman.setSosmed(aData[4]);
            teman.setTelp(aData[5]);

            list.add(teman);
        }
        return list;
    }
}
