package game_on_ha.jokes.log_in;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import game_on_ha.jokes.R;

public class SignUp extends AppCompatActivity {

    Button btnSignUp;
    EditText etUserName;
    EditText etPassword;
    EditText etCnfPassword;

    TextInputLayout textInputUserName;
    TextInputLayout textInputPassword;
    TextInputLayout textInputPassword_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setViews();
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
        String pawCnf = etCnfPassword.getText().toString().trim();

        if (paw.length() < 8) {

            textInputPassword.setError("Minimum 8 charter required");
            return false;
        }
        else if (pawCnf!=paw){

            textInputPassword_sign_up.setError("password not match");

        }
        else {
            textInputPassword.setErrorEnabled(false);
        }
        return true;
    }

    /*private boolean validateCnfPassword() {

        String pawCnf = etCnfPassword.getText().toString().trim();
        if (pawCnf.length() < 8 & pawCnf!= etPassword.getText().toString().trim()) {

            textInputPassword.setError("password not match");
            return false;
        } else {
            textInputPassword.setErrorEnabled(false);
            return true;
        }
    }*/


    private void setViews() {
        etUserName = (EditText) findViewById(R.id.username_sign_up);
        etPassword = (EditText) findViewById(R.id.password_sign_up);
        etCnfPassword = (EditText) findViewById(R.id.cnf_password_sign_up);

        textInputUserName = (TextInputLayout) findViewById(R.id.username_layout_sign_up);
        textInputPassword = (TextInputLayout) findViewById(R.id.password_layout_sign_up);
        textInputPassword_sign_up = (TextInputLayout) findViewById(R.id.password_layout_sign_up);

        btnSignUp = (Button) findViewById(R.id.signup_btn);




        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validateUserName() && validatePassword() && validatePassword()) {

                    Toast.makeText(SignUp.this, "Please check the number you entered", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
