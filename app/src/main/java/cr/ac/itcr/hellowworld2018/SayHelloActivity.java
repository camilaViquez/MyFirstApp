package cr.ac.itcr.hellowworld2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SayHelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello);

        //instancia del lable/text View
        TextView txvGreeting = (TextView)findViewById(R.id.sayHello_txtGreeting);

        //recuperar parametros
        Bundle myBundle = this.getIntent().getExtras();
        String name = myBundle.get("name").toString();

        txvGreeting.setText("Hellow World "+name+"!");
    }
}
