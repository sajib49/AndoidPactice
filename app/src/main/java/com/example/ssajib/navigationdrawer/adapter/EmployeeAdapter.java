package com.example.ssajib.navigationdrawer.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ssajib.navigationdrawer.R;
import com.example.ssajib.navigationdrawer.model.Employee;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class EmployeeAdapter extends ArrayAdapter<Employee> {

    ArrayList<Employee> employees;
    Context contex;
    public EmployeeAdapter(ArrayList<Employee> employees, Context context) {
        super(context, R.layout.row_employee,employees);
        this.employees = employees;
        this.contex = context;
    }

    private static class ViewHolder{
        TextView tvEmployeeId;
        TextView tvEmployeeCode;
        TextView tvEmployeeName;
        TextView tvSalary;
        TextView tvDoB;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Employee employee = getItem(position);
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater =  LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_employee,parent,false);
            viewHolder.tvEmployeeId = (TextView) convertView.findViewById(R.id.txtEmployeeId);
            viewHolder.tvEmployeeCode = (TextView) convertView.findViewById(R.id.txtEmployeeCode);
            viewHolder.tvEmployeeName = (TextView) convertView.findViewById(R.id.txtEmployeeName);
            viewHolder.tvSalary = (TextView) convertView.findViewById(R.id.txtSalary);
            viewHolder.tvDoB = (TextView) convertView.findViewById(R.id.txtDoB);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvEmployeeId.setText(String.valueOf(employee.EmployeeId));
        viewHolder.tvEmployeeCode.setText(employee.EmployeeCode);
        viewHolder.tvEmployeeName.setText(employee.EmployeeName);
        viewHolder.tvSalary.setText(String.valueOf(employee.Salary));
        DateFormat dateInstance = new SimpleDateFormat("dd-MMM-yyyy");
        viewHolder.tvDoB.setText(dateInstance.format(employee.DoB));
        return convertView;
    }
}

