package com.example.tp3;

import android.widget.Toast;
import java.util.ArrayList;
public class Data
{
    public ArrayList<String> planetes;
    private String[] taillePlanetes = {"49000", "12000", "12800", "6800", "144000", "120000",
            "52000", "50000", "2300"};

    public void installePlanetes() {
        planetes = new ArrayList<String>();
        planetes.add("Mercure");
        planetes.add("Venus");
        planetes.add("Terre");
        planetes.add("Mars");
        planetes.add("Jupiter");
        planetes.add("Saturne");
        planetes.add("Uranus");
        planetes.add("Neptune");
        planetes.add("Pluton");
    }
    public Data()
    {
        installePlanetes();
    }
    public String[] getTaillePlanetes() {
        return taillePlanetes;
    }
    public ArrayList<String> getPlanetes() {
        return planetes;
    }
}