package com.example.basiclistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class sandeepadapter extends ArrayAdapter<String> {
    public sandeepadapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layout, parent, false);
            holder = new ViewHolder();
            holder.text = convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
            Button button = convertView.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Clicked on Mail :"+position, Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        String item = getItem(position);
        holder.text.setText(item);
        return convertView;
    }

    static class ViewHolder {
        TextView text;
    }
}