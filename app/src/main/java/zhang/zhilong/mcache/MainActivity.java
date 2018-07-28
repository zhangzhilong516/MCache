package zhang.zhilong.mcache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import zhang.zhilong.mcache.cache.DiskCache;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv);

        DiskCache diskCache = new DiskCache(this);

        textView.setText(diskCache.get("test"));
    }
}
