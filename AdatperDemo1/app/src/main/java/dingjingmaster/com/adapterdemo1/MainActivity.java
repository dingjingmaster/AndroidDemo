package dingjingmaster.com.adapterdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adapter 依次传入：当前上下文、 listView子项布局 id、 数据 即可
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
