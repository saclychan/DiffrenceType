package ngocamha.com.diffrencetype;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PL on 7/25/2017.
 */

public class CustomAdapter extends BaseAdapter{
    private static final int MAX = 2;
    private static final int TYPE_1 = 0;
    private static final int TYPE_2 = 1;

    Context mContext;
    LayoutInflater mInflate;

    ArrayList<Object> mData;

    public CustomAdapter(Context mContext, ArrayList<Object> mData) {
        this.mContext = mContext;
        this.mData = mData;
        mInflate = LayoutInflater.from(mContext);
    }

    @Override
    public int getViewTypeCount() {
        return MAX;
    }
//
    @Override
    public int getItemViewType(int position) {
        Log.d("POS", "POS=" + position);


        if(mData.get(position) instanceof Item1Model){
            return TYPE_1;
        }else{
            return TYPE_2;
        }

    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        Log.d("POSIIII", "POSIIII=" + i);
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        int currentType = getItemViewType(i);
        Log.d("DAP", "curent=" + currentType);
        Log.d("DAP", "i=" + i);
        switch (currentType){
            case TYPE_1:
                Item1Holder item1Holder;
                if(view == null){
                    item1Holder = new Item1Holder();
                    view = mInflate.inflate(R.layout.item_type_1, viewGroup, false);
                    item1Holder.tvItem1Name = (TextView) view.findViewById(R.id.tv_type1_name);
                    item1Holder.ivItem1ImageView = (ImageView) view.findViewById(R.id.iv_type1_thumb);
                    view.setTag(item1Holder);
                }else{
                    item1Holder  = (Item1Holder) view.getTag();
                }
                Item1Model item1Model = (Item1Model) mData.get(i);
                item1Holder.tvItem1Name.setText( item1Model.getName() );
                item1Holder.ivItem1ImageView.setImageResource(item1Model.getId());
                break;

            case TYPE_2:
                Item2Holder item2Holder ;
                if(view == null){
                    item2Holder = new Item2Holder();
                    view = mInflate.inflate(R.layout.item_type_2, viewGroup, false);
                    item2Holder.tvItem2Name  = (TextView) view.findViewById(R.id.tv_type2_name);
                    item2Holder.tvItem2Content  = (TextView) view.findViewById(R.id.tv_type2_content);
                    view.setTag(item2Holder);
                } else{
                    item2Holder = (Item2Holder) view.getTag();
                }
                Item2Model  item2Model = (Item2Model) mData.get(i);
                item2Holder.tvItem2Name.setText( item2Model.getName()  );
                item2Holder.tvItem2Content.setText(item2Model.getContent());

               break;
        }
        return view;

    }

    public static class Item1Holder{
        TextView tvItem1Name;
        ImageView ivItem1ImageView;
    }
    public static class Item2Holder {
        TextView tvItem2Name;
        TextView tvItem2Content;
    }
}
