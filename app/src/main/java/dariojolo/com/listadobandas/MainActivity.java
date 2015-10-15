package dariojolo.com.listadobandas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bandas [] bandas_data = new Bandas[]{
          new Bandas(R.drawable.Logo,"Ramones"),
          new Bandas(R.drawable.Logo,"Attaque 77"),
          new Bandas(R.drawable.Logo,"Heroes del Silencio"),
          new Bandas(R.drawable.Logo,"Jauria"),
          new Bandas(R.drawable.Logo,"Nonpalidece"),
          new Bandas(R.drawable.Logo,"Dancing mood"),
        };

        BandasAdapter adapter = new BandasAdapter(this,R.layout.listview_item,bandas_data);
        lv = (ListView)findViewById(R.id.listView);
        View encabezado = (View)getLayoutInflater().inflate(R.layout.listview_header,null);
        lv.addHeaderView(encabezado);
        lv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
