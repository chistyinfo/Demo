package megaminds.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class WelActivity extends AppCompatActivity {
    ListView list1;
    String[] itemname ={"Napa,Neo-track","Disel"};
    Integer[] imgid={R.drawable.pic1,R.drawable.pic2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list1 = (ListView) findViewById(R.id.list1);
        list1.setAdapter(adapter);
    }
}
