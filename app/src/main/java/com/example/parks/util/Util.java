package com.example.parks.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Util {
    public static final String PARKS_URL = "https://developer.nps.gov/api/v1/parks?parkCode=wa&api_key=KN0569Es4ucBp0m2H8HSbewu8evHjKrxdq225gMw";
    public static String getParksUrl(String stateCode){
        return "https://developer.nps.gov/api/v1/parks?parkCode="+stateCode+"&api_key=KN0569Es4ucBp0m2H8HSbewu8evHjKrxdq225gMw";
    }
    public static void hideSoftKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(
                Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }

}
