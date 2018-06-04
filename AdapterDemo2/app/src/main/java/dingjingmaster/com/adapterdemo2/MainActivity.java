package dingjingmaster.com.adapterdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<FruitBean> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化水果
        for (int i = 0; i < 200; ++i) {
            FruitBean apple = new FruitBean("Apple", android.R.drawable.ic_menu_report_image);
            fruitList.add(apple);
            FruitBean banana = new FruitBean("banana", android.R.drawable.ic_dialog_email);
            fruitList.add(banana);
        }
        //
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_layout, fruitList);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
