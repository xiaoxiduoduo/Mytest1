package com.example.mytest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HealthyAdapter extends ArrayAdapter<Healthy> {
    private int resourceId;

    public HealthyAdapter(Context context, int textViewResourceId, List<Healthy> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    public View getView ( int position, View convertView, ViewGroup parent){
      Healthy healthy=getItem(position);
      View view;
      Viewholder viewholder;
      if (convertView==null){

          view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
          viewholder=new Viewholder();
          viewholder.healthyImage=(ImageView)view.findViewById(R.id.healthy_image);
          viewholder.healthyName=view.findViewById(R.id.healthy_id);
          view.setTag(viewholder);
      }else {
          view=convertView;
          viewholder=(Viewholder) view.getTag();
      }
       viewholder.healthyImage.setImageResource(healthy.getImageId());
      viewholder.healthyName.setText(healthy.getName());
//        ImageView healthyImage=(ImageView)view.findViewById(R.id.healthy_image);
//        TextView healthyName=(TextView)view.findViewById(R.id.healthy_id);
//        healthyImage.setImageResource(healthy.getImageId());
//        healthyName.setText(healthy.getName());
      return view;
    }
    class Viewholder{
        ImageView healthyImage;
        TextView healthyName;
    }
}
