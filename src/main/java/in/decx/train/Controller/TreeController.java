package in.decx.train.Controller;

import in.decx.train.Problems.Demo;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class TreeController {

    @GetMapping("/code/SymmetricTree")
    public String getCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/SymmetricTree.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }

    @GetMapping("/code/hello")
    public String helloWorld() {
        return "hello";
    }
}
