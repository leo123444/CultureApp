package com.example.aulas.partyapp.app;
import com.example.aulas.partyapp.partyapp.Home.Home;
import com.example.aulas.partyapp.partyapp.SearchParty.Search;
import com.example.aulas.partyapp.partyapp.Add.Add;
/**
 * Created by eleonora on 18/03/2017.
 */




public interface Mediator {


    void startingHomeScreen(Home.ToHome presenter);

    void startingSearchScreen(Search.ToSearch presenter);

    void startingAddScreen(Add.ToAdd presenter);


}

