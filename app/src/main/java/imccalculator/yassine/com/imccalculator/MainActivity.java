package imccalculator.yassine.com.imccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTall;
    private EditText mEditWeight;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTall = (EditText) findViewById(R.id.editTextId);
        mEditWeight = (EditText) findViewById(R.id.editText2Id);
        mButton = (Button) findViewById(R.id.buttonId);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mEditTallVal = mEditTall.getText().toString();

                String mEditWeightVal = mEditWeight.getText().toString();

                if (mEditTallVal.isEmpty() || mEditWeightVal.isEmpty()){

                    Toast.makeText(getApplicationContext(), "Enter Value for both fields", Toast.LENGTH_LONG).show();
                }else {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    intent.putExtra("tall", mEditTallVal);

                    intent.putExtra("weight", mEditWeightVal);

                    startActivity(intent);

                    //startActivity(new Intent(MainActivity.this, SecondActivity.class));

                }

            }
        });
    }

}
