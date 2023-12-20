package luihin903.series;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class SeriesController {
    
    @GetMapping("/少年謝爾頓/{season}/{ep}")
    public String sheldon(@PathVariable("season") String season, @PathVariable("ep") int ep, Model model) {
        model.addAttribute("season", season);
        model.addAttribute("ep", ep);
        return "少年謝爾頓";
    }

}
