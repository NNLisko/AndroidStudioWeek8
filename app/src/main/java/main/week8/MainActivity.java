package main.week8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText inputNumberField1;
    private EditText inputNumberField2;
    private TextView resultField;
    private Button additionButton;
    private Button substractButton;
    private Button multiplyButton;
    private Button divisionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputNumberField1 = findViewById(R.id.inputNumberField1);
        inputNumberField2 = findViewById(R.id.inputNumberField2);
        resultField = findViewById(R.id.resultView);
        additionButton = findViewById(R.id.additionButton);
        substractButton = findViewById(R.id.substractButton);
        multiplyButton = findViewById(R.id.multiplierButton);
        divisionButton = findViewById(R.id.divisionButton);

        
    }
}