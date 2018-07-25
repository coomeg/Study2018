package com.mycompany.memoapp;

import android.app.*;
import android.os.*;

public class ListActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button fab = (Button) findViewById(R.id.memoButton2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("List_Activity", "List_Activityに遷移");
                Intent intent = new Intent(Basic_Activity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
