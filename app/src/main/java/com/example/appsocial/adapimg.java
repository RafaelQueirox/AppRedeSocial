package com.example.appsocial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adapimg extends BaseAdapter {

    Context context;
    String listtext[];
    int listimage[];
    LayoutInflater inflater;

    public adapimg(Context ctx, String[] texto, int [] images){
        this.context = ctx;
        this.listtext=texto;
        this.listimage=images;
        inflater = LayoutInflater.from(ctx);
    }



    @Override
    public int getCount() {
        return listimage.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.modelolista, null);
        TextView texto1=(TextView) view.findViewById(R.id.textolista);
        ImageView img = (ImageView)
                view.findViewById(R.id.imagemlista);
        texto1.setText(listtext[i]);
        img.setImageResource(listimage[i]);
        return view;
    }
}
