package in.learncodewithrk.phonenumberverificationui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView otp;
    Button generate_otp;
    EditText mobile_number;
    androidx.appcompat.widget.Toolbar toolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        generate_otp = (Button)findViewById(R.id.generate_otp);
        generate_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this,otpActivity.class);
                startActivity(streamIntent);
            }
        });
    }



}
