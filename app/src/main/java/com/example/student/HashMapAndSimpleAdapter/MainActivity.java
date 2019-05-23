package com.example.student.HashMapAndSimpleAdapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private SimpleAdapter sa;
    ArrayList<Map<String,Object>> mylist= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        HashMap<String,Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img",R.drawable.taipei);
        mylist.add(m1);
        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img",R.drawable.taichun);
        mylist.add(m2);
        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "高雄");
        m3.put("code", "07");
        m3.put("img",R.drawable.kaishon);
        mylist.add(m3);

        sa=new SimpleAdapter(MainActivity.this,
                mylist,
                R.layout.myitem,               //如果是用自己的版型，R前面不用放android.
                new String[]{"city","code","img"},
                new int[]{R.id.t1,R.id.t2,R.id.iv});

        lv.setAdapter(sa);


    }
}
