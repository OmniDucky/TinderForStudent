package com.example.highschool_tinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.highschool_tinder.R;
import com.example.highschool_tinder.cards;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<cards> {
    Context context;
    public CustomArrayAdapter(Context context, int resourceId, List<cards> items){
        super(context,resourceId,items);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        cards card_item = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        name.setText(card_item.getName());
        image.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }
}
