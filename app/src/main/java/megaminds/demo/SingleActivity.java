package megaminds.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleActivity extends AppCompatActivity {

    ImageView imageView;
    TextView text1,text2,text3,text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);



    }
}
