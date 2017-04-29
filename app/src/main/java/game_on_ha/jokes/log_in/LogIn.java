package game_on_ha.jokes.log_in;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import game_on_ha.jokes.R;

import static java.security.AccessController.getContext;

public class LogIn extends AppCompatActivity {
    Context context;

    Button btnLogIn;

    EditText etUserName;
    EditText etPassword;

    TextInputLayout textInputUserName;
    TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        setViews();
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateUserName() && validatePassword()) {

                    Toast.makeText(LogIn.this, "Please check the number you entered", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    private boolean validateUserName() {

        if (etUserName.getText().toString().isEmpty()) {

            textInputUserName.setError("Username cannot be blank");
            return false;
        } else {
            textInputUserName.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validatePassword() {

        String paw = etPassword.getText().toString().trim();
        if (paw.length() < 8) {

            textInputPassword.setError("Minimum 8 charter required");
            return false;
        } else {
            textInputPassword.setErrorEnabled(false);
            return true;
        }
    }

    private void setViews() {
        etUserName = (EditText) findViewById(R.id.username);
        etPassword = (EditText) findViewById(R.id.password);

        textInputUserName = (TextInputLayout) findViewById(R.id.username_layout);
        textInputPassword = (TextInputLayout) findViewById(R.id.password_layout);

        btnLogIn = (Button) findViewById(R.id.login_btn);

    }
}
