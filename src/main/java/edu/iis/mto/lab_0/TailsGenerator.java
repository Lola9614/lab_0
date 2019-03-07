package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        if (value == null) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < value.length(); i++) {
            list.add(value.substring(i, value.length()));
        }

        list.add("");

        return list;
    }
}
