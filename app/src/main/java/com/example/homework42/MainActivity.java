package com.example.homework42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText time_arrivein;
    private EditText time_comein;
    private EditText idin;
    private EditText placein;
    private EditText costin;
    private Button createticket;
    private String id;
    private String time_come;
    private String time_arrive;
    private String place;
    private String cost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time_arrivein = findViewById(R.id.timearrive);
        idin = findViewById(R.id.id);
        time_comein = findViewById(R.id.timecome);
        placein = findViewById(R.id.place);
        costin = findViewById(R.id.cost);
        createticket = findViewById(R.id.createticket);

        createticket.setOnClickListener(listener);


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            cost = costin.getText().toString();
            id = idin.getText().toString();
            time_come = time_comein.getText().toString();
            time_arrive = time_arrivein.getText().toString();
            place = placein.getText().toString();
            Ticket ticket = new Ticket(id,time_come,time_arrive,place,cost);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra(Ticket.class.getSimpleName(), ticket);

            startActivity(intent);

        }


    };
}
