package hello;

import java.util.concurrent.atomic.AtomicLong;

import hello.mapper.AbstractPeople;
import hello.mapper.ImmutablePeople;
import hello.mapper.PersonMapper;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetings")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping(path = "/info", method = RequestMethod.POST)
    public Greeting info(@RequestBody Greeting g1) {
        return g1;
    }


    @Autowired
    private PersonMapper mapper;

    @RequestMapping(path="/person", method= RequestMethod.POST)
    public AbstractPeople person(@RequestBody AbstractPeople p) {
        System.out.println("people is " + p);
//        mapper.insert(p);
        return p;
    }
}