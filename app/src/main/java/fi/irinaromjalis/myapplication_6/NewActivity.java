package fi.irinaromjalis.myapplication_6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
//    private static final String TAG = "NewActivity";
    TextView name, date, text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name = findViewById(R.id.textView7);

        String incomingName1 = getIntent().getStringExtra("name");
        name.setText(incomingName1);


        date = findViewById(R.id.textView8);

        String incomingName2 = getIntent().getStringExtra("date");
        date.setText(incomingName2);


        text = findViewById(R.id.textView9);


        String incomingName3 = getIntent().getStringExtra("freeText");
        text.setText(incomingName3);

    }
}