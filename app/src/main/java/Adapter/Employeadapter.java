package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.base.rxjava2retrofit.Employee;
import com.base.rxjava2retrofit.R;

import java.util.List;

public class Employeadapter extends RecyclerView.Adapter<Employeadapter.EmployeViewHolder> {
  public List<Employee>employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public EmployeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_main,parent,false);
        return new EmployeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeViewHolder holder, int position) {
      Employee employee=employees.get(position);
      holder.textViewname.setText(employee.getFName());
      holder.textViewLastname.setText(employee.getLName());
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class EmployeViewHolder extends RecyclerView.ViewHolder{
      private TextView textViewname;
      private TextView textViewLastname;
        public EmployeViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewname=itemView.findViewById(R.id.textViewname);
            textViewLastname=itemView.findViewById(R.id.textViewlastname);
        }
    }
}
