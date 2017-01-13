package imccalculator.yassine.com.imccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;

    DecimalFormat round = new DecimalFormat("0.0");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = (TextView) findViewById(R.id.myTextView);

        Bundle extras = getIntent().getExtras();

        if (extras != null){

            Double mEditTallValDouble = Double.parseDouble(extras.getString("tall"));

            Double mEditWeightValDouble = Double.parseDouble(extras.getString("weight"));

            Double imcResult = calculImc(mEditTallValDouble, mEditWeightValDouble);

            String imcResultString = String.valueOf(round.format(imcResult));

            mTextView.setText("Votre IMC est de " + imcResultString);

        }

    }

    public Double calculImc(double tall, double weight){

        double result;

        result = weight/(tall * tall);

        return result;
    }
}
