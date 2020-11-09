package Api;

import com.base.rxjava2retrofit.Employee;
import com.base.rxjava2retrofit.EmployeeResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Apiservice {
    @GET("testTask.json")
    Observable<EmployeeResponse>getEmployes();
}
