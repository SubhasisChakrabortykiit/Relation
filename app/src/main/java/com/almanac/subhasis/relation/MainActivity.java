package com.almanac.subhasis.relation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] name={
            "Mr. Super Daddy",
            "Mrs. Lovely Mom",
            "Ms. Crazy Sis",
            "Mr. Rocky Brother",
            "Mr. Grandpa",
            "Mrs. GrandMom",
            "Mrs. Aunty"
    }; 
    String[] description={
            "He is a super dad ",
            "She cares for us a lot",
            "Always crazy about her luks",
            "Fifa fever",
            "Brave Grandpa",
            "Evergreen Grandmom",
            "Awesome aunt"
    };
    Integer[] ImageId={
            R.drawable.father4,
            R.drawable.mom,
            R.drawable.sis,
            R.drawable.boy,
            R.drawable.grandpa,
            R.drawable.grandma,
            R.drawable.aunt
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Arrayadapterclass adapter =new Arrayadapterclass(this, name, description, ImageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }


}

