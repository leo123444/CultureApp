package com.example.aulas.partyapp.partyapp.Add;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.aulas.partyapp.R;

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
        setContentView(R.layout.activity_AddParty);
        title= (TextView) findViewById(R.id.textView);

        place = (TextView) findViewById(R.id.textPlace);
        date= (TextView) findViewById(R.id.textDate);
        initTime=(TextView) findViewById(R.id.textViewInit);
        finishTime=(TextView)findViewById(R.id.textViewFinish);
        placeTxt=(EditText)findViewById(R.id.editTextPlace);
        datePick=(DatePicker)findViewById(R.id.datePicker);
        init=(TimePicker)findViewById(R.id.timePicker);
        finish=(TimePicker)findViewById(R.id.timePickerFinish);
        publish=(Button)findViewById(R.id.buttonPublish);

    }




}
