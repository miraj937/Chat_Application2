package com.gisha.chat_application2;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gisha.chat_application2.messages.messageList;
import com.gisha.chat_application2.messages.messagesAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<messageList>data = new ArrayList<>();
    private RecyclerView messagesRecyclerView;

//    SmsManager smsManager = SmsManager.getDefault();
//    private static final int READ_SMS_PERMISSIONS_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messagesRecyclerView = findViewById(R.id.messagesRecyclerView);

        data.add(new messageList("miraj", "hi",  2));
        data.add(new messageList("miraj", "hi",  2));
        data.add(new messageList("miraj", "hi",  2));
        data.add(new messageList("miraj", "hi",  2));


        messagesAdapter messagesAdapter = new messagesAdapter(this,data);
        messagesRecyclerView.setAdapter(messagesAdapter);
        messagesRecyclerView.setHasFixedSize(true);
        messagesRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }
//    public void viewMessage(){
//        final String getName = new String();
//        messageList messageList = new messageList(getName,"",0);
//        messageLists.add(messageList);
//
//    }

//    public void refreshSmsInbox() {
//        ContentResolver contentResolver = getContentResolver();
//        Cursor smsInboxCursor = contentResolver.query(Uri.parse("content://sms/inbox"), null, null, null, null);
//        int indexBody = smsInboxCursor.getColumnIndex("body");
//        int indexAddress = smsInboxCursor.getColumnIndex("address");
//        if (indexBody < 0 || !smsInboxCursor.moveToFirst()) return;
//        arrayAdapter.clear();
//        do {
//            String str = "SMS From: " + smsInboxCursor.getString(indexAddress) +
//                    "\n" + smsInboxCursor.getString(indexBody) + "\n";
//            arrayAdapter.add(str);
//        } while (smsInboxCursor.moveToNext());
//
//    }
}