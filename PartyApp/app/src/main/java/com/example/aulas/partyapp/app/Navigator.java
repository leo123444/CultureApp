package com.example.aulas.partyapp.app;

import com.example.aulas.partyapp.partyapp.Home.Home;
import com.example.aulas.partyapp.partyapp.SearchParty.Search;

/**
 * Created by eleonora on 18/03/2017.
 */

public interface Navigator {
    void goToSearchScreen(Home.HomeToSearch presenter);

    void goToAddScreen(Home.HomeToAdd presenter);
}
