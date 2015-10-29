package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bbyers on 10/29/15.
 */

@RestController
public class KillController {

    @RequestMapping("/kill")
    public void kill() {
        System.out.println("Killing instance");
        System.exit(0);
    }
}
