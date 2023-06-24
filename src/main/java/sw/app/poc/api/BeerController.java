package sw.app.poc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sw.app.poc.models.response.Beer;

@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {

    @GetMapping("/random")
    public Beer getRandomBeer() {
        return new Beer(1, "Mango Sour");
    }
}
