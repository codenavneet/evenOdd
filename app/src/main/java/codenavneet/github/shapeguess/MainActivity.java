package codenavneet.github.shapeguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message;

    public class number{
        int n;
        public void isEven(){
            if(n%2==0)
            {
                message="This is an even number!";
            }
            else    {
                message="this is an odd number!";
            }
        }
    }

    public void clicked(View view){
        Log.i("info","button pressed");
        EditText editTextNumber=(EditText)findViewById(R.id.editTextNumber);
        number num=new number();
        num.n=Integer.parseInt(editTextNumber.getText().toString());
        num.isEven();
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}