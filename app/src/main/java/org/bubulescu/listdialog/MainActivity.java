package org.bubulescu.listdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnJezik;
    private TextView tvJezici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJezik = findViewById(R.id.btnJezik);
        tvJezici = findViewById(R.id.tvJezici);

        btnJezik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListDialog listDialog = new ListDialog();
                listDialog.show(getSupportFragmentManager(), "ld");
            }
        });

    }

    public void setLanguageTextViev(String language) {
        tvJezici.setText(language);
    }
}
