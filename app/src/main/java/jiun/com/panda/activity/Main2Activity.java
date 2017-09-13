package jiun.com.panda.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import jiun.com.panda.R;
import jiun.com.panda.fragment.BoBaoFragment;
import jiun.com.panda.fragment.ChinaLiveFragment;
import jiun.com.panda.fragment.HomeFragment;
import jiun.com.panda.fragment.PandaLiveFragment;
import jiun.com.panda.fragment.ViedoFragment;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private ImageView main_toolbat_img;
    private Toolbar main_toolbar;

    private RadioButton main_home;
    private RadioButton main_live;
    private RadioButton main_video;
    private RadioButton main_broadcast;
    private RadioButton main_china;
    private RadioGroup main_tab_bar;
    private LinearLayout activity_main2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        initData();
    }

    private void initData() {
    }

    private void initView() {
        main_toolbat_img = (ImageView) findViewById(R.id.main_toolbat_img);
        main_toolbar = (Toolbar) findViewById(R.id.main_toolbar);

        main_home = (RadioButton) findViewById(R.id.main_home);
        main_live = (RadioButton) findViewById(R.id.main_live);
        main_video = (RadioButton) findViewById(R.id.main_video);
        main_broadcast = (RadioButton) findViewById(R.id.main_broadcast);
        main_china = (RadioButton) findViewById(R.id.main_china);
        main_tab_bar = (RadioGroup) findViewById(R.id.main_tab_bar);
        activity_main2 = (LinearLayout) findViewById(R.id.activity_main2);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        main_home.setOnClickListener(this);
        main_live.setOnClickListener(this);
        main_video.setOnClickListener(this);
        main_broadcast.setOnClickListener(this);
        main_china.setOnClickListener(this);

        List<Fragment> list = new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new PandaLiveFragment());
        list.add(new ViedoFragment());
        list.add(new BoBaoFragment());
        list.add(new ChinaLiveFragment());
        //viewPager的Adapter
     PagerAdapter pageAdapter=new jiun.com.panda.adapter.PagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pageAdapter);
    }

    @Override
    public void onClick(View v) {
        main_home.setBackgroundColor(Color.parseColor("#ffffff"));
        main_live.setBackgroundColor(Color.parseColor("#ffffff"));
        main_video.setBackgroundColor(Color.parseColor("#ffffff"));
        main_broadcast.setBackgroundColor(Color.parseColor("#ffffff"));
        main_china.setBackgroundColor(Color.parseColor("#ffffff"));
        switch (v.getId()) {
            case R.id.main_home:
                viewPager.setCurrentItem(0);
                main_home.setBackgroundColor(R.color.hui);
                break;
            case R.id.main_live:
                viewPager.setCurrentItem(1);
                main_live.setBackgroundColor(R.color.hui);
                break;
            case R.id.main_video:
                viewPager.setCurrentItem(2);
                main_video.setBackgroundColor(R.color.hui);
                break;
            case R.id.main_broadcast:
                viewPager.setCurrentItem(3);
                main_broadcast.setBackgroundColor(R.color.hui);
                break;
            case R.id.main_china:
                viewPager.setCurrentItem(4);
                main_china.setBackgroundColor(R.color.hui);
                break;
        }
    }
}
