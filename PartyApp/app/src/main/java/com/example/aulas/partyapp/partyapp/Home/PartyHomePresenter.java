package com.example.aulas.partyapp.partyapp.Home;

import android.content.Intent;

import com.example.aulas.partyapp.MainActivity;
import com.example.aulas.partyapp.partyapp.Add.AddPartyView;
import com.example.aulas.partyapp.partyapp.SearchParty.SearchView;

/**
 * Created by Aulas on 18/03/2017.
 */

public class PartyHomePresenter {
   MainActivity view;
    public PartyHomePresenter(){
        this.view= new MainActivity();
    }
    public void onButtonSearchPressed(){
     view.startActivity(new Intent(view,SearchView.class));
    }
    public void onButtonAddPressed(){
        view.startActivity(new Intent(view,AddPartyView.class));
    }


}
