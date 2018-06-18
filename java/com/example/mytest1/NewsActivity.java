package com.example.mytest1;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.LinkedList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {
    private List<News> newsList=new LinkedList<>();

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_main);
        ActionBar actionBar=getSupportActionBar();
        RadioButton radioButton1=(RadioButton)findViewById(R.id.radio0);
        RadioButton radioButton3=(RadioButton)findViewById(R.id.radio2);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewsActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(NewsActivity.this,DocActivity.class);
                startActivity(intent1);
            }
        });
        if (actionBar!=null){
            actionBar.hide();
        }
        initNews();
        final NewsAdapter newsAdapter=new NewsAdapter(NewsActivity.this,R.layout.news_item,newsList);
        ListView listview1=(ListView)findViewById(R.id.list_view1);
        listview1.setAdapter(newsAdapter);
        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              News news=newsList.get(position);
            }
        });
    }
    public void initNews(){
        News tijian=new News("体检通知",R.drawable.notification);
        newsList.add(tijian);
        News shuimian=new News("睡眠提示",R.drawable.sleep);
        newsList.add(shuimian);
        News jiarren=new News("家人信息",R.drawable.family);
        newsList.add(jiarren);
    }
}
