package ch.bbw.ft.Palindrom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalindromController {

  @GetMapping("/palindrom")
  public String showPalindrom(Model model) {
    model.addAttribute("palindrom", new Palindrom());
    return "index";
  }

  @PostMapping("/palindrom")
  public String showResult(@ModelAttribute Palindrom palindrom) {
    if (palindrom.getInput().equals(new StringBuilder(palindrom.getInput()).reverse().toString())) {
      palindrom.setResponse("Ist ein Palindrom.");
    } else {
      palindrom.setResponse("Ist kein Palindrom.");
    }
    return "index";
  }
}
