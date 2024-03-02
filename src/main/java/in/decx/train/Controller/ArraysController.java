package in.decx.train.Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class ArraysController {

    @GetMapping("/code/TwoSum")
    public String getTwoSumCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/TwoSum.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }
}
