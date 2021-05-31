package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view)
    {
       // Toast.makeText(this,"how are you",Toast.LENGTH_SHORT).show();
        View inflaterLayout=getLayoutInflater().inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.andbut));
        Toast toast=new Toast(getApplicationContext());
        //toast.setText("sanjaay");
        toast.setView(inflaterLayout);

        toast.show();
    }
}

