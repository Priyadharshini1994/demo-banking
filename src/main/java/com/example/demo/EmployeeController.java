package com.example.demo;
 
import java.net.URI;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 
@RestController
@RequestMapping(path = "/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController 
{
	@Autowired
	private BankRespository employeeRepository;

    @PostMapping(path= "/demo", produces="application/json", consumes = "text/plain")
    public boolean addEmployee(@RequestParam(value = "accountNo") String accountNo,
    		@RequestParam(value = "ifscCode") String ifscCode, @RequestParam(value = "amount") String amount) 
    {
        Bank emp = new Bank();
        int accNo = Integer.valueOf(accountNo);
        System.out.println("sdaf"+accNo);
        if(employeeRepository.existsById(Integer.valueOf(accountNo))) {
        	return false;
        }
        emp.setAccountNo(Integer.valueOf(accountNo));
        emp.setIfscCode(ifscCode);
        emp.setAmount(Integer.valueOf(amount));
        Bank dto = employeeRepository.save(emp);
        return true;
    }
}