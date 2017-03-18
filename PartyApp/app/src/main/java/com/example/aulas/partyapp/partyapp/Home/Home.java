package com.example.aulas.partyapp.partyapp.Home;

import android.content.Context;

/**
 * Created by eleonora on 18/03/2017.
 */

public interface Home {



    interface ToHome {
        void onScreenStarted();
        void setToolbarVisibility(boolean visible);
        void setTextVisibility(boolean visible);
    }

    interface HomeTo {
        Context getManagedContext();
        void destroyView();

        boolean isTextVisible();
    }
  interface HomeToAdd{
   boolean isTitleVisible();

      Context getManagedContext();
  }

    public interface HomeToSearch {
        Context getManagedContext();

        boolean isTextVisible();

        void destroyView();
    }
    ///////////////////////////////////////////////////////////////////////////////////
    // Screen ////////////////////////////////////////////////////////////////////////

    /**
     * Methods offered to VIEW to communicate with PRESENTER
     */


}
