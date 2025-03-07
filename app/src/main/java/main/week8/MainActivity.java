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

    Double n1, n2;

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

        Button additionButton;
        Button substractButton;
        Button multiplyButton;
        Button divisionButton;

        inputNumberField1 = findViewById(R.id.inputNumberField1);
        inputNumberField2 = findViewById(R.id.inputNumberField2);
        resultField = findViewById(R.id.resultView);
        additionButton = findViewById(R.id.additionButton);
        substractButton = findViewById(R.id.substractButton);
        multiplyButton = findViewById(R.id.multiplierButton);
        divisionButton = findViewById(R.id.divisionButton);

        additionButton.setOnClickListener(e -> addition());
        substractButton.setOnClickListener(e -> subtraction());
        divisionButton.setOnClickListener(e -> division());
        multiplyButton.setOnClickListener(e -> multiplication());

    }

    private void addition() {
        n1 = Double.parseDouble(inputNumberField1.getText().toString());
        n2 = Double.parseDouble(inputNumberField2.getText().toString());
        System.out.println("adding");
        updateResult(n1 + n2);
    }

    private void subtraction() {
        n1 = Double.parseDouble(inputNumberField1.getText().toString());
        n2 = Double.parseDouble(inputNumberField2.getText().toString());
        System.out.println("subtracting");
        updateResult(n1 - n2);
    }

    private void multiplication() {
        n1 = Double.parseDouble(inputNumberField1.getText().toString());
        n2 = Double.parseDouble(inputNumberField2.getText().toString());
        System.out.println("multiplying");
        updateResult(n1 * n2);
    }

    private void division() {
        n1 = Double.parseDouble(inputNumberField1.getText().toString());
        n2 = Double.parseDouble(inputNumberField2.getText().toString());
        if (!n2.equals(0d)) {
            System.out.println("dividing");
            updateResult(n1 / n2);
        } else {
            resultField.setText("Zero division");
        }
    }

    private void updateResult(Double result) {
        if (result == result.intValue()) {
            resultField.setText(String.valueOf(result.intValue()));
        } else {
            resultField.setText(String.format("%.2f", result));
        }
    }
}