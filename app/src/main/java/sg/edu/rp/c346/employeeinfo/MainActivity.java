package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeInfo> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewInfo);

        alEmployeeList = new ArrayList<>();
       EmployeeInfo item1 = new EmployeeInfo("John", "Software Technology Leader",3400.0);
        EmployeeInfo item2 = new EmployeeInfo("May", "Programmer",2200.0);
        EmployeeInfo item3 = new EmployeeInfo("Jensen", "Programmer",2500.0);
        EmployeeInfo item4 = new EmployeeInfo("Ahmed", "Programmer",2500.0);


        alEmployeeList.add(item1);
        alEmployeeList.add(item2);
        alEmployeeList.add(item3);
        alEmployeeList.add(item4);

        caEmployee = new CustomAdapter(this,R.layout.layout_info, alEmployeeList);
        lvEmployee.setAdapter(caEmployee);
    }
}
