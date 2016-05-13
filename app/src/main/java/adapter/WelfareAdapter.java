package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ezio.gank.R;
import java.util.ArrayList;
import dada.Entity;
import view.WelfareImageView;


/**
 * Created by Ezio on 2016/5/10.
 */
public class WelfareAdapter extends RecyclerView.Adapter<WelfareAdapter.ViewHolder>{

    ArrayList<Entity> list;
    LayoutInflater mInflater;
    Context mContext;

    public WelfareAdapter(Context context, ArrayList<Entity> list) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_welf,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int pos) {
        String url = list.get(pos).getUrl();
        String who = list.get(pos).getWho();

        Glide.with(mContext)
                .load(url)
                .centerCrop()
                .placeholder(R.color.colorPrimary)
                .crossFade()
                .into(holder.mImageView);
       // holder.mTextView.setText(who);
        if (mOnItemClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(holder.itemView,pos);
                }
            });
        }


    }
    //定义一个接口
    public interface OnItemClickListener{
        void onItemClick(View view , int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.mOnItemClickListener = onItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.image_welf);
           // mTextView  = (TextView) itemView.findViewById(R.id.text_who);


            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     if (mOnItemClickListener != null){
                         mOnItemClickListener.onItemClick(v,);
                     }
                }
            });*/
        }
    }
}

