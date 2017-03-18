package com.example.aulas.partyapp.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.example.aulas.partyapp.partyapp.Add.Add;
import com.example.aulas.partyapp.partyapp.Add.AddPartyView;
import com.example.aulas.partyapp.partyapp.Home.Home;
import com.example.aulas.partyapp.partyapp.SearchParty.Search;
import com.example.aulas.partyapp.partyapp.SearchParty.SearchView;

/**
 * Created by eleonora on 18/03/2017.
 */

public class App extends Application implements Mediator,Navigator{
private HomeState toHomeState,homeToSearch;
private AddState toAddState,homeToAdd;
    private SearchState toSearchState;
    @Override
    public void onCreate() {
        super.onCreate();
        toHomeState = new HomeState();
        toHomeState.textVisibility = true;
    }

    @Override
    public void startingHomeScreen(Home.ToHome presenter){
        if( toHomeState!= null) {

            presenter.setTextVisibility(toHomeState.textVisibility);
        }
        presenter.onScreenStarted();
    }



    @Override
    public void startingSearchScreen(Search.ToSearch presenter){
        if(toSearchState != null) {
            presenter.setTextVisibility(toSearchState.titleVisibility);
            //presenter.setTextVisibility(toHelloState.textVisibility);
        }
        presenter.onScreenStarted();
    }

@Override
public void startingAddScreen(Add.ToAdd presenter){
if(toAddState!=null){
    presenter.setTextVisibility(toAddState.titleVisibility);
}
presenter.onScreenStarted();
}

    @Override
    public void goToSearchScreen(Home.HomeToSearch presenter) {
        homeToSearch = new HomeState();

        homeToSearch.textVisibility = presenter.isTextVisible();

        Context view = presenter.getManagedContext();
        if (view != null) {
            view.startActivity(new Intent(view, SearchView.class));
            presenter.destroyView();
        }

    }


    @Override
    public void goToAddScreen(Home.HomeToAdd presenter) {
        homeToAdd = new AddState();
       homeToAdd.titleVisibility = presenter.isTitleVisible();
        //helloToByeState.textVisibility = presenter.isTextVisible();

        Context view = presenter.getManagedContext();
        if (view != null) {
            view.startActivity(new Intent(view, AddPartyView.class));
            //presenter.destroyView();
        }

    }

    private class HomeState {

        boolean textVisibility;
    }
private class SearchState{
    boolean titleVisibility;
}
private class AddState{
    boolean titleVisibility;

}
}
