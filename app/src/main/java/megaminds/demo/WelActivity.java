package megaminds.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
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

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                        @Override
                                        public void onItemClick(AdapterView<?> parent, View view,
                                                                int position, long id) {
                                            String Slecteditem = itemname[+position];
                                            view.setSelected(true);
                                            Intent intent = new Intent(WelActivity.this, SingleActivity.class);
                                            WelActivity.this.startActivity(intent);
                                        }


                                    }

        );
    }
}
