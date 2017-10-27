package com.example.jongander.dnd5ehelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //TODO: Remake the D20 image so that it has the word enter on it, rather than having a text view over an image. Then reduce onClickListener s accordingly
        final TextView tv = (TextView)findViewById(R.id.tvEnter);
        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String email = ((EditText)findViewById(R.id.etEmail)).getText().toString();
                String password = ((EditText)findViewById(R.id.etPassword)).getText().toString();
                if(Authenticate(email, password)){
                    //TODO Navigate to MainActivity
                    tv.setText("Logged In!");
                    sendMessage();
                }else{
                    tv.setText("Login Failure!");
                }
            }
        });
        final View view = findViewById(R.id.ivD20);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String email = ((EditText)findViewById(R.id.etEmail)).getText().toString();
                String password = ((EditText)findViewById(R.id.etPassword)).getText().toString();
                if(Authenticate(email, password)){
                    //TODO Navigate to MainActivity
                    tv.setText("Logged In!");
                    sendMessage();
                }else{
                    tv.setText("Login Failure!");
                }
            }
        });



        /*
        //final TextView mTextView = (TextView) findViewById(R.id.labelMain);

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://www.dnd5eapi.co/api/spells/1/";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try
                        {
                            JSONObject jObject = new JSONObject(response);
                            mTextView.setText(jObject.getString("_id"));

                        }
                        catch(JSONException ex)
                        {
                            //TODO
                            //ddddddddff
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mTextView.setText("That didn't work!" + error);
            }
        });
// Add the request to the RequestQueue.
        queue.add(stringRequest);
        */
    }

    public void sendMessage(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private boolean Authenticate(String email, String password){
        //TODO replace with real authentication
        if(email.equals("123@123.com") && password.equals("12345")){
            return true;
        }
        else{
            return false;
        }
    }

}
