package com.example.aulas.partyapp.partyapp.SearchParty;

import android.content.Context;

/**
 * Created by eleonora on 10/03/2017.
 */

public interface Search {


    interface ToSearch {
        void onScreenStarted();
        void setToolbarVisibility(boolean visible);
        void setTextVisibility(boolean visible);
    }

    interface SearchTo {
        Context getManagedContext();
        void destroyView();

        boolean isTextVisible();
    }

}
