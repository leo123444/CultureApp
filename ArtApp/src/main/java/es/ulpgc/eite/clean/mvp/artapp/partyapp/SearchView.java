package es.ulpgc.eite.clean.mvp.artapp.partyapp;

import android.app.Activity;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.R;
import android.R.*;

/**
 * Created by eleonora on 10/03/2017.
 */

public class SearchView extends Activity implements Search {
TextView textTitle;
    TextView textLocation;
    TextView textCategory;
    TextView textCalendar;
    EditText location;
    ListView categories;
    Calendar date;
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        textTitle= (TextView) findViewById(R.id.textView);

        textLocation = (TextView) findViewById(R.id.textLocation);
        location=(EditText) findViewById(R.id.editTextLocation);

        textCategory=(TextView)findViewById(R.id.textCategories);
        categories=(ListView)findViewById(R.id.listcategories);
        String[]fiestas= new String[]{"Verbenas","Conciertos","Culturales","Folclóricas"};
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(this, layout.simple_list_item_1, fiestas);
        categories.setAdapter(adaptador);

        textCalendar=(TextView)findViewById(R.id.textDate);
        date=(Calendar)findViewById(R.id.calendarView);

        search=(Button)findViewById(R.id.buttonSearch);

    }


    @Override
    public void setSearchBtnLabel(String txt) {
        search.setText(txt);
    }

}
