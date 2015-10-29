package demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PrimeController {

	
	@RequestMapping("/{number}")
	public String findAPrime(@PathVariable("number") int number) {
        //referenced from http://crunchify.com/write-java-program-to-print-fibonacci-series-upto-n-number/

		for(int i=1; i<=number; i++){
            fibonacciRecusion(i);
        }	 
		
		return "done";
	}
	
    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
}
