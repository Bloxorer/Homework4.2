package com.example.homework42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView ticketfin;
    private Button returnbut;
    private Ticket ticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        returnbut = findViewById(R.id.returnbut);
        ticketfin = findViewById(R.id.ticketfin);

        Bundle getintent = getIntent().getExtras();
        if (getintent != null){
            ticket = (Ticket) getintent.getSerializable(Ticket.class.getSimpleName());

            ticketfin.setText("Id:" + ticket.getId() + "\n" + "Место:" + ticket.getPlace() +"\n" + "Время отправления:" + ticket.getTime_arrive() + "\n" + "Время прибытия:" + ticket.getTime_come() + "\n" + "Стоимость:" + ticket.getCost());
        }

        returnbut.setOnClickListener(listener);

    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);

        }
    };
}