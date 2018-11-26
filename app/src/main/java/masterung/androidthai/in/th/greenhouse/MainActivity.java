package masterung.androidthai.in.th.greenhouse;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //    Explicit
    private String numberString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Setup Color
        TextView textView = findViewById(R.id.txtNumber);
        textView.setTextColor(Color.BLUE);

//        Connected Database Firebase
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();




    }   // Main Method

}   // Main Class
