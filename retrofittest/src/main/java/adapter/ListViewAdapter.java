package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ezio.retrofittest.R;

import java.util.ArrayList;

import model.Result;

/**
 * Created by 李浩田 on 2016/5/5.
 */
public class ListViewAdapter extends BaseAdapter {
    private ArrayList<Result> mDataList;
    LayoutInflater mInflater;
    Context mContext;

    public ListViewAdapter( Context context,ArrayList<Result> dataList) {
        mDataList = dataList;
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            holder.mImageView = (ImageView) convertView.findViewById(R.id.image);
            holder.mTextView= (TextView) convertView.findViewById(R.id.text);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide
                .with(mContext)
                .load(mDataList.get(position).getUrl())
                .into(holder.mImageView);
        holder.mTextView.setText(mDataList.get(position).getType());
        return convertView;
    }
    class ViewHolder{
        ImageView mImageView;
        TextView mTextView;
    }
}
