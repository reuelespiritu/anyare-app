package edu.dlsu.mobidev.anyare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button registerSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerSubmit = (Button) findViewById(R.id.register_submit);

        registerSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent(); //this intent just carries data

                setResult(RESULT_OK, data);
                //go back to original instance of Main Activity
                finish(); //kills this activity
            }
        });
    }
}
