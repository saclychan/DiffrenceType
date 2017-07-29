package ngocamha.com.diffrencetype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.lv);
        ArrayList<Object> objects =  new ArrayList<>();

        Item1Model data1_1  =  new Item1Model("name type 1", R.mipmap.ic_launcher);
        Item1Model data1_2 =  new Item1Model("name of item type 1", R.mipmap.ic_launcher_round);

        Item2Model data_2_1  =  new Item2Model("Item 2 name", "item 2 content ahihi");
        Item2Model data_2_2  = new Item2Model("item 2_2 name", "item 2_2 contnetn cat");
        Item2Model data_2_3  = new Item2Model("item 2_2 name", "item 2_2 contnetn cat");
        Item2Model data_2_4  = new Item2Model("item 2_2 name", "item 2_2 contnetn cat");

        objects.add(data1_1);
        objects.add(data_2_1);
        objects.add(data1_2);
        objects.add(data_2_2);
        objects.add(data_2_3);
        objects.add(data_2_4);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,objects);
        lv.setAdapter(customAdapter);
    }
}
