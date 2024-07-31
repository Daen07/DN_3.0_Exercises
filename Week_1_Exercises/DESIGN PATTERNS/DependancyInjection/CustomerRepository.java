package deptInjection;

public interface CustomerRepository {
    Customer findCustomerById(int id);
}