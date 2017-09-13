package jiun.com.panda;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import jiun.com.panda.activity.Main2Activity;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    int a = 2;
    private ImageView image;
    private LinearLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        image = (ImageView) findViewById(R.id.image);
        activity_main = (LinearLayout) findViewById(R.id.activity_main);
        handler.postDelayed(runnable, 2000);
    }

    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            a--;

            if (a < 1) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();
            } else {

                handler.postDelayed(runnable, 2000);
            }
        }
    };

}