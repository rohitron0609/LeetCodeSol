package in.decx.train.Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class TreeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/code/SymmetricTree")
    public String getSymmetricTreeCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/SymmetricTree.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }

    @GetMapping("/code/InvertBinaryTree")
    public String getInvertBinaryTreeCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/InvertBinaryTree.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }

    @GetMapping("/code/MergeBinaryTrees")
    public String getMergeBinaryTreeCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/MergeBinaryTrees.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }
    @GetMapping("/code/LargestValueInEachTreeRow")
    public String getLargestValueInEachTreeRowCode() throws IOException {
        ClassPathResource resource = new ClassPathResource("Codes/LargestValueInEachTreeRow.java");
        String data = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return "<pre>" + data + "</pre>";
    }

}
