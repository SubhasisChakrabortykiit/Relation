package com.almanac.subhasis.relation;

/**
 * Created by 1415039 on 11-02-2016.
 */
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Arrayadapterclass extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] name;
    private final String[] description;
    private final Integer[] imageIds;

    public Arrayadapterclass(
            Activity context, String[] name, String[] description, Integer[] imageIds) {
        super(context, R.layout.activity_row, name);
        this.context = context;
        this.name = name;
        this.description = description;
        this.imageIds = imageIds;
    }
    static class ViewContainer {
        public ImageView imageView;
        public TextView txtTitle;
        public TextView txtDescription;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        ViewContainer viewContainer;
        View rowView = view;
        if (rowView == null){
        inflater = context.getLayoutInflater();
        rowView = inflater.inflate(R.layout.activity_row, null, true);
         viewContainer = new ViewContainer();

            //---get the references to all the views in the row---
          viewContainer.txtTitle = (TextView)
                    rowView.findViewById(R.id.Name);
          viewContainer.txtDescription = (TextView)
                    rowView.findViewById(R.id.rel);
          viewContainer.imageView = (ImageView) rowView.findViewById(R.id.img);

            //---assign the view container to the rowView---
          rowView.setTag(viewContainer);
        }
        else
        {
            viewContainer = (ViewContainer) rowView.getTag();
        }
        viewContainer.txtTitle.setText(name[position]);
        viewContainer.txtDescription.setText(description[position] +
                "");
        viewContainer.imageView.setImageResource(imageIds[position]);
        return rowView;

    }}