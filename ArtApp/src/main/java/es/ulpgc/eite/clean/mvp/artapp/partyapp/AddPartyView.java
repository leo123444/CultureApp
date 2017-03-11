package es.ulpgc.eite.clean.mvp.artapp.partyapp;

import android.animation.TimeAnimator;
import android.app.Activity;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by eleonora on 11/03/2017.
 */

public class AddPartyView extends Activity {
     TextView title;
    TextView place;
    TextView date;
    TextView initTime;
    TextView finishTime;

   EditText placeTxt;
    DatePicker datePick;
    TimePicker init;
    TimePicker finish;
    Button publish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.activity_AddParty);
        title= (TextView) findViewById(android.R.id.textView);

        place = (TextView) findViewById(android.R.id.textPlace);
        date= (TextView) findViewById(android.R.id.textDate);
        initTime=(TextView) findViewById(android.R.id.textViewInit);
        finishTime=(TextView)findViewById(android.R.id.textViewFinish);
        placeTxt=(EditText)findViewById(R.id.editTextPlace);
        datePick=(DatePicker)findViewById(R.id.DatePicker);
        init=(TimePicker)findViewById(R.id.TimePicker);
        finish=(TimePicker)findViewById(R.id.TimePickerFinish);
        publish=(Button)findViewById(R.id.buttonPublish);

    }




}
