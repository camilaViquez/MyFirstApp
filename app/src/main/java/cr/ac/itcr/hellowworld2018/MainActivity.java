package cr.ac.itcr.hellowworld2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instancia del componente, usar nombre que le dimos
        //todos los componentes de xml estan en R
        //usar estandar main_hgahgaj

        Button btnSayHello = (Button) findViewById(R.id.main_btnSayHello);
        btnSayHello.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //instancia de la caja de texto
                EditText etxName = (EditText)findViewById(R.id.main_etxName);
                String name = etxName.getText().toString();
                etxName.setText("Hello World "+name+"!");

            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = this.getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        //jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
        return true;
    }


    //metodo que se encargue de items del menu, click derecho generate overide

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_go_outside:{
                // viajar al otro activity//Intent me permite irme a otro activity, parametro donde estoy y a donde voy
                Intent myIntent = new Intent(MainActivity.this,SayHelloActivity.class);
                //instancia de la caja de texto
                EditText etxName = (EditText)findViewById(R.id.main_etxName);
                String name = etxName.getText().toString();

                myIntent.putExtra("name",name);

                //nos vamos
                startActivity(myIntent);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
