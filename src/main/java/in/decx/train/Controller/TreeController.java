package in.decx.train.Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@Controller
public class TreeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/code/SymmetricTree")
    public String getCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/SymmetricTree.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }


}
