package server.controllers;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ImageController {

    private Path rootLocation = Paths.get("src","main", "resources", "images");

    @ResponseBody
    @RequestMapping(value = "/getImage", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImageAsByteArray(@RequestParam String name) throws IOException {;
        Path file = rootLocation.resolve(name + ".jpg");
        Resource resource = new UrlResource(file.toUri());
        return IOUtils.toByteArray(resource.getInputStream());
    }
}
