package com.example.listveiw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class sandeepadapter extends ArrayAdapter<String> {

    public sandeepadapter(@NonNull Context context, @NonNull String[] arr) {
        super(context, 0, arr);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layout, parent, false);
            holder = new ViewHolder();
            holder.profileImage = convertView.findViewById(R.id.gmail_profile_picture);
            holder.senderName = convertView.findViewById(R.id.gmail_sender_name);
            holder.subject = convertView.findViewById(R.id.gmail_subject_line);
            holder.messageSnippet = convertView.findViewById(R.id.gmail_message_snippet);
            holder.timestamp = convertView.findViewById(R.id.gmail_timestamp);
            holder.starIcon = convertView.findViewById(R.id.gmail_star_icon);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String currentItem = getItem(position);


        if (currentItem != null) {
            holder.senderName.setText("Sender: " + currentItem);
            holder.subject.setText("Subject: This is a test email");
            holder.messageSnippet.setText("Snippet: " + currentItem);
            holder.timestamp.setText("11:45 PM");


            holder.starIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Starred item at position: " + position, Toast.LENGTH_SHORT).show();
                }
            });
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Clicked on email from: " + currentItem, Toast.LENGTH_SHORT).show();
                }
            });
        }


        return convertView;
    }

    static class ViewHolder {
        ImageView profileImage;
        TextView senderName;
        TextView subject;
        TextView messageSnippet;
        TextView timestamp;
        ImageView starIcon;
    }
}