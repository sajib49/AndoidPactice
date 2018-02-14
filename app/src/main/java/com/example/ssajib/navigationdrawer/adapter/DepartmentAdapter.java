package com.example.ssajib.navigationdrawer.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ssajib.navigationdrawer.R;
import com.example.ssajib.navigationdrawer.model.Department;

import java.util.ArrayList;

/**
 * Created by ssajib on 11-Feb-2018.
 */

public class DepartmentAdapter extends ArrayAdapter<Department> {

    private static class DepartmentViewHolder{
        TextView tvDepartmentId;
        TextView tvDepartmentName;
        TextView tvNoOfEmployees;
        TextView tvDepartmentHead;
    }

    ArrayList<Department> departments;
    Context context;
    public DepartmentAdapter(ArrayList<Department> departments,Context context) {
        super(context, R.layout.row_department,departments);
        this.departments = departments;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Department department = getItem(position);
        DepartmentViewHolder departmentViewHolder;
        if(convertView == null){
            departmentViewHolder = new DepartmentViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.row_department,parent,false);
            departmentViewHolder.tvDepartmentId =(TextView) convertView.findViewById(R.id.txtDeptId);
            departmentViewHolder.tvDepartmentName =(TextView) convertView.findViewById(R.id.txtDeptName);
            departmentViewHolder.tvNoOfEmployees =(TextView) convertView.findViewById(R.id.txtNoOfEmployees);
            departmentViewHolder.tvDepartmentHead =(TextView) convertView.findViewById(R.id.txtDeptHead);

            convertView.setTag(departmentViewHolder);
        }
        else{
            departmentViewHolder =(DepartmentViewHolder) convertView.getTag();
        }
        departmentViewHolder.tvDepartmentId.setText(String.valueOf(department.DepartmentId));
        departmentViewHolder.tvDepartmentName.setText(department.DepartmentName);
        departmentViewHolder.tvDepartmentHead.setText(department.DepartmentHeadName);
        departmentViewHolder.tvNoOfEmployees.setText(String.valueOf(department.NoOfEmployee));
        return convertView;
    }
}

