package newsapi.controller;

import newsapi.objects.Country;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsController {

    // new Country? NewsCategory?

    // new Request?

    @RequestMapping("/news")
    public String news(@RequestParam String category, @RequestParam String country) {
        return "news";

    }
}
