package com.example.mytest1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter <News>{
    private int resourceId;
    public NewsAdapter(Context context, int textViewResourceId, List<News> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News news=getItem(position);
        View view;
        Viewholder viewholder;
        if (convertView==null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewholder=new Viewholder();
            viewholder.NewsName=view.findViewById(R.id.news_id);
            viewholder.NewsImage=view.findViewById(R.id.news_image);
            view.setTag(viewholder);
        }
        else {
            view=convertView;
            viewholder=(Viewholder) view.getTag();
        }
        viewholder.NewsName.setText(news.getNewsname());
        viewholder.NewsImage.setImageResource(news.getNewsimageId());
        return view;
    }
    class Viewholder{
        ImageView NewsImage;
        TextView NewsName;
    }
}
