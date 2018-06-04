package dingjingmaster.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<FruitBean> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 200; ++i) {
            FruitBean apple = new FruitBean("apple", android.R.drawable.ic_dialog_email);
            fruitList.add(apple);
            FruitBean banana = new FruitBean("banana", android.R.drawable.ic_btn_speak_now);
            fruitList.add(banana);
        }

        RecyclerView rv = findViewById(R.id.recycler_view);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        // 设置水平布局 默认为 垂直布局
        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv.setLayoutManager(lm);
        FruitAdapter fa = new FruitAdapter(fruitList);
        rv.setAdapter(fa);
    }
}
