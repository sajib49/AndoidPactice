package com.example.ssajib.navigationdrawer.fragment;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Context;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ssajib.navigationdrawer.MainActivity;
import com.example.ssajib.navigationdrawer.R;
import com.example.ssajib.navigationdrawer.adapter.EmployeeAdapter;
import com.example.ssajib.navigationdrawer.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmployeeFragment extends Fragment {


    public EmployeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_employee, container, false);
        ListView employeeListView =(ListView) view.findViewById(R.id.lvEmployee);

        Employee aEmployee = new Employee();
       final ArrayList<Employee> emps = aEmployee.GetEmployees();
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(emps,getActivity());
        employeeListView.setAdapter(employeeAdapter);

        employeeListView.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("Do you want to logout?");
                alert.setMessage("Message");

                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(getActivity(),"You have pressed Ok",Toast.LENGTH_LONG).show();
                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(getActivity(),"You have pressed cancel",Toast.LENGTH_LONG).show();
                            }
                        });

                alert.show();
               // Toast.makeText(getActivity(),emps.get(position).EmployeeName,Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
