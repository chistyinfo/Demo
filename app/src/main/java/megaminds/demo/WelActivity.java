package megaminds.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class WelActivity extends AppCompatActivity {
    ListView list1;
    String[] itemname ={"Napa\n120mg\nNapa","Neo-Tracks\n105mg\n","Histasin\n10mg\nRespiratory System"};
    Integer[] icon={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, icon);
        list1 = (ListView) findViewById(R.id.list1);
        list1.setAdapter(adapter);
    }
}
