package com.example.wangq.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wangq.myapplication.R;
import com.example.wangq.myapplication.model.Content;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView ls=(ListView)findViewById(R.id.lv);
        List<Content> list=new ArrayList<Content>();
        for(int i=1;i<=20;i++){
            list.add(new Content("http://www","我是标题"+i,"2018-1-1"));
        }
        ls.setAdapter(new MyAdapter(list));
    }

    private class MyAdapter extends BaseAdapter{
        private List<Content> mylist;

        public MyAdapter(List<Content> list){
            this.mylist=list;
        }
        @Override
        public int getCount() {
            return mylist.size();
        }

        @Override
        public Object getItem(int position) {
            Log.i("test","item"+position);
            return mylist.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Log.i("test","Position:"+position+",View:"+convertView+",ViewGroup:"+parent);
            Content content=(Content) getItem(position);
            //findViewById(R.id.lv);  --这个只能查找本Activity中的对象。ListItem在list_item.xml中，不能用这种方法。
            View list_item=null;
            if (convertView!=null){
                //convertView是getView方法的参数，用来表示已经使用过的，而且移除可视区域的list_item;由系统调用时传入。
                list_item=convertView;
            }else {
                //不在Activity中的对象，用如下方法获得layout目录下的布局文件：
                list_item = View.inflate(Main2Activity.this, R.layout.list_item, null);
            }
            TextView txt_url=(TextView) list_item.findViewById(R.id.url);
            TextView txt_title=(TextView) list_item.findViewById(R.id.title);
            TextView txt_date=(TextView) list_item.findViewById(R.id.datestr);
            txt_url.setText(content.getImgUrl());
            txt_title.setText(content.getTitile());
            txt_date.setText(content.getDate());
            return list_item;
        }
    }
}
