package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {
    //referenced from http://crunchify.com/write-java-program-to-print-fibonacci-series-upto-n-number/
	
	@RequestMapping("/small")
	public String small() {
        fibonacci(15);
		return "done";
	}

    @RequestMapping("/medium")
    public String medium() {
        fibonacci(35);
        return "done";
    }

    @RequestMapping("/large")
    public String large() {
        fibonacci(37);
        return "done";
    }

    @RequestMapping("/xlarge")
    public String xlarge() {
        fibonacci(40);
        return "done";
    }

    private void fibonacci(int number) {
        for(int i=1; i<=number; i++){
            fibonacciRecusion(i);
        }
    }
	
    private int fibonacciRecusion(int number){
        if (number == 1 || number == 2) {
            return 1;
        }
 
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
}
