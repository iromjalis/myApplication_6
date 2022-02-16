package fi.irinaromjalis.myapplication_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreate method");
        ListView mListView = findViewById(R.id.listView);

        ArrayList<President> presidentList = new ArrayList<>();

        //adding items to arrayList

        presidentList.add(new President("Stahlberg, Kaarlo Juho", "1919- 1925", "Eka presidentti"));
        presidentList.add(new President("Relander, Lauri Kristian", "1925 - 1931", "Reissulasse"));
        presidentList.add(new President("Svinhufvud, Pehr, Evind", "1931 - 1937", "Ukko-Pekka"));
        presidentList.add(new President("Kallio, Kyosti", "1937 - 1940", "Neljas presidentti"));
        presidentList.add(new President("Ryti, Risto Heikki", "1940 - 1944", "Nuorena Kustu Kalliokangas"));
        presidentList.add(new President("Mannerheim, Carl Gustav", "1944 - 1946", "Marski"));
        presidentList.add(new President("Paasikivi, Juho Kusti", "1946 - 1956", "Äkäinen ukko"));
        presidentList.add(new President("Kekkonen, Urho Kaleva", "1956 - 1982", "Pelimies"));
        presidentList.add(new President("Koivisto, Mauno Henrik", "1982 - 1994", "Manu"));
        presidentList.add(new President("Ahtisaari, Martti Oiva", "1994 - 2000", "Mahtisaari"));
        presidentList.add(new President("Ahtisaari, Martti Oiva", "1994 - 2000", "Mahtisaari"));
        presidentList.add(new President("Ahtisaari, Martti Oiva", "1994 - 2000", "Mahtisaari"));
        PresidentListAdapter adapter = new PresidentListAdapter(this, R.layout.adapter_view_layout, presidentList);
        mListView.setAdapter(adapter);

        //to second activity

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.d(TAG, "onItemClick method, " + presidentList.get(i));

                President str = presidentList.get(i);

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("name", str.getName());
                intent.putExtra("date", str.getDate());
                intent.putExtra("freeText", str.getFreetext());
                startActivity(intent);
            }
        });
    }

}