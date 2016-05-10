package adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ezio.gank.R;
import java.util.ArrayList;
import dada.Entity;
import fragment.VideoFragment;

/**
 * Created by Ezio on 2016/5/9.
 */
public class MyAdapter extends BaseAdapter {
    ArrayList<Entity> list;
    LayoutInflater mInflater;
    Context mContext;

    public MyAdapter(Context context, ArrayList<Entity> list) {
        mContext = context;
        this.list = list;
        mInflater = LayoutInflater.from(mContext);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;
        if (convertView ==null){
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_android,null);
            holder.mTextView = (TextView) convertView.findViewById(R.id.content_tv);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        String desc = list.get(position).getDesc();
        holder.mTextView.setText(desc);
        return convertView;
    }
    class ViewHolder{
        TextView mTextView;
    }
}
