package com.example.cuhostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity
{
    private TextInputLayout usernameTextInputLayout,passwordTextInputLayout;
    private TextInputEditText usernameEditText, passwordEditText;
    private RadioGroup genderRadioGroup;
    private RadioButton maleRadioButton, femaleRadioButton;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameTextInputLayout = findViewById(R.id.filledTextField);
        passwordTextInputLayout = findViewById(R.id.textInputLayout);
        usernameEditText = findViewById(R.id.edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        genderRadioGroup = findViewById(R.id.radioGroup);
        maleRadioButton = findViewById(R.id.option1);
        femaleRadioButton = findViewById(R.id.option2);
        submitButton = findViewById(R.id.outlined_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    private void login()
    {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if(username.isEmpty() || password.isEmpty())
        {
            Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show();
            return;
        }

        if(genderRadioGroup.getCheckedRadioButtonId()==-1)
        {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show();
            return;
        }
        if(username.equals("admin") && password.equals("admin"))
        {
            if(maleRadioButton.isChecked())
            {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("value1","admin");
                startActivity(i);
            }
            else if (femaleRadioButton.isChecked())
            {
               Intent i = new Intent(MainActivity.this,MainActivity3.class);
               i.putExtra("value1","admin");
               startActivity(i);
            }
        }

    }

}