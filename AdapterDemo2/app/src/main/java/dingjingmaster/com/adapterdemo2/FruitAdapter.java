package dingjingmaster.com.adapterdemo2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<FruitBean> {
    private int resourceId;

    // 继承来的 adapter 与adapter一样，构造函数需要传入 上下文context、 子资源id、 数据
    public FruitAdapter(Context context, int textViewResourceId, List<FruitBean> objs) {
        super(context, textViewResourceId, objs);
        resourceId = textViewResourceId;
    }

    // getView 在每个子项滚动到屏幕都会调用
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FruitBean fruit = getItem(position);    // 获取当前项 Fruit id
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView fruitImage = view.findViewById(R.id.fruit_image);
        TextView fruitName = view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());

        return view;
    }
}
