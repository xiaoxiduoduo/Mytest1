package com.example.mytest1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   // private String[] data1={"心情日历","心率分析","同城心理温度分布","自我聊天室","调节方式推送","注意事项","睡眠情况","生理健康"};
   private List<Healthy> healthyList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHealthy();
        HealthyAdapter adapter=new HealthyAdapter(MainActivity.this,R.layout.healthy_item,healthyList);
        ImageView imageView1=(ImageView)findViewById(R.id.image1);
        ImageView imageView2=(ImageView)findViewById(R.id.image2);
        ImageView imageView3=(ImageView)findViewById(R.id.image3);
        ImageView imageView4=(ImageView)findViewById(R.id.image4);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
      //  ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,data1);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Healthy healthy=healthyList.get(position);
                switch (healthy.getName()){
                    case "心情日历":
                        Toast.makeText(MainActivity.this,"心情日历曲线图",Toast.LENGTH_SHORT).show();
                        break;
                    case "心率分析":
                        Toast.makeText(MainActivity.this,"心率曲线图",Toast.LENGTH_SHORT).show();
                        break;
                    case "同城心理温度分布图":
                        Toast.makeText(MainActivity.this,"同城心理温度分布图",Toast.LENGTH_SHORT).show();
                        break;
                    case "自我聊天室":
                        Toast.makeText(MainActivity.this,"自我聊天室",Toast.LENGTH_SHORT).show();
                        break;
                    case "调节方式推送":
                        Toast.makeText(MainActivity.this,"调节方式推送",Toast.LENGTH_SHORT).show();
                        break;
                    case "注意事项":
                        Toast.makeText(MainActivity.this,"注意事项",Toast.LENGTH_SHORT).show();
                        break;
                    case "睡眠分析":
                        Toast.makeText(MainActivity.this,"睡眠分析",Toast.LENGTH_SHORT).show();
                        break;
                    case "生理健康":
                        Toast.makeText(MainActivity.this,"生理健康",Toast.LENGTH_SHORT).show();
                        break;
                    default:break;
                }
            }
        });
    }
    public void initHealthy(){
            Healthy xinqing=new Healthy("心情日历",R.drawable.heart);
            healthyList.add(xinqing);
            Healthy xinlv=new Healthy("心率分析",R.drawable.analytics);
            healthyList.add(xinlv);
            Healthy wendu=new Healthy("同城心理温度分布图",R.drawable.temperature);
            healthyList.add(wendu);
            Healthy chat=new Healthy("自我聊天室",R.drawable.doorchat);
            healthyList.add(chat);
            Healthy tiaojie=new Healthy("调节方式推送",R.drawable.news);
            healthyList.add(tiaojie);
            Healthy tixing=new Healthy("注意事项",R.drawable.note);
            healthyList.add(tixing);
            Healthy sleep=new Healthy("睡眠分析",R.drawable.sleep);
            healthyList.add(sleep);
            Healthy shengli=new Healthy("生理健康",R.drawable.healthy);
            healthyList.add(shengli);
    }
}
