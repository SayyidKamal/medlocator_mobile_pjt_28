package team28.zuri.medlocator.Activities.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Faq1 = new ArrayList<String>();
        Faq1.add("No, this application is mainly for patients to find the nearest pharmacy that has the medicine they are looking for.");

        List<String> Faq2 = new ArrayList<String>();
        Faq2.add("No, this application is mainly for patients to find the nearest pharmacy that has the medicine they are looking for.");

        List<String> Faq3 = new ArrayList<String>();
        Faq3.add("No, this application is mainly for patients to find the nearest pharmacy that has the medicine they are looking for.");

        expandableListDetail.put("Can I make an order on this app?", Faq1);
        expandableListDetail.put("Can I chat live with a pharmacist?", Faq2);
        expandableListDetail.put("Is the drug price fixed or negotiable?", Faq3);
        return expandableListDetail;
    }
}
