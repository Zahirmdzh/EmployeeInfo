package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17042725 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeInfos;

    public CustomAdapter(@NonNull Context context, int resource,@NonNull ArrayList<EmployeeInfo> employeeInfos) {
        super(context, resource, employeeInfos);
        this.parent_context = context;
        this.layout_id = layout_id;
        this.employeeInfos = employeeInfos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    View rowView = inflater.inflate(layout_id, parent, false);
    TextView tvName = rowView.findViewById(R.id.tvName);
    TextView tvTitle = rowView.findViewById(R.id.tvTitle);
    TextView tvSalary = rowView.findViewById(R.id.tvSalary);

    EmployeeInfo currentInfo = employeeInfos.get(position);
        tvName.setText(currentInfo.getEmployeeName());
        tvTitle.setText(currentInfo.getEmployeeTitle());
        tvSalary.setText(currentInfo.getEmployeeSalary()+ "");

        return rowView;
   }

}
