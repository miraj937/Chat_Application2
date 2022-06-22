package com.gisha.chat_application2.messages;

import static android.view.LayoutInflater.from;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gisha.chat_application2.R;

import java.util.ArrayList;

public class messagesAdapter extends RecyclerView.Adapter<messagesAdapter.MyViewHolder> {
   private final ArrayList<messageList> data;
   Context context;

    public messagesAdapter(Context context, ArrayList<messageList> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = from(context);
        View view = inflater.inflate(R.layout.message_adapter_layout, parent, false);
        return new messagesAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull messagesAdapter.MyViewHolder holder, int position) {
//change data held by the view
        holder.textviewAcct.setText(data.get(position).getName());
        holder.textviewUnseen.setText(data.get(position).getUnseenMessages().toString());
        holder.textviewDetails.setText(data.get(position).getLastmessage());

    }

    @Override
    public int getItemCount() {

        return data.size();
    }

   public static class MyViewHolder extends RecyclerView.ViewHolder{

            TextView textviewAcct, textviewDetails, textviewUnseen;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textviewAcct = itemView.findViewById(R.id.account_name);
            textviewDetails = itemView.findViewById(R.id.some_information);
            textviewUnseen = itemView.findViewById(R.id.unseen);

        }
    }
}
