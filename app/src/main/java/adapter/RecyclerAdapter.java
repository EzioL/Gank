package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ezio.gank.R;
import java.util.ArrayList;
import dada.Entity;


/**
 * Created by Ezio on 2016/5/10.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    ArrayList<Entity> list;
    LayoutInflater mInflater;
    Context mContext;

    public RecyclerAdapter(Context context, ArrayList<Entity> list) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_base,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int pos) {
        String desc = list.get(pos).getDesc();
        holder.mTextView.setText(desc);
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
        TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.content_tv );


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

