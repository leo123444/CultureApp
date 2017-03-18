package com.example.aulas.partyapp.partyapp.Add;

import android.content.Context;

/**
 * Created by eleonora on 18/03/2017.
 */

public interface Add {
    interface ToAdd {
        void onScreenStarted();

        void setTextVisibility(boolean visible);
    }

    interface AddTo {
        Context getManagedContext();
        void destroyView();


    }

}
