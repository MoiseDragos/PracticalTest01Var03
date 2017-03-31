package ro.pub.cs.systems.eim.practicaltest01var03.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import ro.pub.cs.systems.eim.practicaltest01var03.R;

public class PracticalTest01Var03MainActivity extends AppCompatActivity {

    private EditText rightEditText = null;
    private Button leftButton = null;
    private Button navigateToSecondaryActivityButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var03_main);
    }
}
