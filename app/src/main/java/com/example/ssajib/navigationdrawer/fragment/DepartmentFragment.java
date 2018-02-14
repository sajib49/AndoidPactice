package com.example.ssajib.navigationdrawer.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ssajib.navigationdrawer.R;
import com.example.ssajib.navigationdrawer.adapter.DepartmentAdapter;
import com.example.ssajib.navigationdrawer.model.Department;

/**
 * A simple {@link Fragment} subclass.
 */
public class DepartmentFragment extends Fragment {


    public DepartmentFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_department, container, false);
        ListView lvDepartment =(ListView) view.findViewById(R.id.lvDepartment);
        Button btnGetDepartment = (Button) view.findViewById(R.id.btnGetDepartment);
        Button btnClearDepartment = (Button) view.findViewById(R.id.btnClearDepartment);

        final Department department = new Department();
        DepartmentAdapter departmentAdapter = new DepartmentAdapter(department.GetDepartments(),getActivity());
        lvDepartment.setAdapter(departmentAdapter);

        lvDepartment.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),department.GetDepartments().get(position).DepartmentName,Toast.LENGTH_LONG).show();
            }
        });

        btnGetDepartment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"jbhjbhbhbhbhbh",Toast.LENGTH_LONG).show();
            }
        });

        btnClearDepartment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"jbhjbhbhbhbhbh",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
