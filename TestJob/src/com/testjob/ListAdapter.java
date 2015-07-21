package com.testjob;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter  extends BaseAdapter
{
	LayoutInflater mInflater = null;
	Context context;

	List<Property> listrow =  new ArrayList<Property>();

	int[] images = {R.drawable.tumblr,R.drawable.twitter,R.drawable.whatsapp};

	public ListAdapter(Context c) {
		// TODO Auto-generated constructor stub

		for (int i = 1; i <= 10000; i++) {

			Property prop = new Property();
			Random r = new Random();
			int i1 = r.nextInt(3 - 0) + 0;

			prop.setTextrow("Row number "+i);
			prop.setImagerow(images[i1]);

			listrow.add(prop);

		}


		context = c;
		mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listrow.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		final ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = mInflater.inflate(
					R.layout.cust_list, null);
			holder.textappname = (TextView) convertView.findViewById(R.id.tv_row);
			holder.imgrow = (ImageView)convertView.findViewById(R.id.iv_profileimage);
			convertView.setTag(holder);
		}
		else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.textappname.setText(listrow.get(position).getTextrow());

		holder.imgrow.setImageResource(listrow.get(position).getImagerow());

		return convertView;
	}

	class ViewHolder {
		//		ImageView imageview_menu;
		TextView textappname;
		ImageView imgrow;


	}

}
