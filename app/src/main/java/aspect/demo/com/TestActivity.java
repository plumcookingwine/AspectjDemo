package aspect.demo.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.mTvClick);

        tv.setOnClickListener(v->{
            App.isDebug = !App.isDebug;
            test();
        });

        test();
    }


    @Debug
    public void test() {
        Toast.makeText(this, "no debug", Toast.LENGTH_LONG).show();
    }
}
