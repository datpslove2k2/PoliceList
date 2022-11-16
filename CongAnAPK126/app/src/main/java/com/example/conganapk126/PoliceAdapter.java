package com.example.conganapk126;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PoliceAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List <PoliceItem> policeItemList;

    public PoliceAdapter(Context context, int layout, List<PoliceItem> policeItemList) {
        this.context = context;
        this.layout = layout;
        this.policeItemList = policeItemList;
    }
    @Override
    public int getCount() {
        return policeItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        private ImageView imgPolice;
        private TextView txtName, txtRank, txtWorkPlace, txtCountry, txtStar;

    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            // anh xa view
            holder.txtName = (TextView) view.findViewById(R.id.txt_Name);
            holder.txtRank = (TextView) view.findViewById(R.id.txt_Rank);
            holder.txtWorkPlace = (TextView) view.findViewById(R.id.txt_WorkPlace);
            holder.txtCountry = (TextView) view.findViewById(R.id.txt_Country);
            holder.txtStar = (TextView) view.findViewById(R.id.txt_Star);
            holder.imgPolice = (ImageView) view.findViewById(R.id.img);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        // gan gia tri
        PoliceItem policeList= policeItemList.get(i);


        holder.txtName.setText(policeList.getTxtName());
        holder.txtRank.setText(policeList.getTxtRank());
        holder.txtWorkPlace.setText(policeList.getTxtWorkPlace());
        holder.txtCountry.setText(policeList.getTxtCountry());
        holder.txtStar.setText(String.valueOf(policeList.getTxtStar()));
        holder.imgPolice.setImageResource(policeList.getImg());
        return view;
    }
}

